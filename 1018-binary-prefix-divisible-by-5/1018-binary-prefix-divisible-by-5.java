class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length;
        // int i = 0;
        List<Boolean> ans = new ArrayList<>();
        int prev = 0;
        for(int i = 0;i<n;i++){
            int curr =( prev<<1 )+ nums[i];
            if(curr%5 == 0){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
            prev = curr;
        }
        // while(nums[i++] == 0){
        //     ans.add(true);
        // }
        // for(i = i;i<n;i++){
        //     if(i>=2){
        //         if(nums[i] == 1 && nums[i-1] == 0 && nums[i-2] == 1){
        //             ans.add(true);
        //         }
        //         else{
        //             ans.add(false);
        //         }
        //     }
        //     else{
        //         ans.add(false);
        //     }
        // }
        return ans;
    }
}