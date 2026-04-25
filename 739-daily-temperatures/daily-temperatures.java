class Solution {
    public int[] dailyTemperatures(int[] tem) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[tem.length];
        for(int i=tem.length-1;i>=0;i--){
            int curr = tem[i];
            while(!st.isEmpty()&&(tem[st.peek()]<=curr)){
                    st.pop();
                }
            if(st.isEmpty()){
                ans[i]=0;
            }else{
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}