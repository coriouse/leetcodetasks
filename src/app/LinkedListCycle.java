package app;

/**
 *Given a linked list, determine if it has a cycle in it.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {

    public static void main(String[] args) {




    }



    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public static boolean hasCycle(ListNode head) {

        if(head == null)
            return false;

        ListNode slow, fast;

        slow = fast = head;

        while(true) {

            slow = slow.next;          // 1 hop

            if (fast.next != null)
                fast = fast.next.next; // 2 hops
            else
                return false;          // next node null => no loop

            if (slow == null || fast == null) // if either hits null..no loop
                return false;

            if (slow == fast) // if the two ever meet...we must have a loop
                return true;
        }
    }


}
