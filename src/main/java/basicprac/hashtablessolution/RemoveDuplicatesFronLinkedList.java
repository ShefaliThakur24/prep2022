package basicprac.hashtablessolution;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;

public class RemoveDuplicatesFronLinkedList {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println("null");
    }


    public  static void removeaDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            int currentvalue = current.val;
            // If current value is seen before
            if (set.contains(currentvalue)) {
                prev.next = current.next;
            } else {
                set.add(currentvalue);
                prev = current;
            }
            current = current.next;
        }

    }

    public static void main(String[] args) {
        /* The constructed linked list is:
         10->12->11->11->12->11->10*/
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before removing duplicates :");
        printList(head);
        removeaDuplicates(head);
        printList(head);

    }
}
