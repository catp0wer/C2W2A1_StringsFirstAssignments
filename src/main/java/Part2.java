public class Part2 {

    public String findSimpleGene(String dna, int startPosition, int endPosition) {
        String result = "";
        //if no ATG in string (it means -1) than return empty string
        if (startPosition == -1) {
            return "";
        }
        //  int endPosition = dna.indexOf("TAA",startPosition+3);
        if (endPosition == -1) {
            return "";
        }
        result = dna.substring(startPosition, endPosition + 3);
        //The valid gene is that one which is divisible by 3
        if ((startPosition - endPosition + 3) % 3 != 0) {
            return "This is invalid gene";
        }
        return result;
    }

    public void testSimpleGene() {
        String[] dnae = {"XCCDFVFDTAAFDC", "VVATGCDFVGBFDC", "MKJCDFVGBFDC", "VVCATGCDFVGBTAAFDC", "LVUATGCDFMBTAAFDC"};
        for (int i = 0; i < dnae.length; i++) {
            System.out.println(dnae[i]);
            //find the index of first occurrence of ATG(if more specific- the index of A from ATG)
            int startPosition = dnae[i].indexOf("ATG");
            int endPosition = dnae[i].indexOf("TAA");
            String gene = findSimpleGene(dnae[i], startPosition, endPosition);
            System.out.println("Gene is "+gene);
        }

    }
}


