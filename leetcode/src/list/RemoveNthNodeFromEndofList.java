package list;

import base.ListNode;

/**
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * 
 * @author calvinliu
 * @Solution 1: Naive Two Passes, Calculate the length first, and then remove the nth from the beginning.
 * @Solution 2: One Pass, The fast pointer is n steps ahead of the slow pointer. When the fast reaches the end just change the slow's next
 * 
 */
public class RemoveNthNodeFromEndofList {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode cur = head;
		int len = 0;
		while(cur != null) {
			cur = cur.next;
			len++;
		}
		cur = head;
		if (len == n) {
			head = cur.next;
			return head;
		}
		int i = 1;
		while(cur != null) {
			if (i == len - n) {
				cur.next = cur.next.next;
				break;
			}
			if (cur.next.next == null) {
				cur.next = null;
				break;
			}
			cur = cur.next;
			i++;
		}
		return head;
	}
	
	public static ListNode removeNthFromEnd_2(ListNode head, int n) {
		if (head == null)
			return null;
		ListNode fast = head;
		ListNode slow = head;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		// if remove the first node
		if (fast == null) {
			head = head.next;
			return head;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}
