package list;

import base.ListNode;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and
 * return its modified list.
 * 
 * If the number of nodes is not a multiple of k then left-out nodes in the end
 * should remain as it is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.
 * 
 * For example, Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 * 
 * @author calvinliu
 * @Solution: Recusively to reverse node every k times
 * 
 */
public class ReverseNodesinkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return head;
        ListNode ret = new ListNode(0);
        ret.next = head;
        ListNode cur = head;
        ListNode pre = ret;
        int i = 0;
    	while (cur != null) {
    		i++;
    		cur = cur.next;
    		if (i == k) {
    			pre = reverse(pre, cur);
    			i = 0;
    		}
    	}
    	return ret.next;
    }

	private ListNode reverse(ListNode pre, ListNode post) {
		ListNode dummy = pre.next;
		ListNode cur = dummy.next;
		while (cur != post) {
			ListNode next = cur.next;
			cur.next = pre.next;
			pre.next = cur;
			cur = next;
		}
		dummy.next = post;
		return dummy;
	}
}
