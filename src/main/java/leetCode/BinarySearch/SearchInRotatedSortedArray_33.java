package leetCode.BinarySearch;
import leetCode.BinaryTree.TreeNode;
import java.util.*;

public class SearchInRotatedSortedArray_33 {
    
    public int search(int[] nums, int target) {

        int left =0;
        int right = nums.length -1;
        int targetIndex =-1;
        
      while(left <= right){
  
          int mid = (left+right)/2;
          if(nums[mid]==target){
              targetIndex = mid;
          }
          //left sorted portion of the array
          if(nums[left] <= nums[mid]){
              if(target > nums[mid] || target < nums[left]){
                  left = mid+1;
              } else{
                  right = mid-1;
              }
          //right sorted array
          } else{
              if(target < nums[mid] || target > nums[right]){
                  right = mid-1;
  
              }else{
                  left = mid+1;
              }
          }
      }
        return targetIndex; 
      }

}