package com.faang.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterationUsingListIterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        //Getting list iterator
        ListIterator <Integer> itr = list.listIterator();
        //// Traversing elements
        System.out.println("Forward Direction Iteration:");
        while(itr.hasNext()){
            System.out.println("Next element is " + itr.next() +
                    " and next index is " +itr.nextIndex());
        }
// Traversing elements, the iterator is at the end at this point
        System.out.println("Backward Direction Iteration:");
        while(itr.hasPrevious())
        {
            System.out.println("Previous element is " +itr.previous() +
                    " and previous index is " +  itr.previousIndex());
        }
        }
    }

