
/**
 * 
 Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

**/

package leetCode.SlidingWindow;
public class MinimumSizeSubArraySum_209 {
    public int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int left =0;
        int val_sum=0;
        for(int i=0; i< nums.length; i++){
            val_sum+=nums[i];
            while(val_sum>=target){
                System.out.println(" i+1-left. "+(i+1-left));
                System.out.println("left. "+left);
                System.out.println("i+1 "+(i+1));
                result = Math.min(result, i+1-left);
                val_sum-=nums[left];
                left++;
            }

        }
        return result != Integer.MAX_VALUE?result:0;
    }

    public void main(String[] args){

        MinimumSizeSubArraySum_209 minimumSizeSubArraySum = new MinimumSizeSubArraySum_209();
        //target = 4, nums = [1,4,4]
        int[] nums = {1,4,4};
        minimumSizeSubArraySum.minSubArrayLen(4, nums);
    }
}
