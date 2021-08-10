import ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author calvinliu
 * @solution Traverse two list
 * 
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode ret = new ListNode(0);
    	ListNode cur1 = l1, cur2 = l2, pre = ret;
    	int carry = 0;
    	while (cur1 != null || cur2 != null) {
    		if (cur1 != null) {
    			carry += cur1.val;
    			cur1 = cur1.next;
    		}
    		if (cur2 != null) {
    			carry += cur2.val;
    			cur2 = cur2.next;
    		}
    		pre.next = new ListNode(carry % 10);
    		pre = pre.next;
			carry = carry / 10;
    	}
    	if (carry == 1) {
    		pre.next = new ListNode(1);
    	}
		return ret.next;
    }
}
