package basicprac.linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class SortMerge {

    public Node sortedMergedLinkedList(Node head1, Node head2) {

        Node dummyNode = new Node(0);

        Node current = dummyNode;
        while (true) {
            if (head1 == null) {
                current.next = head2;
                break;
            } else if (head2 == null) {
                current.next = head1;
                break;
            } else if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        return current.next;
    }

}

public class MergedTwoSortedLinkedList {

    Node head;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                temp.next = node;
            }
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergedTwoSortedLinkedList mll = new MergedTwoSortedLinkedList();
        MergedTwoSortedLinkedList mll2 = new MergedTwoSortedLinkedList();
        SortMerge sortMerge = new SortMerge();

        mll.addToTheLast(new Node(5));
        mll.addToTheLast(new Node(10));
        mll.addToTheLast(new Node(15));

        mll2.addToTheLast(new Node(2));
        mll2.addToTheLast(new Node(3));
        mll2.addToTheLast(new Node(20));

        Node head = sortMerge.sortedMergedLinkedList(mll.head, mll2.head);
        mll.printList(head);

    }

}
