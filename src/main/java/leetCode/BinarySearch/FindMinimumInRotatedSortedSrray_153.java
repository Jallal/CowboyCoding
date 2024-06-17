

package leetCode.BinarySearch;
import leetCode.BinaryTree.TreeNode;
import java.util.*;

public class FindMinimumInRotatedSortedSrray_153{

    public int findMin(int[] nums) {
        
        int left =0;
        int target =nums[left];
        int right = nums.length -1;
        while(left <= right){
         int mid = (left+right)/2;
         target = Math.min(target, nums[mid]);
         if(nums[left] < nums[right]){
             target = Math.min(target, nums[left]);
             break;
         } else if(nums[mid] >=  nums[left]){
             left = mid+1;
         }else{
             right = mid-1;
         }
        }
         return target;
     }

}