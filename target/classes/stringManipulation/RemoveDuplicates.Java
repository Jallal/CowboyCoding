package stringManipulation;

public class RemoveDuplicates{

    public int removeDuplicates(int[] nums) {

        int j=0;
        nums[j++]=nums[0];
       for(int i=1; i< nums.length; i++){
        if(nums[i] != nums[i-1]){
            nums[j++] = nums[i];
        }
        }
        return j;
    }

}


