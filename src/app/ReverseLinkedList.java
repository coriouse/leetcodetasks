package app;

/**
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 *
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class ReverseLinkedList {


    public static void main(String[] args) {

        ListNode n5 = new ListNode(5);
        n5.next = null;
        ListNode n4 = new ListNode(4);
        n4.next = n5;
        ListNode n3 = new ListNode(3);
        n3.next = n4;
        ListNode n2 = new ListNode(2);
        n2.next = n3;
        ListNode n1 = new ListNode(1);
        n1.next = n2;

        print(n1);
        System.out.println("------------------------");
        ListNode rev = reverseList(n1);
        print(rev);

    }


    public static ListNode reverseList(ListNode head) {

        ListNode first = head;
        ListNode reverse = null;
        while(first != null) {
            ListNode second = first.next;
            first.next = reverse;
            reverse = first;
            first = second;
        }


        return reverse;
    }


    public static void print(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;

        }
    }

}
