class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        int n = heights.length;
        for(int i = 0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        for(int i = n-1;i>=0;i--){
            names[i] = map.get(heights[n-1-i]);
        }
        return names;

    }
}