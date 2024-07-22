class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = -1;
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        if(breakpoint == -1){
            int i = 0;
            int j = n-1;
            while(i<j){
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }
        }
        else{
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for(int i = breakpoint+1;i<n;i++){
                if(nums[i]>nums[breakpoint] && nums[i]<min){
                    min = nums[i];
                    idx = i;
                }
            }
            
            int temp  = nums[idx];
            nums[idx] = nums[breakpoint];
            nums[breakpoint] = temp;
            int i = breakpoint+1;
            int j = n-1;
            while(i<j){
                temp = nums[i];
                nums[i++] = nums[j];
                nums[j--] = temp;
            }
        }
    }
}