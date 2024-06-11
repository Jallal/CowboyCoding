/**
 * 
 * Given the root of a binary tree, imagine yourself standing on the right side of it, 
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * Example 1:
 * Input: root = [1,2,3,null,5,null,4]
 *     1 <---
 *  2    3 <---
 *  5   4 <---
 * Output: [1,3,4]
 * 
 * Example 2:
 * Input: root = [1,null,3]
 * Output: [1,3]
 * 
 * Example 3:
 * Input: root = []
 * Output: []
*/

package leetCode.BinaryTreeBFS;
import leetCode.BinaryTree.TreeNode;
import java.util.*;

public class BinaryTreeRightSideView_199 {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        reversePreOrder(root,list,0);
        return list;
    }

    private void reversePreOrder(TreeNode root, List<Integer> list, int currentLevel){
        if(root ==null){
            return ;
        }
        
        list.add(root.val);
        reversePreOrder(root.right,list,currentLevel+1);
        reversePreOrder(root.left,list,currentLevel+1);
    }
    
}
