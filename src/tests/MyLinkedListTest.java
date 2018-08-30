package tests;


import app.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {

    @Test
    public void testAddHeadElementLinkedList() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        assertTrue(true);
    }

    @Test
    public void testGetElementByIndexLinkedList() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtHead(2);
        obj.addAtHead(3);
        int val = obj.get(2);
        assertEquals(1, val);
        int val1 = obj.get(0);
        assertEquals(3, val1);
        int val2 = obj.get(1);
        assertEquals(2, val2);
    }


    @Test
    public void testAddAtIndexElementLinkedList() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtTail(1);
        obj.addAtTail(2);
        obj.addAtTail(4);
        obj.addAtIndex(2,3);

        int val1 = obj.get(0);
        assertEquals(1, val1);
        int val2 = obj.get(1);
        assertEquals(2, val2);
        int val3 = obj.get(2);
        assertEquals(3, val3);
        int val4 = obj.get(3);
        assertEquals(4, val4);


    }


    @Test
    public void testAddTailElementLinkedList() {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtTail(1);
        obj.addAtTail(2);
        obj.addAtTail(3);

        int val = obj.get(0);
        assertEquals(1, val);
        int val1 = obj.get(1);
        assertEquals(2, val1);
        int val2 = obj.get(2);
        assertEquals(3, val2);
    }


    @Test
    public void testDeleteAtIndexElementLinkedList() {

        MyLinkedList obj = new MyLinkedList();
        obj.addAtTail(1);
        obj.addAtTail(2);
        obj.addAtTail(4);
        obj.addAtIndex(2,3);

        int val1 = obj.get(0);
        assertEquals(1, val1);
        int val2 = obj.get(1);
        assertEquals(2, val2);
        int val3 = obj.get(2);
        assertEquals(3, val3);
        int val4 = obj.get(3);
        assertEquals(4, val4);

        obj.deleteAtIndex(2);
        int val = obj.get(2);
        assertEquals(4, val);

    }

    @Test
    public void testLeetCodeNum_1() {
  //  ["MyLinkedList", "addAtHead", "addAtIndex", "get", "get", "get"]
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtIndex(1,2);
        obj.get(1);
        obj.get(0);
        obj.get(2);

    //[[],[1],[1, 2],[1],[0],[2]]

    }
    @Test
    public void testLeetCodeNum_2() {

    //["MyLinkedList", "get", "addAtIndex", "get", "get", "addAtIndex", "get", "get"]
        MyLinkedList obj = new MyLinkedList();
        obj.get(0);
        obj.addAtIndex(1,2);
        obj.get(0);
        obj.get(1);
        obj.addAtIndex(0,1);
       obj.get(0);
        obj.get(1);
            //[[],[0] ,[1, 2],[0],[1],[0, 1],[0],[1]]

    }

    @Test
    public void testLeetCodeNum_3() {
    //["MyLinkedList", "addAtHead", "addAtIndex", "get", "get", "get"]

        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtIndex(1,2);
        assertEquals(2, obj.get(1));
        assertEquals(1, obj.get(0));
        assertEquals(-1, obj.get(2));

    // [[],[1],[1, 2],[1],[0],[2]]

    }

    @Test
    public void testLeetCodeNum_4() {

        //["MyLinkedList","addAtHead","get","addAtHead","addAtTail","addAtIndex","get","get","addAtHead","addAtIndex", "deleteAtIndex","addAtHead"]

//    [[],[4],[1],[7],[1],[1,7],[4],[3],[2],[4,1],[3],[7]]
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(4);
        obj.get(1);


    }

    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */

}
