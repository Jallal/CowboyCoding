
package stringManipulation;
public class rotateAnArrayWithFixedNumber_189{

    public void rotate(int[] nums, int k) {

        if(nums.length==0 || nums.length==1 ){
            return;
          }

        //rotate the whole array
        rotateArray(nums,0,nums.length-1);
        //rotate the first element up to k 
        rotateArray(nums,0,k-1);
        //roatate the remaining elment from k to the end 
        rotateArray(nums,k,nums.length-1);
    }

    public void rotateArray(int[] nums, int left, int right){
        
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        } 

}