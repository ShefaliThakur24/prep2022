package basicprac.priorityqueue;
//A PriorityQueue is used when the objects
// are supposed to be processed based on the priority.
// It is known that a Queue follows the First-In-First-Out algorithm,
// but sometimes the elements of the queue are needed to be processed according to the priority,
// that’s when the PriorityQueue comes into play.
/*
* PriorityQueue doesn’t permit null.
We can’t create a PriorityQueue of Objects that are non-comparable
PriorityQueue are unbound queues.
The head of this queue is the least element with respect to the specified ordering.
*  If multiple elements are tied for the least value, the head is one of those elements — ties are broken arbitrarily.
Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a java multithreading environment.
The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
It provides O(log(n)) time for add and poll methods.
It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class.*/

/*
* The PriorityQueue is based on the priority heap.
* The elements of the priority queue are ordered according to the natural ordering,
* or by a Comparator provided at queue construction time, depending on which constructor is used.  */

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {


        PriorityQueue<Integer> pr = new PriorityQueue();
        pr.add(750);
        pr.add(900);pr.add(500);pr.add(100);pr.add(50);
        System.out.println(pr.size());
        System.out.println(pr.poll());


    }
}