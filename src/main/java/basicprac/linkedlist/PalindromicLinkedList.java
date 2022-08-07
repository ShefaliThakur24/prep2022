package basicprac.linkedlist;

public class PalindromicLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //find middle of linked list
    public ListNode getMiddleElement() {
        ListNode slowptr = head;
        ListNode fastptr = head;
        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }

    public ListNode reverseList(ListNode head) {
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
        return previous;
    }


    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;

        }
        current.next = newNode;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean isPalindromic(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slowptr = getMiddleElement();
//reverse the right half=
        slowptr.next = reverseList(slowptr.next);
        //move slow to right half;
        slowptr = slowptr.next;
        //check for left half right half equal or not

        while (slowptr != null)
        {
            if (head.data != slowptr.data) {
                return false;
            }
            head = head.next;
            slowptr = slowptr.next;

        }
        return true;

    }

    public static void main(String[] args) {
        PalindromicLinkedList pll = new PalindromicLinkedList();
        pll.insertLast(1);
        pll.insertLast(2);
        pll.insertLast(3);
        pll.insertLast(2);
        pll.insertLast(1);
        pll.display();
        System.out.println(pll.isPalindromic(pll.head));


    }
}
