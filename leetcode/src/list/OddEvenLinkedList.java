package list;

/**
 * Given a singly linked list, group all odd nodes together followed by the even
 * nodes. Please note here we are talking about the node number and not the
 * value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space
 * complexity and O(nodes) time complexity.
 * <p>
 * Example: Given 1->2->3->4->5->NULL, return 1->3->5->2->4->NULL.
 *
 * @author kevinliu
 * @Solution: Get 2 lists, even/odd, finally set odd.next = evenHead
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head, even = head.next, evenHead = head.next;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
