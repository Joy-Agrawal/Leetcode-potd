class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i = 1;i<=n;i++){
            int lb = findlb(nums,i);
            if(n-lb == i){
                return i;
            }
        }
        return -1;
    }

    private int findlb(int nums[],int x){
        int st = 0,end = nums.length-1;
        // int mid = st + (end-st)/2;
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid]>=x){
                // return mid;
            // }
            // else if(nums[mid]>x){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return st;
    }
}