package basicprac.linkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length; //return the count of listnodes in doubly linked list

    private class ListNode {
        private int data;// generic type
        ListNode next;
        ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }

    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;

    }

    public boolean isEmpty() {
        return head == null;// or length ==0;any of the two
    }

    public int length() {
        return length;
    }

    //How to print elements of a Doubly Linked List in Java ?
    public void displayForward() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.print("null");
    }


    public void displayBackward() {
        if (tail == null) {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "---->");
            temp = temp.previous;
        }
        System.out.print("null");
        System.out.println();
    }

    //How to insert node at the beginning of a Doubly Linked List in Java ?

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //Insert node at the end of a Doubly Linked List in Java
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }
//How to delete first node in a Doubly Linked List in Java ?

    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }


    //How to delete last node in a Doubly Linked List in Java ?

    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }



    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
//        dll.insertFirst(1);
//        dll.insertFirst(5);
//        dll.insertFirst(17);
//        dll.insertFirst(11);
        dll.insertLast(1);
        dll.insertLast(5);
        dll.insertLast(17);
        dll.insertLast(11);
        dll.displayForward();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
//        dll.deleteFirst();
        dll.deleteLast();
        dll.deleteLast();
        dll.deleteLast();

        dll.displayForward();


        // dll.displayBackward();


    }
}
