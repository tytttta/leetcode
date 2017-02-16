public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack();
        int i=0;
        for (;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                st.push(s.charAt(i));
            else if (!st.empty() ){
                if( (s.charAt(i)==')' && st.peek()=='(')||
                    (s.charAt(i)==']' && st.peek()=='[')||
                    (s.charAt(i)=='}' && st.peek()=='{') )
                      st.pop();
                else
                  break;
                }
            else
            break;
        }
        return st.empty()  && i==s.length()?true:false;
    }
}