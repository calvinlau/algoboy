package list;

import base.ListNode;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity.
 * 
 * @author calvinliu
 * @Solution: Transfer Merge k to merge 2
 * 
 */
public class MergekSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}
		return helper(lists, 0, lists.length - 1);
    }

	private ListNode helper(ListNode[] lists, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			return mergeList(helper(lists, left, mid), helper(lists, mid + 1, right));
		}
		return lists[left];
	}

	private ListNode mergeList(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode cur = head;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		if (l1 != null) {
			cur.next = l1;
		}
		if (l2 != null) {
			cur.next = l2;
		}
		return head.next;
	}
}
