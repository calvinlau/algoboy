import ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 
 * @author calvinliu
 * @Solution two pointers, fast/slow, second time slow/fast meet is joint
 * 
 */
public class LinkedListCycleII {

	public ListNode detectCycle(ListNode head) {
		ListNode ret = null;
		ListNode fast = head, slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			// has cycle
			if (fast == slow) {
				slow = head;
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return slow;
			}
		}
		return ret;
	}
}
