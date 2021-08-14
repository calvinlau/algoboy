import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * push(x) -- Push element x onto stack. 
 * pop() -- Removes the element on top of the stack. 
 * top() -- Get the top element. 
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author calvinliu
 * @Solution Two Stack
 * 
 */
public class MinStack {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();

	public void push(int x) {
		stack.push(x);
		if (minStack.size() != 0) {
			if (x <= minStack.peek()) {
				minStack.push(x);
			}
		} else {
			minStack.push(x);
		}
	}

	public void pop() {
		int x = stack.pop();
		if (minStack.size() != 0) {
			if (x == minStack.peek()) {
				minStack.pop();
			}
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}
}
