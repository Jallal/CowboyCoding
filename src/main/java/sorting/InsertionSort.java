package sorting;

public class InsertionSort {

    //Time complexity best case o(n)  worst case O(n^2)
    //Space complexity : worst case O(1)

    public static void InsertionSort(int[] arr){

        int n = arr.length;

        for(int i=1; i < n;i++){

            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){

                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
        }

    }
    
}
