class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'||ch==']'||ch=='}'){
                if(st.isEmpty())return false;
                char popped = st.pop();
                if((ch==')'&&popped=='(')||(ch=='}'&&popped=='{')||(ch==']'&&popped=='[')){
                    continue;
                }else return false;
            }
            else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}