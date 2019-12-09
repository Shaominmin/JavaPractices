import java.util.Stack;
class MinStack {

    private int minStack = Integer.MAX_VALUE;
    private Stack<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<>();
    }

    public void push(int x) {
        if(x<=minStack){
            stack.push(minStack);
            minStack = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == minStack){
            minStack = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
       return minStack;
    }}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */