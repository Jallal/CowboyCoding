package leetCode.heap;
import java.sql.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.

Define a pair (u, v) which consists of one element from the first array and one element from the second array.

Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.

 

Example 1:

Input: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
Output: [[1,2],[1,4],[1,6]]
Explanation: The first 3 pairs are returned from the sequence: [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
Example 2:

Input: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
Output: [[1,1],[1,1]]
Explanation: The first 2 pairs are returned from the sequence: [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
*/


public class FindKPairsSmallestSum_373 {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        //this outputting  array
        List<List<Integer>> listOfLists = new ArrayList<>();
        // create a minHeap priority Queue that will sort these list based on the list pairs (1,2)
        PriorityQueue<List<Integer>> mPriorityQueue = new PriorityQueue<List<Integer>>(
         (a,b) -> (a.get(0)+a.get(1)) - (b.get(0)+b.get(1)));
         // if you want a max heap. Just change the chandition as below
         //PriorityQueue<List<Integer>> mPriorityQueue = new PriorityQueue<List<Integer>>((a,b) -> (b.get(0)+b.get(1)) - (a.get(0)+a.get(1)));
        
        for(int i=0; i<nums1.length; i++ ){
            for(int j=0; j<nums2.length; j++ ){
                mPriorityQueue.add(Arrays.asList(nums1[i],nums2[j]));

                //check if we added more than we need 
                if(mPriorityQueue.size() > k){
                    //remove the unwanted items
                    mPriorityQueue.poll();
                }
        }
         }
//You can improve this by limiting the size of the Heap to K 
        //  while(k!=0){
        // listOfLists.add(mPriorityQueue.remove());
        // k--;
        //  }

    //return listOfLists;

    return new ArrayList<mPriorityQueue>();
    }
}