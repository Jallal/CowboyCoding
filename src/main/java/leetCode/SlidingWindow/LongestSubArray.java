/**
 * 
 * Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 

Example 1:

Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
Example 2:

Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
Example 3:

Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
 * 
 * 
 * 
 * 
 * 
*/

package leetCode.SlidingWindow;
public class LongestSubArray {

    public int longestSubarray(int[] nums) {

        int leftPos=0;
        int rightPos=0;
        int pos =0;
        int max =0;
        while(pos < nums.length ){
            //find the left subarray
            if(nums[pos]==1){
                ++pos;
                ++leftPos;
            }else if(nums[pos]==0){
                rightPos=0;
                ++pos;
                //find out the size of the sub array
                while(pos <nums.length  && nums[pos]==1){
                    ++pos;
                    ++rightPos;
                } 
                max = Math.max(max, leftPos+rightPos);
                leftPos=rightPos;
            }
        }
        if(leftPos==nums.length){
            max = nums.length-1;
        }
        return max;
    }

}