import java.util.*;
class Solution {

    public int removeDuplicates(int[] nums) {
        int k =1;
        int temp = nums[0];
        for(int i = 1;i<nums.length;i++){
            // if(i>0){
                if(nums[i] == nums[i-1] || nums[i] == temp){
                    temp = nums[i];
                    nums[i] = 101;
                }
                else{
                    k++;
                }
            // }
        }
        Arrays.sort(nums);
        return k;
    }
}