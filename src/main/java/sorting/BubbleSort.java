package sorting;
import java.util.Arrays;

public class BubbleSort{

    //ref to array
    private long[] a;

    //number of elements 
    private int nElement;



    public BubbleSort(int max){

        nElement =0;
        a  = new long[max];
    }

public void insert(long value){

    //insert element
    a[nElement] = value;
    //increment the size 
    nElement++;
}


public void BubbleSort(){

    int out, in;


   //outer loop (bakword) 
    for(out = nElement-1; out>1; out--){

        //inner loop (forward)
        for(in =0; in<out; in++){

            if(a[in] > a[in+1]){
                swap(in,in+1);   
            }
        }
    }
}

//[1,2,4,1,8,9,0]
//[1,2,4,1,8,9,0]


public void swap(int one , int two){

    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
}

public void display(){

    System.out.println("Start printing : ");
    for(long element: a){
     System.out.println(element);
    }
    System.out.println("Printing Ends");

}

public static void main(String[] args){

    long[] arr = {77,99,44,55,22,88,11,0,66,33};

    BubbleSort bubbleSort = new BubbleSort(10);
    bubbleSort.insert(77);
    bubbleSort.insert(99);
    bubbleSort.insert(44);
    bubbleSort.insert(55);
    bubbleSort.insert(22);
    bubbleSort.insert(88);
    bubbleSort.insert(11);
    bubbleSort.insert(0);
    bubbleSort.insert(66);
    bubbleSort.insert(33);
    bubbleSort.display();
    bubbleSort.BubbleSort();
    bubbleSort.display();
}

}