/**
 * Given a singly linked list, determine if it is a palindrome.
 * Could you do it in O(n) time and O(1) space?
 *
 * @author calvinliu
 * @Solution 1: Create a new list in reversed order and then compare each node. The time and space are O(n).
 * @Solution 2: Use a fast and slow pointer to get the center of the list, then reverse the second list and compare two sublists. The time is O(n) and space is O(1).
 *
 */
public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		if (head == null) {
			return true;
		}
		ListNode oldHead = head, newHead = new ListNode(head.val);
		while (oldHead.next != null) {
			ListNode temp  = new ListNode(oldHead.next.val);
			temp.next = newHead;
			newHead = temp;
			oldHead = oldHead.next;
		}
		oldHead = head;
		while (oldHead != null) {
			if (oldHead.val != newHead.val) {
				return false;
			}
			oldHead = oldHead.next;
			newHead = newHead.next;
		}
		return true;
	}

	public boolean isPalindrome_2(ListNode head) {
		if (head == null || head.next == null)
			return true;
		// find list center
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode secondHead = slow.next;
		slow.next = null;
		// reverse second part of the list
		ListNode p1 = secondHead;
		ListNode p2 = p1.next;
		while (p1 != null && p2 != null) {
			ListNode temp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = temp;
		}
		secondHead.next = null;
		// compare two sublists now
		ListNode p = (p2 == null ? p1 : p2);
		ListNode q = head;
		while (p != null) {
			if (p.val != q.val)
				return false;

			p = p.next;
			q = q.next;

		}
		return true;
	}
}
