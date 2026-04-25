class MinStack {
    Stack<Integer> st;
    Stack<Integer> minTillNow;
    public MinStack() {
        st=new Stack<>();
        minTillNow = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minTillNow.isEmpty()){
            minTillNow.push(val);
        }else{
            minTillNow.push(minTillNow.peek()>=val?val:minTillNow.peek());
        }
    }
    
    public void pop() {
        st.pop();
        minTillNow.pop();
    }
    
    public int top() { 
        return st.peek();
    }
    
    public int getMin() {
        return minTillNow.peek();
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