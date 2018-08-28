package app.old;

public class InsertLinkedList {



    public static void main(String[] args) {

        InsertLinkedList ins = new InsertLinkedList();

        Node head = null;
        Node a1 = ins.Insert(head, 4);

        ins.displayLInk(a1);

        System.out.println("----------------");
        Node a2 = ins.Insert(a1, 2);

        ins.displayLInk(a2);
        System.out.println("----------------");

        Node a3 = ins.Insert(a2, 3);

        ins.displayLInk(a3);
        System.out.println("----------------");
        Node a4 = ins.Insert(a3, 4);

        ins.displayLInk(a4);

    }

    public Node Insert(Node head,int val) {
// This is a "method-only" submission.
// You only need to complete this method.

        if(head == null) {
            Node node = new Node();
            node.val = val;
            head = node;
            return head;
        }
;
        Node current = head;

        while(current.next != null) {

            current = current.next;
        }

        Node node = new Node();
        node.val = val;

        current.next = node;


        return head;

    }

     void displayLInk (Node head) {

        Node current = head;
        while(current != null) {
            System.out.println(current.val);
            current = current.next;

        }
     }

}

class Node {
    int val;
    Node next;
}

/*

    Node newNode = new Node();
    newNode.data = data;

    if(head == null)
        return newNode;
    else if(position == 0) {
        newNode.next = head;
        return newNode;
    }

    Node currNode = head;

    for(int i=0; i<position-1; i++) {
        currNode = currNode.next;
    }

    newNode.next = currNode.next;
    currNode.next = newNode;

    return head;
 */

/*
*

Node MergeLists(Node a, Node b) {
    if (a == null) {
        return b;
    } else if (b == null) {
        return a;
    }

    if (a.data < b.data) {
        a.next = MergeLists(a.next, b);
        return a;
    } else {
        b.next = MergeLists(a, b.next);
        return b;
    }
}



Node mergeLists(Node headA, Node headB) {
    Node a = headA;
    Node b = headB;
    Node c = null;

    if(a == null || b == null)  // either of them is null
        return a == null? b:a;

    // getting the first index pointed by c, done this so now in the coming loop i can use next directly on c

     if(a.data < b.data ){
            c = a;
            a = a.next;
        }else{
            c = b;
            b = b.next;
        }
    Node head = c;


    // either one of a or b has been changed,

    while(a != null && b != null){ // ie going to the last elements of the linked lists
        if(a.data < b.data ){
            c.next = a;
            a = a.next;
        }else{
            c.next = b;
            b = b.next;
        }
        c = c.next;
    }

    // either one of a and b is finished

    // a is left
    if(a != null)
        c.next = a;


    // b is left
    if(b != null)
        c.next = b;

    return head;
}
*/