/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2

Output: 5

Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
*/
// when you hear largest and/or smallest. Always use HEAP (max heap or min heap)
package leetCode.heap;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray_215 {

    public int findKthLargest(int[] nums, int k) {
        //let try and use the min heap which can keep the smalest thing at the root and eject anything that is above our k. 
        //So, we will proccess all the modes and the the kth larest at the root because it's a MIN HEAP
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        
        return minHeap.remove();
        
    }

    //run time of building heap is n. So, we're trading memory for faster run time because sorting would hve been nlogn
    
}
