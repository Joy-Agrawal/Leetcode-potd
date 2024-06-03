class Solution {
    public int appendCharacters(String s, String t) {
        int n1 = s.length(),n2 = t.length();
        // int freq1[] = new int[26];
        // int freq2[] = new int[26];
        // for(int i = 0;i<n2;i++){
        //     freq2[t.charAt(i)-'a']++;
        // }
        // for(int i = 0;i<n1;i++){
        //     freq1[s.charAt(i)-'a']++;
        // }
        int i = 0,j=0;
        while(j<t.length()){
            if(i == n1){
                return n2-j;
            }
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            if(ch1 == ch2){
                j++;
            }
            i++;
        }
        // int j = 0;
        // for(int i = 0;i<t.length();i++){
        //     char ch = t.charAt(i);
        //     if(freq1[ch-'a'] > 0)
        //     for(;j<s.length();j++){
        //         char curr = s.charAt(j);
        //         if(curr == ch){
        //             break;
        //         }
        //     }
        //     if(j == s.length()){
        //         return t.length()-i;
        //     }
        // }
        // return 0;
        return n2-j;
    }
    
}