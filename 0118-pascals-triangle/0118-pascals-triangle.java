class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<=numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 1;j<=i;j++){
                list.add(ncr(i-1,j-1));
            }
            ans.add(list);
        }
        return ans;
    }


    int ncr(int n,int r){
        int res = 1;
        for(int i = 0;i<r;i++){
            res = res*(n-i)/(i+1);
        }
        return res;
    }
}