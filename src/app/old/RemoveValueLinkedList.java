package app.old;

public class RemoveValueLinkedList {


    public Node head;


    public static void main(String[] args) {
        RemoveValueLinkedList removeValueLinkedList = new RemoveValueLinkedList();


        removeValueLinkedList.addToEnd(1);
        removeValueLinkedList.addToEnd(2);
        removeValueLinkedList.addToEnd(3);
        removeValueLinkedList.addToEnd(4);
        removeValueLinkedList.addToEnd(3);
        removeValueLinkedList.addToEnd(6);
        removeValueLinkedList.addToEnd(7);

        removeValueLinkedList.displayItems();
/*
        removeValueLinkedList.removeByPosition(3);
        System.out.println();

        removeValueLinkedList.displayItems();
        System.out.println();

        removeValueLinkedList.addByPosition(3, 3);
        removeValueLinkedList.displayItems();*/
        System.out.println();

        removeValueLinkedList.removeByValue(3);
        System.out.println();
        removeValueLinkedList.displayItems();
        System.out.println();
        removeValueLinkedList.reverse();
       removeValueLinkedList.displayItems();
    }


    public void reverse() {

        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }


    public void removeByValue(int val) {


        Node curr = head;
        Node prev = head;

        while (curr.next != null) {


            if(curr.value == val) {
                prev.next = curr.next;
                curr = prev;
            } else {
                prev = curr;
                curr = curr.next;
            }

        }

    }

    public void addByPosition(int val, int position) {

        Node newNode = new Node(val);

        int c = 1;

        Node curr = head;
        Node prev = head;
        while (c <= position - 1) {
            prev = curr;
            curr = curr.next;
            c++;
        }
        newNode.next = curr;
        prev.next = newNode;

    }

    public void removeByPosition(int position) {
        int c = 0;
        Node prev = head;
        Node curr = head;
        while (c < position - 1) {
            prev = curr;
            curr = curr.next;
            c++;
        }

        prev.next = curr.next;
    }

    public void addToEnd(int val) {
        if (head == null) {
            head = new Node(val);
        } else {

            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new Node(val);
        }

    }


    public void add(int val) {
        if (head == null) {
            head = new Node(val);
        } else {
            Node item = new Node(val);
            item.next = head;
            head = item;
        }
    }


    public void displayItems() {

        Node curr = head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }

    }


    public class Node {

        public int value;
        public Node next;

        public Node(int val) {
            this.value = val;
        }

    }

}
