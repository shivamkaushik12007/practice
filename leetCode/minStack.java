class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> st;
    public MinStack() {
        st=new Stack<Integer>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> s=new Stack<Integer>();
        int min=Integer.MAX_VALUE;
        while(!st.isEmpty()){
            int x=st.pop();
            s.push(x);
            if(x<min){
                min=x;
            }
        }
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
