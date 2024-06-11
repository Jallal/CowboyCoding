/**
 * 
 * Given the root of a binary tree, return its maximum depth.

 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node
 * 
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * 
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 * 
*/


package leetCode.BinaryTree;

public class MaximumDepthofBinaryTree_104 {

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
    
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth,right_depth)+1;
        }
}
