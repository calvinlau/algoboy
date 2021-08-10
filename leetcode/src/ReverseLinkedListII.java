import ListNode;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * For example:
 *  Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 *  return 1->4->3->2->5->NULL.
 * 
 * @author calvinliu
 * @Solution two pointers, start/cur
 * 
 */
public class ReverseLinkedListII {

	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode start = dummy;
		for (int i = 0; i < m - 1; i++) {
			start = start.next;
		}
		ListNode cur = start.next;
		for (int i = 0; i < n - m; i++) {
			ListNode tmp = cur.next;
			cur.next = tmp.next;
			tmp.next = start.next;
			start.next = tmp;
		}
    	return dummy.next;
    }
}
