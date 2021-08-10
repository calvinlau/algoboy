/**
 * Given a linked list and a value x, partition it such that all nodes less than
 * x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the
 * two partitions.
 * 
 * For example, 
 * Given 1->4->3->2->5->2 and x = 3, 
 * return 1->2->2->4->3->5.
 * 
 * @author calvinliu
 * @Solution: Scan linked list put node into left and right list, then left.next = right.head.
 * 
 */
public class PartitionList {

	public ListNode partition(ListNode head, int x) {
		ListNode leftHead = new ListNode(0), rightHead = new ListNode(0);
		ListNode left = leftHead, right = rightHead, cur = head;
		while (cur != null) {
			if (cur.val < x) {
				left.next = cur;
				left = left.next;
			} else {
				right.next = cur;
				right = right.next;
			}
			cur = cur.next;
		}
		left.next = rightHead.next;
		right.next = null;
		return leftHead.next;
	}
}
