package list;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 * 
 * @author kevinliu
 * @Solution: Iterative solution with constant space.
 */
public class SwapNodesinPairs {

	public ListNode swapPairs(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode ret = new ListNode(0);
		ret.next = head;
		ListNode cur = ret;
		while (cur.next != null && cur.next.next != null) {
			ListNode next = cur.next.next;
			cur.next.next = next.next;
			next.next = cur.next;
			cur.next = next;
			cur = cur.next.next;
		}
		return ret.next;
	}
}
