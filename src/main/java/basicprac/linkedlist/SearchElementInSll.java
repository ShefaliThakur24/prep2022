package basicprac.linkedlist;

public class SearchElementInSll {
    private ListNode head; //instance variable it will hold the linkedlist for us

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
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean find(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;

        }
        return false;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        head.next = second;
        second.next = third;
        third.next = fourth;

        SearchElementInSll sll = new SearchElementInSll();
        sll.display(head);
        if (sll.find(head, 133)) {
            System.out.println("Search key Found");

        } else {
            System.out.println("Search key not Found");
        }

    }
}
