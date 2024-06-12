package arrays;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ArraysStreams{



    public void arraysStream(){

            String[] arr = {"One", "Two", "Three", "Four", "Five"};

            Stream<String> stream = Arrays.stream(arr);
            Stream<String> subStream = Arrays.asList(arr).subList(0, 2).stream();

            //creating an Array from a Stream 
            String[] arrs = (String[]) stream.toArray(String::new);

            int[] integers = {1,2,3,4,5,6,7,8,9,0};

            IntStream intStream = IntStream.range(0, integers.length);
        }



    public static void reversingAnArr(int[] arr) {

        for(int leftHead =0, rightHead = arr.length-1; lefthead < rightHead; leftHead++, rightHead--){

        int elemenet = arr[leftHead];
        arr[leftHead] = arr[rightHead];
        arr[rightHead] = elemenet;

        }

    }



    }