class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        Stack<Character> st3 = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for(char c:s.toCharArray()){
            if(c!=')'){
                st.push(c);
            }
            else{
                while(st.peek()!='('){
                    st2.push(st.pop());
                }
                while(!st2.isEmpty()){
                    st3.push(st2.pop());
                }
                st.pop();
                while(!st3.isEmpty()){
                    st.push(st3.pop());
                }
            }
        }
        while(!st.isEmpty()){
            st3.push(st.pop());
        }
        while(!st3.isEmpty()){
            sb.append(st3.pop());
        }
        return sb.toString();
    }
}