
package stringManipulation;

public class RemoveDuplicatesFromSortedArray_80{

    public int removeDuplicates(int[] nums) {

        int j=0;
        nums[j++]=nums[0];
        nums[j++]=nums[1];
        for(int i=2; i< nums.length; i++){
             if(nums[i]!=nums[j-1] || nums[i]!=nums[j-2]){
                nums[j++] = nums[i];
             } 
        }
        return j;
    }

}