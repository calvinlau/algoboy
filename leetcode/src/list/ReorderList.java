package list;

/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln, reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * For example,
 *   Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 * @author kevinliu
 * @Solution Break list in the middle, Reverse the order of the second list, Merge two list
 * 
 */
public class ReorderList {

	public void reorderList1(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode fast = head, slow = head, mid;
		// find the middle
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		mid = slow.next;
		slow.next = null;
		// reverse rest
		fast = null;
		while (mid != null) {
			ListNode next = mid.next;
			mid.next = fast;
			fast = mid;
			mid = next;
		}
		// merge two list
		while (head != null && fast != null) {
			ListNode temp = head.next;
			head.next = fast;
			head = temp;
			temp = fast.next;
			fast.next = head;
			fast = temp;
		}
	}

	public void reorderList_2(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode fast = head, slow = head, mid;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		mid = slow.next;
		slow.next = null;
		fast = null;
		while (mid != null) {
			ListNode temp = mid.next;
			mid.next = fast;
			fast = mid;
			mid = temp;
		}
		while (head != null && fast != null) {
			ListNode p = head.next;
			head.next = fast;
			head = p;
			ListNode q = fast.next;
			fast.next = head;
			fast = q;
		}
	}
}
