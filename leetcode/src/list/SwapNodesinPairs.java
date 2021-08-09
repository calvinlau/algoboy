package list;

import base.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example, Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values
 * in the list, only nodes itself can be changed.
 * 
 * @author calvinliu
 * @Solution: Iterative solution with constant space.
 */
public class SwapNodesinPairs {
	
    public ListNode swapPairs(ListNode head) {
    	if (head == null) return head;
    	ListNode ret = new ListNode(0);
    	ret.next = head;
    	ListNode cur = ret;
    	while(cur.next != null && cur.next.next != null) {
    		ListNode node = cur.next.next;
    		cur.next.next = node.next;
    		node.next = cur.next;
    		cur.next = node;
    		cur = cur.next.next;
    	}
    	return ret.next;
    }
}
