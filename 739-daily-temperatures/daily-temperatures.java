class Solution {

    public class Pair{
        int temp;
        int i;
        Pair(int temp,int i){
            this.temp = temp;
            this.i=i;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            int curr = temperatures[i];
            while(!st.isEmpty()&&curr>=st.peek().temp)st.pop();
            if(!st.isEmpty())ans[i]=st.peek().i-i;
            st.push(new Pair(curr,i));

        }
        return ans;
    }
}