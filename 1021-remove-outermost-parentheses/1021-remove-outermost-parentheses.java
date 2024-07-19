class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb  = new StringBuilder("");
        int i = 0;
        int j = 0;
        int open = 0,close = 0;
        while(j<s.length()){
            if(s.charAt(j) == '(')
                open++;
            else
                close++;
            if(open == close){
                i++;
                while(i<j){
                    sb.append(s.charAt(i++));
                }
                i = j+1;;
                open = 0;close = 0;
            }
            j++;
        }
        return sb.toString();

    }
}