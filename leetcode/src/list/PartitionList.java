package list;

import base.ListNode;

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
    	ListNode leftdummy = new ListNode(0);
    	ListNode rightdummy = new ListNode(0);
    	ListNode leftHead = leftdummy;
    	ListNode rightHead = rightdummy;
    	ListNode cur = head;
    	while(cur != null) {
    		if (cur.val < x) {
    			leftHead.next = cur;
    			leftHead = leftHead.next;
    		} else {
    			rightHead.next = cur;
    			rightHead = rightHead.next;
    		}
    		cur = cur.next;
    	}
    	leftHead.next = rightdummy.next;
    	rightHead.next = null;
    	return leftdummy.next;
    }
}
