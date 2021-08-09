package list;


import base.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 
 * @author calvinliu
 * @Solution two pointers, fast/slow, second time slow/fast meet is joint
 * 
 */
public class LinkedListCycleII {

	public static ListNode detectCycle(ListNode head) {
		ListNode ret = null;
		ListNode fast = head;
    	ListNode slow = head;
    	while (fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
			// has cycle
    		if (fast == slow) {
    			slow = head;
    			while (slow != fast) {
    				slow = slow.next;
    				fast = fast.next;
    			}
    			ret = slow;
    			break;
    		}
    	}
    	return ret;
	}
}
