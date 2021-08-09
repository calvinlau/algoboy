package list;

import base.ListNode;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * @author calvinliu
 * @solution merge(mergeSort(head), mergeSort(slow))
 * 
 */
public class SortList {

	ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode slow = head, cut = null, fast = head;
		while (fast != null && fast.next != null) {
			cut = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		cut.next = null;
		return merge(sortList(head), sortList(slow));
	}

	ListNode merge(ListNode h, ListNode m) {
		ListNode dummy = new ListNode(0), cur = dummy;
		while (h != null && m != null) {
			if (h.val < m.val) {
				cur.next = h;
				h = h.next;
			} else {
				cur.next = m;
				m = m.next;
			}
			cur = cur.next;
		}
		cur.next = (h == null ? m : h);
		return dummy.next;
	}
}
