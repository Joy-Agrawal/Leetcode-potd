class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt[] = new int[1001];
        for(int a[] : nums){
            for(int x : a){
                cnt[x]++;
            }
        }
        for(int i = 0;i<cnt.length;i++){
            if(cnt[i] == nums.length){
                ans.add(i);
            }
        }
        return ans;
    }
}