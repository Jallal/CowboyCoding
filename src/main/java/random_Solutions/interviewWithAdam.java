package random_Solutions;

public class interviewWithAdam {


    /***
     * in language of choice write a method to get the factorial of a number
     * factorial function - 5 factoriol - 5 * 4 * 3 * 2 * 1
     * 
     * 
    */

    public int  factorial(int n){

        if(n==1){
            
          return n;
        }

     return n*factorial(n-1);
    }
    
}
