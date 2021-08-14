import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks.
 * 
 * push(x) -- Push element x to the back of queue. 
 * pop() -- Removes the element from in front of queue. 
 * peek() -- Get the front element. 
 * empty() -- Return whether the queue is empty.
 * 
 * @author calvinliu
 * @Solution Two Stack
 * 
 */
class MyQueue {

	Stack<Integer> input = new Stack<Integer>();
	Stack<Integer> output = new Stack<Integer>();

	public void push(int x) {
		input.push(x);
	}

	public void pop() {
		peek();
		output.pop();
	}

	public int peek() {
		if (output.empty())
			while (!input.empty())
				output.push(input.pop());
		return output.peek();
	}

	public boolean empty() {
		return input.empty() && output.empty();
	}
}