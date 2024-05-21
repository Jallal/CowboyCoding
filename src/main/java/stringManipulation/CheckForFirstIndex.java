package stringManipulation;

import java.io.InputStream;
import java.util.stream.IntStream;

import org.checkerframework.checker.units.qual.t;

import java.util.Comparator;
import java.util.Arrays;

public class CheckForFirstIndex {


    public static int findIndexOfElement(int[] arr , int toFind){

        for(int i=0; i<= arr.length ; i++){
            if(arr[i]==toFind){
                return i;
            }
        }
    return -1;
    }

    public static int findIndexOfElementV1(int[] arr , int toFind){

        return IntStream.range(0,arr.length).filter(i -> toFind == arr[i])
        .findFirst().orElse(-1);
    }


    public static int findIndexOfElementV2(int[] arr , int toFind, Comparator<? super t> c){

        for(int i=0 ; i< arr.length ; i++){
            if(c.compare(arr[i], toFind) == 0){

                return i;
            }
        }
        return -1;
    }

    public static int findIndexOfElementV3(int[] arr , int toFind){

        return IntStream.range(0,arr.length)
        .filter(i -> c.compare(toFind,arr[i]) == 0)
        .findFirst().orElse(-1);
    }

    
    
}
