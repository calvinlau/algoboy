package list;

import java.util.Stack;

/**
 * Given a list, rotate the list to the right by k places, where k is
 * non-negative.
 * <p>
 * For example: Given 1->2->3->4->5->NULL and k = 2, return 4->5->1->2->3->NULL.
 *
 * @author kevinliu
 * @Solution: Link head and tail as ring, then set len - k 's node.next as null
 */
public class RotateList {

    public ListNode rotateRight_1(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
		int len = 1;
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
            len++;
        }
        last.next = head;
        int i = len - k % len;
        while (i > 0) {
            last = last.next;
            i--;
        }
        ListNode ret = last.next;
        last.next = null;
        return ret;
    }

	public static ListNode rotateRight_2(ListNode head, int n) {
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode cur = head;
		ListNode last = null;
		while (cur != null) {
			stack.push(cur);
			if (cur.next == null) {
				last = cur;
			}
			cur = cur.next;
		}
		if (stack.size() == n) {
			return head;
		}
		if (stack.size() != 0 && stack.size() < n) {
			n = n % stack.size();
		}
		while (!stack.isEmpty()) {
			cur = stack.pop();
			n--;
			if (n == 0) {
				last.next = head;
				head = cur;
				if (!stack.isEmpty()) {
					cur = stack.pop();
				}
				cur.next = null;
				break;
			}
		}
		return head;
	}
}
