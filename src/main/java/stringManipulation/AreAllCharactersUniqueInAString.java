package stringManipulation;

public class AreAllCharactersUniqueInAString {

    
    /**
     *  Function that check if all characters are unique in a string
     * 
     * 
     * 
    */

    public boolean areAllCharactersUniqueInAString(String str){

       if(str.length() > 128){ //Assuming ASCII character set
        return false;
       }

       boolean[] charSet = new boolean[128];
       for(int i=0; i< str.length(); i++){
          int val = str.charAt(i);
          if(charSet[val]){ //if character already found
            return false;
          } 
          charSet[val]=true;
       }

       return true;
    }
}
