package stringManipulation;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;

public class countingVowelsAndConsonants {


    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a','e','i','o','u'));

        public static Pair<Integer, Integer> countVowelsAConsonat(String str){

        
                       

                    str = str.toLowerCase();
                    int vowels =0;
                    int consonat=0;

                        for(int i=0; i< str.length(); i++){
                
                            char ch = str.charAt(i);
                            if(allVowels.contains(ch)){

                                vowels++;

                            }else if(ch >= 'a' && ch <= 'z'){
                            
                                consonat++;

                            }
                        }

            return Pair.of(vowels,consonat);
        }







    
    
}
