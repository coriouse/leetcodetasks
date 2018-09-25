package app;

/**
 *
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 */
public class PalindromeLinkedList {


    public static void main(String[] args) {

    }



    public static boolean isPalindrome(ListNode head) {
        ListNode reverse = reverseandclone(head);
        return isEqual(head,reverse);
    }


    static ListNode reverseandclone(ListNode node)
    {
        ListNode head = null;
        while(node!=null)
        {
            ListNode n = new ListNode(node.val);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

   static  boolean isEqual(ListNode one, ListNode two)
    {
        while(one!=null && two!=null)
        {
            if(one.val != two.val)
            {
                return false;
            }

            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }


}
