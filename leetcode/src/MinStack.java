import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * 
 * push(x) -- Push element x onto stack. 
 * pop() -- Removes the element on top of the stack. 
 * top() -- Get the top element. 
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author kevinliu
 * @Solution Two Stack
 * 
 */
public class MinStack {

	private Stack<Integer> stack;
	private Stack<Integer> minStack;

	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}

	public void push(int val) {
		stack.push(val);
		if (minStack.isEmpty()) {
			minStack.push(val);
		} else {
			minStack.push(Math.min(val, minStack.peek()));
		}
	}

	public void pop() {
		stack.pop();
		minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
