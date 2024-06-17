/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a 
 * height-balanced
 * binary search tree.
 * 
 * 
 * 
 * Example 1:
 *       0
 *     -.   9
 *  -10.     5
 * 
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 * 
 *    0
 * -10 5
 * -3  9
 * 
 * Example 2:
 * 
 *   3    1
 *   1      3
 * 
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 * 
*/

package leetCode.dividAndConquer;
import leetCode.BinaryTree.TreeNode;
import java.util.*;
public class ConvertSortedArrayToBinarySearchTree_108{

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(0,nums.length-1,nums);
    }

public TreeNode helper(int left, int right,int[] nums ){
    TreeNode node=null;
    if(left > right){
        return node;
    } else{
        int mid = (left +right)/2;
        node = new TreeNode(nums[mid]);
        node.left = helper(left, mid-1,nums);
        node.right = helper(mid+1,right,nums);;
    }
    return node;
}

}