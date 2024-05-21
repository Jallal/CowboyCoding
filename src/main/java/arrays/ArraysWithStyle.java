package arrays;

public class ArraysWithStyle {


    long[] intArray;
    int nElement;



    public ArraysWithStyle(int max){

        this.nElement =0;
        this.intArray = new long[max];
    }

 

    public boolean find(long serachKey){

        int j;
        boolean foundIt = false;

        for(j =0; j < nElement; j++){

            if(intArray[j]==serachKey){
                foundIt =  true;
            }
        }
        return foundIt;
    }



    public void insert(long value){

        //insert the value
        intArray[nElement] = value;

        //increment the size
        nElement++;
    }


    public void delete(long value){


        int i;

        for( i=0 ; i< nElement ; i++){

            if(intArray[i] == value){
                
                //found it
                break;
            }
        }


        for(int j=i; j< nElement; j++){
            intArray[j] = intArray[j+1];
        }

        nElement--;
    }
    
}
