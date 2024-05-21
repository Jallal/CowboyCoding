package stringManipulation;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArrysByLength {

    public static void sortArraysByLength(String[] args){

        //ASC
        Arrays.sort(args, (s1,s2) -> Integer.compare(s1.length(), s2.length()));

        //DESC
        Arrays.sort(args, (s1,s2)-> Integer.compare(s1.length(), s2.length()));
    }

    public static void sortArraysByLengthV1(String[] args){
         
        //ASC
       Arrays.stream(args).sorted(
        Comparator.comparingInt(String::length)).toArray(String[]::new);

        //DESC
        Arrays.stream(args).sorted(Comparator.comparingInt(String::length)
        .reversed()).toArray(String[]::new);
    }

    
    
}
