/**
 * 
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]


Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 * 
 * 
 * 
 */

package leetCode.BinarySearch;
import leetCode.BinaryTree.TreeNode;
import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray{

    public int[] searchRange(int[] nums, int target) {

        int[] arr = {-1,-1};
        int nElement =0;


        int lowerBound =0;
        int upperBound = nums.length-1;

        while(lowerBound < upperBound){

            int mid = (lowerBound+upperBound)/2;
            if(nums[mid]==target){
                arr[nElement++]=-1;
            }else{
                if(nums[mid]< target){
                    lowerBound = mid+1;
                }else{
                    upperBound = mid-1;
                }
            }
        }
        return arr;
    }

}