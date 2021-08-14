import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement the following operations of a stack using queues.
 * 
 * push(x) -- Push element x onto stack. 
 * pop() -- Removes the element on top of the stack. 
 * top() -- Get the top element. 
 * empty() -- Return whether the stack is empty.
 * 
 * @author calvinliu
 * @Solution Two Stack
 * 
 */
class MyStack {
	Queue<Integer> q = new LinkedList<Integer>();

	// Push element x onto stack.
	public void push(int x) {
		q.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		int size = q.size();
		for (int i = 1; i < size; i++)
			q.add(q.remove());
		q.remove();
	}

	// Get the top element.
	public int top() {
		int size = q.size();
		for (int i = 1; i < size; i++)
			q.add(q.remove());
		int ret = q.remove();
		q.add(ret);
		return ret;
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return q.isEmpty();
	}
}