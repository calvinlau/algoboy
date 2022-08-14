package list;

/**
 * Write a program to find the node at which the intersection of two singly
 * linked lists begins.
 * 
 * @author kevinliu
 * @Solution Start from the longer list at the diff offset, iterate though 2 lists and find the node.
 * 
 */
public class IntersectionofTwoLinkedLists {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		int len1 = 0, len2 = 0;
		ListNode p1 = headA, p2 = headB;
		while (p1 != null) {
			p1 = p1.next;
			len1++;
		}
		while (p2 != null) {
			p2 = p2.next;
			len2++;
		}
		p1 = headA;
		p2 = headB;
		if (len1 > len2) {
			for (int i = 0; i < len1 - len2; i++) {
				p1 = p1.next;
			}
		} else {
			for (int i = 0; i < len2 - len1; i++) {
				p2 = p2.next;
			}
		}
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
