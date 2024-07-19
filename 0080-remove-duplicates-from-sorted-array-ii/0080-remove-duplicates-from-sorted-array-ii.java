class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i+1;
        int count = 1;
        int n = nums.length;
        while(j<n){
            if(nums[i] == nums[j]){
                if(count<2){
                    count++;
                    nums[++i] = nums[j++];
                }
                else{
                    j++;
                }
            }
            else{
                count = 1;
                nums[++i] = nums[j++];
            }
        }
        return i+1;
    }
}