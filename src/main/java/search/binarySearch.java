package search;

public class binarySearch {


    public int find(long searchKey, long[] arr){


        int lowerBound = 0;
        int upperBound = arr.length;
        int curIn;

        while(true){
            curIn = (lowerBound+upperBound)/2;
            if(arr[curIn]==searchKey){
                //found it
                return curIn;
            } else if(lowerBound> upperBound){
                //can't find it
                return arr.length;
            }

            if(arr[curIn] < searchKey){
                lowerBound = curIn+1;
            } else{
                upperBound = curIn -1;
            }
        }
    } 
    
}
