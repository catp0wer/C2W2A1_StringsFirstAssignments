public class Part1 {

    public String findSimpleGene(String dna) {
        String result = "";
        //find the index of first occurrence of ATG(if more specific- the index of A from ATG)
        int startPosition = dna.indexOf("ATG");
        //if no ATG in string (it means -1) than return empty string
        if (startPosition == -1) {
            return "";
        }
        int endPosition = dna.indexOf("TAA",startPosition+3);
        if (endPosition == -1) {
            return "";
        }
        result = dna.substring(startPosition,endPosition+3);
        //The valid gene is that one which is divisible by 3
        if ((startPosition-endPosition+3)%3!=0){
        return "This is invalid gene";
        }
        return result;
    }

    public void testSimpleGene(){
        //here are different strings for testing
        String dna = "XCCDFVFDTAAFDC";
        System.out.println("DNA with no ATG "+ dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " +gene);

        dna = "VVATGCDFVGBFDC";
        System.out.println("DNA with no TAA "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " +gene);

        dna = "MKJCDFVGBFDC";
        System.out.println("DNA with no ATG & TAA "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " +gene);

        dna = "VVCATGCDFVGBTAAFDC";
        System.out.println("DNA with ATG & TAA (difference multiplied by 3) "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " +gene);

        dna = "LVUATGCDFMBTAAFDC";
        System.out.println("DNA with ATG & TAA (difference not multiplied by 3) "+ dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " +gene);
    }

}
