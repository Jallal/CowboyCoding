public class ContainDigits {



public static boolean containDigitsOnlyV1(String str){

    if(str == null || str.isBlank()){
        return false;
    }

    for(int i=0; i < str.length(); i++){

        if(!Character.isDigit(str.charAt(i))){

            return false;
        }
    }
}

public static boolean containDigitsOnlyV2(String str){

    return  str.chars().anyMatch(s -> ! Character.isDigit(str.charAt(s)));
}

public static boolean containDigitsOnlyV3(String str){

    return str.matches("[0-9]+");
}


}
