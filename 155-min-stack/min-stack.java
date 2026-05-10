class MinStack {

    class Node{
        int curr;
        int minTillNow;
        Node(int curr,int minTillNow){
            this.curr = curr;
            this.minTillNow = minTillNow;
        }
    }

    Stack<Node> st;

    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())st.push(new Node(val,val));
        else{
            st.push(new Node(val,Math.min(val,st.peek().minTillNow)));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().curr;
    }
    
    public int getMin() {   
        return st.peek().minTillNow;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */