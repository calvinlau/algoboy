package list;

import base.ListNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln, reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * For example,
 *   Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 * @author calvinliu
 * @Solution Break list in the middle, Reverse the order of the second list, Merge two list
 * 
 */
public class ReorderList {

	public static void reorderList(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode cur = head;
		Queue<ListNode> queue = new LinkedList<ListNode>();
		Stack<ListNode> stack = new Stack<ListNode>();
		int length = 0, i =0;
		while (cur != null) {
			length++;
			cur = cur.next;
		}
		if (length == 1) {
			return;
		}
		// constract the stack and queue
		cur = head;
		int mid;
		if (length % 2 != 0) {
			mid = length / 2 + 1;
		} else {
			mid = length / 2;
		}
		while(cur != null) {
			i++;
			if (i <= mid) {
				queue.add(cur);
				cur = cur.next;
			} else {
				stack.push(cur);
				cur = cur.next;
			}
		}
		cur = queue.poll();
		while (!queue.isEmpty() && !stack.isEmpty()) {
			cur.next = stack.pop();
			cur = cur.next;
			cur.next = queue.poll();
			cur = cur.next;
		}
		if (queue.isEmpty() || stack.isEmpty()) {
			cur.next = null;
		}
		if (!stack.isEmpty()) {
			cur.next = stack.pop();
			cur.next.next = null;
		}
	}
	
	public void reorderList_2(ListNode head) {
		if (head != null && head.next != null) {
			ListNode slow = head;
			ListNode fast = head;
			//use a fast and slow pointer to break the link to two parts.
			while (fast != null && fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			ListNode second = slow.next;
			slow.next = null;
			second = reverseOrder(second);
			ListNode p1 = head;
			ListNode p2 = second;
			//merge two lists here
			while (p2 != null) {
				ListNode temp1 = p1.next;
				ListNode temp2 = p2.next;
 
				p1.next = p2;
				p2.next = temp1;		
 
				p1 = temp1;
				p2 = temp2;
			}
		}
	}

	public static ListNode reverseOrder(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head;
		ListNode curr = head.next;
		while (curr != null) {
			ListNode temp = curr.next;
			curr.next = pre;
			pre = curr;
			curr = temp;
		}
		head.next = null;
		return pre;
	}
}
