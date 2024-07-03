class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prodL = 1,prodR = 1;
        int n = nums.length;
        int leftProd[] = new int[n];
        int rightProd[] = new int[n];

        leftProd[0] = 1;
        rightProd[n-1] = 1;
        for(int i = 1;i<n;i++){
            leftProd[i] = prodL * nums[i-1];
            prodL = leftProd[i];
            rightProd[n-i-1] = prodR * nums[n-i];
            prodR = rightProd[n-i-1];
        }
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = leftProd[i] * rightProd[i];
        }
        return ans;
    }
}