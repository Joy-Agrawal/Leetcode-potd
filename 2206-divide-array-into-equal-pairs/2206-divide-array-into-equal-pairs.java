class Solution {
    public boolean divideArray(int[] nums) {
        int freq[] = new int[500];
        for(int a:nums){
            freq[a-1]++;
        }
        for(int a : freq){
            if((a&1) == 1){
                return false;
            }
        }
        return true;
    }
}