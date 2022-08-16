package list;

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * @author kevinliu
 * @Solution two pointers, fast/slow
 *
 */
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
}
