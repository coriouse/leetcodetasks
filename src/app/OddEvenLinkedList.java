package app;

/**
 * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
 * <p>
 * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 1->3->5->2->4->NULL
 * Example 2:
 * <p>
 * Input: 2->1->3->5->6->4->7->NULL
 * Output: 2->3->6->7->1->5->4->NULL
 * Note:
 * <p>
 * The relative order inside both the even and odd groups should remain as it was in the input.
 * The first node is considered odd, the second node even and so on ...
 * <p>
 * <p>
 * https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/
 */
public class OddEvenLinkedList {

    public static void main(String[] args) {


        ListNode n7 = new ListNode(7);
        n7.next = null;
        ListNode n6 = new ListNode(6);
        n6.next = n7;
        ListNode n5 = new ListNode(5);
        n5.next = n6;
        ListNode n4 = new ListNode(4);
        n4.next = n5;
        ListNode n3 = new ListNode(3);
        n3.next = n4;
        ListNode n2 = new ListNode(2);
        n2.next = n3;
        ListNode n1 = new ListNode(1);
        n1.next = n2;


        print(oddEvenList(n1));

    }


    public static ListNode oddEvenList(ListNode head) {

        if (head == null)
            return null;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }


    public static void print(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;

        }
    }

}
