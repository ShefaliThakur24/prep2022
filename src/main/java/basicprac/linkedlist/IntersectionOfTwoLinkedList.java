package basicprac.linkedlist;

import java.util.Objects;

public class IntersectionOfTwoLinkedList {
    private ListNode head;

    private static class ListNode {
        int data;
        ListNode next;


       public ListNode(int data) {
          this.data = data;
        this.next = null;
       }

    }

//    public void insertLast(int value) {
//        ListNode newNode = new ListNode(value);
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//        ListNode current = head;
//        while (current.next != null) {
//            current = current.next;
//
//        }
//        current.next = newNode;
//    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static ListNode getInterstionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        if (a == null || b == null) {
            return null;
        }
        while (a != b) {

            a = a.next;
            b = b.next;
            if (a == b) {

                return a;
            }
            if (a == null) {
                a = headB;
            }
            if (b == null) {
                b = headA;
            }
        }
        return a;
    }

    static void print(ListNode node)
    {
        if (node == null)
            System.out.print("null");
        while (node.next != null) {
            System.out.print(node.data+ "-->");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public static void main(String[] args) {


        ListNode newNode;

        ListNode head1 = new ListNode(10);

        ListNode head2 = new ListNode(3);

        newNode = new ListNode(6);

        head2.next = newNode;
        newNode = new ListNode(9);

        head2.next.next = newNode;
        newNode = new ListNode(15);

        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new ListNode(30);

        head1.next.next = newNode;
        head1.next.next.next = null;

        ListNode intersect_node = null;


//        IntersectionOfTwoLinkedList pll1 = new IntersectionOfTwoLinkedList();
//        IntersectionOfTwoLinkedList pll2 = new IntersectionOfTwoLinkedList();
//        pll1.insertLast(1);
//        pll1.insertLast(9);
//        pll1.insertLast(1);
//        pll1.insertLast(2);
//        pll1.insertLast(4);
//        pll1.display();
//        pll2.insertLast(3);
//        pll2.insertLast(2);
//        pll2.insertLast(4);
//        pll2.display();
        intersect_node = getInterstionNode(head1, head2);
        print(intersect_node);



    }
}
