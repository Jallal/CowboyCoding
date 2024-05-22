package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class PermitationWithRecursion {

    private static int size;
    private static int count;
    private static char[] arrChar = new char[100];

public static void doAnagram(int newSize){

    //check if it's too small
    if(newSize == 1){

        //go no further
        return;
    }

    //for each position
    for(int j=0; j< newSize; j++){

        //anagram remaining
        doAnagram(newSize-1);
        //if innermost
        if(newSize==2){
            //display it
            displayWord();
        }else{
            //rotate the word
            rotate(newSize);
        }
    }
}

public static void rotate(int newSize){

    int j;
    int position = size - newSize;
    //save the first letter
    char temp = arrChar[position];
    // shift the others left
    for(j = position +1; j< size; j++){
        arrChar[j-1] = arrChar[j];
    }
    arrChar[j-1] = temp;
}



public static void displayWord(){
        if(count<99){
            System.out.print("");
        }

        if(count < 9){
            System.out.println(" ");
        }

        System.out.println(++count +" ");

        for(int i=0; i< size ; i++){
            System.out.print(arrChar[i]);
        }
            System.out.print(" ");
            System.out.flush();

        if(count%6==0){
            System.out.println("");

        }
}


public static String getString() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
}


public static void main(String[] args) throws IOException{
    
            System.out.print(" Enter a word : ");
            String input = getString();
            size = input.length();
            count =0;

            for(int j=0; j < size; j++){
                arrChar[j] = input.charAt(j);
            }

            doAnagram(size);

}

}
