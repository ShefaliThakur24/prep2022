package basicprac.linkedlist;

public class SinglyLinkedList {
    private ListNode head; //instance variable it will hold the linkedlist for us

    private static class ListNode {
        private int data;
        private ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //to get length of singly linkedlist

    public int length() {
        if (head == null)
            return 0;
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    //insert node in the beginning
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    //insert node at the end

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

    //insert at middle

    public void insertAtPosition(int position, int value, int length) {
        ListNode node = new ListNode(value);
        if (position == 0 || position > length) {
//            System.out.println("Invalid position");
//            return;
            throw new IllegalArgumentException();
        } else if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;//position-1
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;

        }

    }

    //delete first node of singlylinked list;

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //delete last node of singlylinked list;

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;//break the chain
        return current;

    }
    //delete middle node of singlylinked list;3-->4--->7---->8---->9--->null

    public void delete(int position, int length) {
        //position is valid and starting from 1
        if (position <= 0 || position > length) {
            throw new IllegalArgumentException();

        }
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

//How to remove a given key from Singly Linked List in Java?

    public void deleteNode(int key) {
        ListNode current = head;
        ListNode previous = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;

        }
        while (current != null && current.data != key) {

            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        previous.next = current.next;
    }
//How to insert a node in a sorted Singly Linked List in Java ?

    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;

        }
        ListNode current = head;
        ListNode previous = null;

        while (current != null && current.data < newNode.data) {
            previous = current;
            current = current.next;
        }

        newNode.next = current;
        previous.next = newNode;
        return head;
    }

    //How to remove duplicate from sorted Singy Linked List in Java?
    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

//How to find middle node in a Singly Linked List in Java?


    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }
        ListNode slowptr = head;
        ListNode fastptr = head;

        while (fastptr != null && fastptr.next != null) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }

    //How to find nth node from the end of a Singly Linked List in Java?
    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value");

        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + "is greater than the total number of nodes in the list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    //Detect a loop in a Singly Linked List in Java |
    public boolean containsLoop() {
        ListNode fastptr = head;
        ListNode slowPtr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastptr) {
                return true;
            }

        }
        return false;
    }

    public void createLoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;


    }

    //How to find start of a loop in a Singly Linked List?

    private ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;//now we have two nodes slowPtr node and temp node where temp node //
// is pointing to the head of ssl and slow pointer pointing to the meeting point of slow and fast pointer and that point
// will be inside the loop;
        while (temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;//starting node of the loop
    }

    public ListNode startNodeInALoop() {
        ListNode fastptr = head;
        ListNode slowPtr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastptr) {//meeting point
                return getStartingNode(slowPtr);//meeting point becomes first node
            }

        }
        return null;
    }

    //How to remove loop from a Singly Linked List?
    public void removeLoop() {
        ListNode fastptr = head;
        ListNode slowPtr = head;
        while (fastptr != null && fastptr.next != null) {
            fastptr = fastptr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastptr) {
                removeLoop(slowPtr);
                return;
            }

        }
    }

    private void removeLoop(ListNode slowPtr) {
        ListNode temp = head;//now we have two nodes slowPtr node and temp node where temp node //
// is pointing to the head of ssl and slow pointer pointing to the meeting point of slow and fast pointer and that point
// will be inside the loop;
        while (temp.next != slowPtr.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }


    //Add nodes in singlylinkedlist
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList sll1 = new SinglyLinkedList();
        SinglyLinkedList sll2 = new SinglyLinkedList();// AS soon as we initialize the singlylinked list the value of head is null
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);
//        //now we will connect them together to form a chain which is our singly linked list
//        sll.head.next = second;//10--->1
//        second.next = third;//10--->1--->8
//        third.next = fourth;//10--->1--->8--->11--->null
//        sll.insertFirst(3);
//        sll.insertFirst(3);
//        sll.insertFirst(2);
//        sll.insertFirst(1);
//        sll.insertFirst(1);
//        sll.insertFirst(15);
//        sll.insertFirst(11);
//        sll.insertFirst(1);
//        sll.insertFirst(8);
//        sll.insertFirst(10);
//        //sll.insertFirst(1);
//        sll.display();

//        sll.insertLast(1);
//        sll.insertLast(8);
//        sll.insertLast(10);
//        sll.insertLast(11);
//        sll.insertAtPosition(1, 3, sll.length());
//        sll.insertAtPosition(2, 5, sll.length());
//        sll.insertAtPosition(1, 2, sll.length());
//        sll.insertAtPosition(2, 4, sll.length());
//        sll.insertAtPosition(5,7,sll.length());
        // sll.display();
        //  System.out.println(sll.deleteFirst().data);
        //  System.out.println(sll.deleteFirst().data);
//        System.out.println(sll.deleteLast().data);
//        System.out.println(sll.deleteLast().data);
//        System.out.println(sll.deleteLast().data);
//        System.out.println(sll.deleteLast().data);
//        System.out.println(sll.deleteLast().data);

//        sll.delete(1);
//        sll.delete(6, sll.length());
//        sll.delete(2);
        //  sll.deleteNode(1);

        //sll.display();
        //sll.insertInSortedList(7);
        // sll.removeDuplicates();
        // ListNode nthNode=sll.getNthNodeFromEnd(2);
//        ListNode nthNode=sll.getNthNodeFromEnd(6);
//        System.out.println("nth node is " + nthNode.data);
//        sll.createLoopInLinkedList();
//        System.out.println(sll.containsLoop());
//        System.out.println(sll.startNodeInALoop().data);
//        sll.removeLoop();
      //merge two sorted linked list

        sll1.insertLast(1);
        sll1.insertLast(4);
        sll1.insertLast(8);
        sll1.display();
        sll2.insertLast(3);
        sll2.insertLast(5);
        sll2.insertLast(8);
        sll2.insertLast(9);
        sll2.insertLast(14);
        sll2.insertLast(18);
        sll2.display();
        SinglyLinkedList rsult = new SinglyLinkedList();
        rsult.head = merge(sll1.head, sll2.head);
        rsult.display();
        //sll.display();
        //  System.out.println("Length is -" + sll.length());
//        ListNode middlenode= sll.getMiddleNode();
//        System.out.println(middlenode.data);

    }

    //print elements of singlylinkedlist
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }


    // Merge Two Sorted Lists

    public static ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);//this will  hold our merge sorted
        // linked list it is actually providing us the concrete object in our heap.so as to avoid null pointer exception
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }//when one of the list gets exhausted.
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return dummy.next;//all the nodes were added after dummy object so to return head//
        //we are doing dummy.next.

    }
}
