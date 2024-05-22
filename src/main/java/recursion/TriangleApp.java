package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {

    private static int theNumber;

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a nymber : ");
        theNumber = getInt();
        int theAnswer = triangle(theNumber);
        System.out.println(" Triangle = "+theAnswer);
    }


public static int triangle(int n){

    if(n==1){
        return 1;
    } else{
        //System.out.println(" The values : "+n) ;
        return (n + triangle(n-1));
    }
}


public static int getInt() throws IOException {

    String s = getString();
    return Integer.parseInt(s);
}

public static String getString() throws IOException, java.io.IOException {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
}    
}
