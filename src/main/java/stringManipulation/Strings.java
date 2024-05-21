package stringManipulation;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import kotlin.Result;

public class Strings {

    private static final int EXTENDED_ASCII_CODES = 256; // can be increased to 65535


    private Strings(){
        throw new AssertionError("Cannot be instantiated");
    }


public static Map<Character, Integer> countDuplicateCharactersV1(String str){

    if( str == null || str.isBlank()){

        return Collections.emptyMap();
    }
    
    Map<Character, Integer> result = new HashMap<>();

        for(int i=0 ; i< str.length() ; i++){
            char ch = str.charAt(i);

            result.compute(ch,(h,v) -> (v==null)? 1: ++v);
            
        }

    return result;
}



public static Map<String, Integer> countDuplicateCharactersVCP1(String str){

    if(str == null || str.isEmpty()){

        return Collections.emptyMap();
    }

    Map<String, Integer> result = new HashMap<>();

    for(int i=0; i< str.length(); i++){

        int cp = str.codePointAt(i);
        String ch = String.valueOf(Character.toChars(cp));
        if(Character.charCount(cp) == 2){
            //2 means a surrogate pair
            i++;
        }
        result.compute(ch,(k,v) -> (v == null)?1: ++v);

    }

    return result;

}

public static Map<Character, Long> countDyplicateCharacters(String str){

if(str ==null || str.isBlank()){

    return Collections.emptyMap();
}

Map<Character, Long> result = str.chars()
.mapToObj(c -> (char) c)
.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
return result;
}

public static Map<String, Long> countDuplicateCharactersVCP2(String str){

if(str == null || str.isBlank()){
    // or thorw IllegalArgumentException
    return Collections.emptyMap();
}

Map<String, Long> result = str.codePoints()
.mapToObj(c -> String.valueOf(Character.toChars(c)))
.collect(Collectors.groupingBy(c->c, Collectors.counting()));

return result;
}    

public static char firstNonRepeatedCharacterV1(String str){


    if(str == null || str.isBlank()){
    
        return Character.MIN_VALUE; 
    }

    for(int i=0 ; i< str.length(); i++){

        char ch = str.charAt(i);
        int count =0;

        for(int j=0; j< str.length(); j++){


            if(ch == str.charAt(j) && i!=j){
                count++;
                break;
            }
        }

        if(count ==0){

        return ch;
        }

    }
    return Character.MIN_VALUE; 
}


public static char fisrtNonrepeatingCharacterV2(String str){

    if(str ==null || str.isBlank()){
        
        return Character.MIN_VALUE;
    }

    int[] flags = new int[EXTENDED_ASCII_CODES];
    for(int i=0; i< flags.length; i++){

        flags[i] = -1;
    }

    for(int i=0; i< flags.length; i++){

        char ch = str.charAt(i);
            if(flags[ch]==-1){
                flags[ch]=i;
                
            } else{
                flags[ch]=-2;
            }
        }

    int position = Integer.MAX_VALUE;

    for(int i=0; i< EXTENDED_ASCII_CODES ; i++){

        if(flags[i]>=0){

            position = Math.min(position, flags[i]);
        }
    }

    return position == Integer.MAX_VALUE ? Character.MIN_VALUE:str.charAt(position);
    }


    public static char fisrtNonrepeatingCharacterV3(String str){

        if(str == null || str.isBlank()){

            return Character.MIN_VALUE;
        }

        for(int i=0; i< str.length();i++){

            char ch = str.charAt(i);
            
        }

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for(int i=0; i< str.length(); i++){

            char ch = str.charAt(i);

            chars.compute(ch, (k,v) -> (v==null)? 1 :++v);
        }

        for(Map.Entry<Character, Integer> entry : chars.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }

        }

        return Character.MIN_VALUE;
    }
}
