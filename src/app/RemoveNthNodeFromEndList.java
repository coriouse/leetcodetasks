package app;


/**
 *
 *
 *
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/
 */
public class RemoveNthNodeFromEndList {


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
        System.out.println("--------------------");
        removeNthFromEnd(n1, 3);

    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //ListNode dummy = new ListNode(0);
        //dummy = head;
        int len = getLinkedLen(head);
        int pos = len - n+1;
        ListNode curr = head;
        ListNode prev = head;
        while(pos > 0) {
            prev = curr;
            curr = curr.next;
            pos--;
        }
        prev.next = curr.next;
      //  head = prev;

        print(head);

        return head;
    }


    public static int getLinkedLen(ListNode head) {
        ListNode curr = head;
        int counter = 0;
        while (curr != null) {
          //  System.out.println(curr.val);
            curr = curr.next;
            counter++;
        }
        return counter;
    }

    public static void print(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;

        }
    }

/*
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length  = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }

*/

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
