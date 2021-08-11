/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * @author calvinliu
 *
 */
public class MiddleoftheLinkedList {

	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
