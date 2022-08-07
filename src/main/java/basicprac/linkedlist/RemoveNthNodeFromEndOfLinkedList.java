package basicprac.linkedlist;

public class RemoveNthNodeFromEndOfLinkedList {
    private static class ListNode {
        int data;
        ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static void print(ListNode node) {
        if (node == null) {
            System.out.println("null");
        }
        while (node != null) {
            System.out.print(node.data + "--->");
            node = node.next;
        }
        System.out.println("null");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }


    public static void main(String[] args) {
        ListNode newNode;
        ListNode head = new ListNode(1);
        newNode = new ListNode(2);
        head.next = newNode;
        newNode = new ListNode(3);
        head.next.next = newNode;
        newNode = new ListNode(4);
        head.next.next.next = newNode;
        newNode = new ListNode(5);
        head.next.next.next.next = newNode;
        head.next.next.next.next.next = null;
        print(head);
        removeNthFromEnd(head, 2);
        print(head);

    }
}
