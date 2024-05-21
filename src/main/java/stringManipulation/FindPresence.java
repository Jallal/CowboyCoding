package stringManipulation;

import java.util.Arrays;
import java.util.Comparator;

public class FindPresence {

    public static boolean containElement(int[] arr, int contain){

        for(int element : arr){

            if(element == contain){
                return true;
            }
        }
        return false;
    }

    public static boolean containElementV1(int[] arr, int contain){

        Arrays.sort(arr);
         int element = Arrays.binarySearch(arr, contain);

         return element>=0;
    }

    public static boolean containElementV2(int[] arr, int contain){


       return Arrays.stream(arr).anyMatch(s->s==contain);
    }


    public static <T> boolean containElementV3(Melon[] melons, Melon cMelon,Comparator<? super T> c){


            for(Melon element : melons){
                if(c.compare(element, cMelon) == 0){
                    return true;
                }
            }

        return false;
     }





     Melon[] melonsArr = {new Melon("Crenshaw", 2000),
     new Melon("Gac", 1200), new Melon("Bitter", 2200)};

    private class Melon {

        private final String type;
        private final int weight;

        public Melon(String type , int weight){

            this.type = type;
            this.weight = weight;
        }


    }

    
}
