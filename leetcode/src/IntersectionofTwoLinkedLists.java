import ListNode;

/**
 * Write a program to find the node at which the intersection of two singly
 * linked lists begins.
 * 
 * @author calvinliu
 * @Solution Start from the longer list at the diff offset, iterate though 2 lists and find the node.
 * 
 */
public class IntersectionofTwoLinkedLists {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int len1 = 0, len2 = 0;
		ListNode p1 = headA, p2 = headB;
		if (p1 == null || p2 == null)
			return null;

		while (p1 != null) {
			len1++;
			p1 = p1.next;
		}
		while (p2 != null) {
			len2++;
			p2 = p2.next;
		}
		int diff = 0;
		p1 = headA;
		p2 = headB;
		if (len1 > len2) {
			diff = len1 - len2;
			int i = 0;
			while (i < diff) {
				p1 = p1.next;
				i++;
			}
		} else {
			diff = len2 - len1;
			int i = 0;
			while (i < diff) {
				p2 = p2.next;
				i++;
			}
		}
		while (p1 != null && p2 != null) {
			if (p1.val == p2.val) {
				return p1;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		return null;
	}
}
