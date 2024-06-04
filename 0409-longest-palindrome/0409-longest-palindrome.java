class Solution {
    public int longestPalindrome(String s) {
        int freq[] = new int[52];
        int n = s.length();
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
            else{
                freq[ch-'A'+26]++;
            }
        }
        int ans = 0;
        int flag = 0;
        for(int i = 0;i<52;i++){
            if((freq[i]&1) == 0){
                ans += freq[i];
                freq[i] = 0;
            }
            else{
                
                if(freq[i]>2){
                    ans += (freq[i]-1);
                    freq[i] = 1;
                }
            }
        }
        for(int i = 0;i<52;i++){
            if(freq[i] == 1){
                flag = 1;
                break;
            }
        }
        return flag == 1? ans+1:ans;
    }
}