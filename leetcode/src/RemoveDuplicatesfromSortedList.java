/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * For example, 
 * Given 1->1->2, return 1->2. 
 * Given 1->1->2->3->3, return 1->2->3.
 * 
 * @author calvinliu
 * @Solution: Scan node list, if (cur.val == cur.next.val) cur.next = cur.next.next;
 * 
 */
public class RemoveDuplicatesfromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			if (cur.val == cur.next.val) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return head;
	}
}
