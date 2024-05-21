

public class OccurencesOfCertainCharacters {


public static int countingOccurencesOfCertainCharacters(String str, char ch){

    return  str.length() - str.replace(String.valueOf(ch), "").length();
}

public static int countingOccurencesOfCertainCharactersV2(String str, char ch){

    int count =0;

    for(int i=0; i < str.length(); i++ ){

        if(str.charAt(i) == ch){
            count++;
        }
    }
    return count;
}

public static long countingOccurencesOfCertainCharactersV3(String str, char ch){

    return  str.chars().filter(s -> s == ch).count();
}


public static String removeWhiteSpaceFromStr(String str){

    return str.replaceAll("\\s", "");
}



}