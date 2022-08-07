package basicprac.linkedlist;

public class ReverseSinglylinkedList {
    //private ListNode head;

    ////instance variable it will hold the linkedlist for us
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "---->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;//because previous becomes are new head so we return the prevoius

    }


    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        head.next = second;
        second.next = third;
        third.next = fourth;


        ReverseSinglylinkedList rssl = new ReverseSinglylinkedList();
        rssl.display(head);
        ListNode reversesll = rssl.reverse(head);
        rssl.display(reversesll);
    }


}
