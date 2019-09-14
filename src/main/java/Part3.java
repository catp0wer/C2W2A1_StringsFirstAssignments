public class Part3 {
    //his method returns true if 'searchText' appears at least twice in 'texta', otherwise it returns false
    public boolean twoOccurrences (String texta, String searchText) {
        int count=0;
        boolean s=false;
      int startSearchingIndex=0;

      while(startSearchingIndex<texta.length()){
          int x=texta.indexOf(searchText,startSearchingIndex);
          if(x==-1){
              break;}
          else {count++;}
          startSearchingIndex=searchText.length()+x;

      } if(count>=2){
          s= true;
            System.out.println("Number of occurences = "+count);
        }
      else{
          s=false;
            System.out.println("Number of occurences = "+count);
        }
      return s;

    }

    //this method calls twoOccurrences on several pairs of strings and
    // prints the strings and the result of calling twoOccurrences (true or false) for each pair
    public void testing(){
        String searchText = "by";
        System.out.println("The searching text is: " +searchText);

        String text="obyzxyhbylmn";
        System.out.println("The text in which searching take place "+text);
        Boolean occ = twoOccurrences(text,searchText);
        System.out.println(occ);

        text="ozxyhbylmn";
        System.out.println("The text in which searching take place "+text);
        occ = twoOccurrences(text,searchText);
        System.out.println(occ);

        text="ozxyhlmn";
        System.out.println("The text in which searching take place "+text);
        occ = twoOccurrences(text,searchText);
        System.out.println(occ);

        text="bydefault";
        System.out.println("The text is "+text);
        String remainedText = lastPart(text,searchText);
        System.out.println(remainedText);

        text="default";
        System.out.println("The text is "+text);
        remainedText = lastPart(text,searchText);
        System.out.println(remainedText);

    }
    //this method finds the first occurrence of 'searchText' in 'texta', and returns the part of 'texta' that follows
    // 'searchText'
    // if 'searchText' does not occur in 'texta', then return 'texta'
    public String lastPart(String texta, String searchSintagme){
        int firstOccuranceIndex=texta.indexOf(searchSintagme);
        int indexOfRemainedText = firstOccuranceIndex+searchSintagme.length();
        if(firstOccuranceIndex==-1){
            return texta;
        }
        else {
            return texta.substring(indexOfRemainedText);
        }
    }
}
