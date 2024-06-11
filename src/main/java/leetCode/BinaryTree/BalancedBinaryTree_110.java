/**
 * 
 * Given a binary tree, determine if it is height-balanced.
 * 
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 *    3
 * 9    20
 *     15 7
 * 
 * Example 2:
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * 
 * 
 * Example 3:
 * Input: root = []
 * Output: true
 * 
 * 
 * Intuition
 * A binary tree is considered to be balanced when the difference in height of left and right of node/root exist in the range <=1.
 * 
 * Approach
 * 1) check the height of left
 * 2) check the height of right
 * 3) check the difference lies only in the range
 * 4) recursively check same for left and right nodes.
 * 5) done✌️

 * - Time complexity:O(n)
 * - Space complexity:O(n)
 * 
*/


package leetCode.BinaryTree;

public class BalancedBinaryTree_110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is considered balanced
        }
        
        int left = depth(root.left);
        int right = depth(root.right);
        
        // Check the balance condition and recurse for left and right subtrees
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    // Helper function to calculate the depth of a tree
    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
        
    }
