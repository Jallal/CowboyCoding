package stringManipulation;

public class UpperCaseLettersAfterDash {

/**
 * 
 *  convert any character after '-' or underscore '_' to upper case
 * 
 * example : 
 * 
 * Jallal_elhazzat -> JallalElhazzat
 * Jallal-elhazzat -> JallalElhazzat
 * 
 * 
 * 
*/



    public String convertCharAfterUnderscoreAndDash(String str){

        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;

        for(char ch : str.toCharArray()){

            if(ch=='_' || ch=='-'){

                toUpperCase = true;
            } else if(toUpperCase && Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
                toUpperCase = false;
            }else{
                result.append(ch);
                toUpperCase = false;
            }

        }


        return result.toString();
    }

}
