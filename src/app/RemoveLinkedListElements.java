package app;

/**
 *
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 */
public class RemoveLinkedListElements {


    public static void main(String[] args) {

        ListNode n7 = new ListNode(6);
        n7.next = null;
        ListNode n6 = new ListNode(5);
        n6.next = n7;
        ListNode n5 = new ListNode(4);
        n5.next = n6;
        ListNode n4 = new ListNode(3);
        n4.next = n5;
        ListNode n3 = new ListNode(6);
        n3.next = n4;
        ListNode n2 = new ListNode(2);
        n2.next = n3;
        ListNode n1 = new ListNode(1);
        n1.next = n2;


        print(n1);

        ListNode res = removeElements(n1, 6);
        System.out.println("--------------------------------------------");
        print(res);

    }


    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void print(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;

        }
    }
}
