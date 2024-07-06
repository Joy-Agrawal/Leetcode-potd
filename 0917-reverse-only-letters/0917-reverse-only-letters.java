class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                st.push(ch);
            }
        }
        int n = s.length();
        for(int i = 0;i<n;i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(st.pop());
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}