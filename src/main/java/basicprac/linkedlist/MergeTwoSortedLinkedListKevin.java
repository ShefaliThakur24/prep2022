package basicprac.linkedlist;


public class MergeTwoSortedLinkedListKevin {

    public Node mergeTwoSorted(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node head = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                dummy.next = l1;
                l1 = l1.next;

            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        if (l1 != null) {
            dummy.next = l1;
        }
        if (l2 != null) {
            dummy.next = l2;
        }
        return head.next;
    }


}
