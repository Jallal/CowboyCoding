/**
 * 
 * Problem statement 
 * 
 * Given the root of a Binary Search Tree (BST), return the minimum absolute difference 
 * between the values of any two different nodes in the tree.
 * 
 * 
 * Example 1:
 * Input: root = [4,2,6,1,3]
 * Output: 1
 * 
 *     4
 *   2   6
 * 1 3
 * 
 * Example 2:
 * Input: root = [1,0,48,null,null,12,49]
 * Output: 1 
*/


package leetCode.BinarySearchTree;
import leetCode.BinaryTree.TreeNode;
import java.util.*;

public class MinimumAbsoluteDifferenceInBST {

    int min = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {

        help(root);
        return min;
        
    }


    public void help(TreeNode root) {
        if (root == null) {
            return;
        }
        help(root.left);
        min = Math.min(min, Math.abs(root.val - prev));
        prev = root.val;
        help(root.right);
    }
    
}
