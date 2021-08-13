/**
 * Reverse a singly linked list.
 * 
 * @author calvinliu
 * @Solution 1: iteratively
 * @Solution 2: recursively
 * 
 */
public class ReverseLinkedList {

    public ListNode reverseList_1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head;
		ListNode cur = head.next;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		head.next = null;
		return pre;
    }

	public ListNode reverseList_3(ListNode head) {
		ListNode last = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = last;
			last = head;
			head = next;
		}
		return last;
	}

	public ListNode reverse(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode last = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return last;
	}

    public ListNode reverseList_2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode second = head.next;
		head.next = null;
		ListNode rest = reverseList_2(second);
		second.next = head;
		return rest;
    }
}
