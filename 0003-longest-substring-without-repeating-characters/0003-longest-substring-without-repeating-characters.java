class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 1){
            return n;
        }
        int hashArr[] = new int[256];
        int l = 0;
        int r = 0;
        Arrays.fill(hashArr,-1);
        int maxLen = 0;
        while( r < n ) {
            if(hashArr[s.charAt(r)] >= l){
                l = hashArr[s.charAt(r)] + 1;
            }
            hashArr[s.charAt(r)] = r;
            maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}