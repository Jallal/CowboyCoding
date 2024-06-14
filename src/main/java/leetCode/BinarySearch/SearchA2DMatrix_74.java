package leetCode.BinarySearch;
import leetCode.BinaryTree.TreeNode;
import java.util.*;

public class SearchA2DMatrix_74{

    //this is binary search for a two dimentional array
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0){
            return false;
        }

    int row = matrix.length;
    int columns = matrix[0].length;
    int left =0;
    int right = row * (columns-1);

    while(left <= right){
        int midpoint = left+(right-left)/2;
        int midpoint_element = matrix[midpoint/columns][midpoint%columns];
        if(midpoint_element==target){
            return true;
        }else if(target < midpoint_element ){
            right = midpoint-1;

        }else if(target > midpoint_element){
            left = midpoint+1;
        }
    }
    return false;
    }

}