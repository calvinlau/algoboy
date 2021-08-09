package list;


import base.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 * @author calvinliu
 * @Solution two pointers, fast/slow
 * 
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	while (fast != null && fast.next != null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		if (slow == fast) {
    			return true;
    		}
    	}
    	return false;
    }
}
