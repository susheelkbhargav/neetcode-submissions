class MinStack {
    private int min;
    private Stack<Integer> mainStack;
    private Stack<Integer> stackmin;

    public MinStack() {
        min = Integer.MAX_VALUE;
        mainStack = new Stack<>();
        stackmin = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if ((val< min) || stackmin.isEmpty()){
            min = val;
            stackmin.push(val);
        } else {
            stackmin.push(min);
        }
    }
    
    public void pop() {
        stackmin.pop();
        mainStack.pop();
        min = stackmin.isEmpty() ? Integer.MAX_VALUE : stackmin.peek();

    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return stackmin.peek();
    }
}
