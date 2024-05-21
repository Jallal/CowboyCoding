package sorting;

public class HeapSort {

// Heap sort relies on a binary heap (complete binary tree)
// Time complexity best case O(n log n) and worst case O(n log n)
//space compleity O(1)

public static void heapSort(int[] arr){

    int n = arr.length;

    buildHeap(arr,n);

    while(n > 1){
        swap(arr,0,n-1);
        n--;
        heapify(arr, n, 0);
    }



}

public static void buildHeap(int[] arr, int n){

for(int i = arr.length/2; i>=0 ; i-- ){

    heapify(arr,n,i);
}
}



public static void heapify(int[] arr, int n, int i){

    int left = i * 2 + 1;
    int right = i * 2 + 2;
    int greater;

    if(left < n && arr[left] > arr[i]){
        greater = left;
    } else {
        greater = i;
    }



    if(right<n && arr[right]>arr[greater]){

        greater = right;
    }

    if(greater != i ){

        swap(arr, i, greater);
        heapify(arr, n, greater);;
    }

}


private static void swap(int[] arr, int x, int y){

    int temp =arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}





    
}
