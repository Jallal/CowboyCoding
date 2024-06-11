/**
 * Problem:
 * 
 * Given the root of a binary tree, invert the tree, and return its root.
 * 
 * Example 1:
 * Input: root = [4,2,7,1,3,6,9]
 * Output: [4,7,2,9,6,3,1]
 * 
 * Example 2:
 * Input: root = [2,1,3] 
 * Output: [2,3,1]
 * 
 * Example 3:
 * Input: root = []
 * Output: []
 *  
 * 
 * Intuition
 * wap two nodes of root, repeat.
 * 
 * Approach
 * do for root node and let the recursive call take care of sub problems or in a iterative fashion.
 * NOTE: the swapping of the child(each child) is done at the parent level. Thats it ✌️result ,result 2
 * 
 * Complexity
 * Time complexity: O(n)
 * Space complexity: O(n)
*/

package leetCode.BinaryTree;
import java.util.*;
public class InvertBinaryTree_226 {

    public TreeNode invertTree(TreeNode root) {
        
        if (root == null) {
            return null;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            TreeNode left = current.left;
            current.left = current.right;
            current.right = left;
            
            if (current.left != null) {
                stack.push(current.left);
            }
            
            if (current.right != null) {
                stack.push(current.right);
            }
        }
        
        return root;
    }
    
}
