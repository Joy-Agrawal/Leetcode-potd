class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<n;i++){
            arr.add(i+1);
        }
        int i = 0;
        while(arr.size()>1){
            int idx = (i+k-1)%arr.size();
            arr.remove(idx);
            i = idx%arr.size();
        }
        return arr.get(0);
    }
}