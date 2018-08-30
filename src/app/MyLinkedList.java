package app;

/**
 * Design Linked List
 * Go to Discuss
 * Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement these functions in your linked list class:
 * <p>
 * get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
 * addAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
 * addAtTail(val) : Append a node of value val to the last element of the linked list.
 * addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
 * deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
 * Example:
 * <p>
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
 * linkedList.get(1);            // returns 2
 * linkedList.deleteAtIndex(1);  // now the linked list is 1->3
 * linkedList.get(1);            // returns 3
 * Note:
 * <p>
 * All values will be in the range of [1, 1000].
 * The number of operations will be in the range of [1, 1000].
 * Please do not use the built-in LinkedList library.
 */
public class MyLinkedList {

    private Node head;

    private int size = 0;

    /** Initialize your data structure here. */
    public MyLinkedList() {



    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
    if(size == 0 || index>size-1)
        return -1;

        int i = 0;
        Node curr = head;
        while (i <= index-1 ) {
            curr = curr.next;
            i++;
        }
        return curr.val;
    }
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = node;
        }
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list,
     * the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     * */
    public void addAtIndex(int index, int val) {
        if(index > size)
            return;

        if(index == size) {
            addAtTail(val);
        } else {

            Node node = new Node(val);
            if (head == null) {
                head = node;
            } else {
                int i = 0;
                Node curr = head;
                Node prev = head;
                while (i <= index - 1) {

                    prev = curr;
                    curr = curr.next;

                    i++;
                }
                node.next = curr;
                prev.next = node;

            }
            size++;
        }

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

        if(index > size-1)
            return;

        Node prev = head;
        Node curr = head;

        int i = 0;
        while (i <= index - 1) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        prev.next = curr.next;
        size--;

    }

    class Node {
        public Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }
}
