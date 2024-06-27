/**
 * 
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 * 
 * 
 * 
 * 
 * 
 * 
*/


package leetCode.SlidingWindow;
public class MaxConsecutiveOnesIII_1004 {

    public int longestOnes(int[] nums, int k) {
        int left =0;
        int right =0; 
        int kc =k;
        int sequenceLength =0;

        for(int i=0; i< nums.length; i++){
          if(nums[i]==1){
            right ++;
          } else{

            if(kc>0){
                right ++;
                kc--;
            } else{
                sequenceLength = Math.max(sequenceLength, right-left);
                while(left < nums.length && nums[left]==1){
                    left++;
                }
                left++;
                right++;
            }
          }
        }
        return sequenceLength;
        
    }

}