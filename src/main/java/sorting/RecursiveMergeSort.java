package sorting;

public class RecursiveMergeSort {

// merge sort is O(nlogn)
// space is require an additional array




    private long[] arr; // ref to the arr 
    private int nElement; // number of data in the array 

    public RecursiveMergeSort(int max){

        arr = new long[max]; //create the array
        nElement=0;
    }

    public void insert(long value){

        arr[nElement] = value;  // insert it 
        nElement++; //increament the size
    }

    public void display(){ // display the array elements 

    for(int i=0; i< nElement; i++){ //loop for each element

        System.out.print(arr[i]+ " ");  //display it
    }
    System.out.println(" ");
    }


    public void mergeSort(){ //called by main

        long[] workSpace = new long[nElement];
        recMergeSort(workSpace,0, nElement-1);
    }

    public void recMergeSort(long[] workSpace, int lowerBound, int upperBound){

        if(lowerBound == upperBound){ //if range is 1
            return;
        }else{

            int mid = (lowerBound+upperBound)/2; //find midpoint
            recMergeSort(workSpace, lowerBound, mid); //sort lower half
            recMergeSort(workSpace, mid+1, upperBound); //sort upper bound
            merge(workSpace, lowerBound, mid+1, upperBound);// merge them
        }

    }

    public void merge(long[] workSpace, int lowPtr, int higherPtr, int upperBound){

        
        int j =0;  //workspace
        int lowerBound = lowPtr;
        int mid = higherPtr-1;
        int n = upperBound - lowerBound+1; //# of items



            while(lowPtr <= mid && higherPtr <= upperBound){

                if(arr[lowPtr] < arr[higherPtr]){
                    workSpace[j++] = arr[lowPtr++];
                } else{
                    workSpace[j++] = arr[higherPtr++];
                }
            }

            while(lowPtr <= mid){
                workSpace[j++] = arr[lowPtr++];
            }

            while(higherPtr <= upperBound){
                workSpace[j++] = arr[higherPtr++];
            }

            for( j=0; j<n ; j++){
                arr[lowerBound+j] = workSpace[j];
            }

        }



public static void main(String[] args){

    int maxSize = 100; //arraySize
    RecursiveMergeSort recursiveMergeSort = new RecursiveMergeSort(maxSize);
    recursiveMergeSort.insert(64);
    recursiveMergeSort.insert(21);
    recursiveMergeSort.insert(33);
    recursiveMergeSort.insert(70);
    recursiveMergeSort.insert(12);
    recursiveMergeSort.insert(85);
    recursiveMergeSort.insert(44);
    recursiveMergeSort.insert(3);
    recursiveMergeSort.insert(99);
    recursiveMergeSort.insert(0);
    recursiveMergeSort.insert(108);
    recursiveMergeSort.insert(36);
    recursiveMergeSort.display();
    recursiveMergeSort.mergeSort();
    System.out.println("After the merge sort process");
    recursiveMergeSort.display();
}




}
