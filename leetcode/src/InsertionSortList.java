/**
 * Sort a linked list using insertion sort.
 * 
 * @author calvinliu
 * 
 */
public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode cur = head.next;
		head.next = null;
		while (cur != null) {
			ListNode tmp = dummy; 
			while (tmp.next != null && tmp.next.val < cur.val) {
				tmp = tmp.next;
			}
			ListNode next = cur.next;
			cur.next = tmp.next;
			tmp.next = cur;
			cur = next;
		}
		return dummy.next;
	}
}
