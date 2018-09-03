package app;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * Note: Do not modify the linked list.
 *
 * Follow up:
 * Can you solve it without using extra space?
 *
 *
 * https://leetcode.com/problems/linked-list-cycle-ii/solution/
 */
public class LinkedListCycleII {





    class ListNode {
        int val;
        LinkedListCycle.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }



    private ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        // A fast pointer will either loop around a cycle and meet the slow
        // pointer or reach the `null` at the end of a non-cyclic list.
    /*    while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                return tortoise;
            }
        }*/

        return null;
    }

/*    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }


        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }


        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }*/


    /*
    Simple decision with Set
     */
 /*   public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
            node = node.next;
        }

        return null;
    }*/
}
