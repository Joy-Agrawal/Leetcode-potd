class Solution {
    public String longestPalindrome(String s){
        String max = "";
        int m = 0;
        for(int i = 0;i<s.length();i++){
            //odd
            String a = expand(s,i,i,max,0);

            //even
            String b = expand(s,i,i+1,max,0);
            if(a.length()>max.length() || b.length()>max.length()){
                max = a.length()>b.length()? a:b;
            }

        }
        return max;
    }
    private String expand(String s,int i ,int j,String max ,int m){
        int count = 0;
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            if(j-i+1 > m){
                max = s.substring(i,j+1);
            }
            i--;j++;
            
            count++;
        }
        return max;
    }
}