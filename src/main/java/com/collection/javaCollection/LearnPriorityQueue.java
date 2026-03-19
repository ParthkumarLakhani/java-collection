package com.collection.javaCollection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

//        Queue<Integer> qu = new PriorityQueue<>(); //min-heap
        Queue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder()); //max-heap

        qu.offer(12);
        qu.offer(45);
        qu.offer(0);
        qu.offer(2);
        System.out.println(qu);

        System.out.println(qu.peek());
        System.out.println(qu.poll());

        System.out.println(qu);

        /*
        The Queue interface is part of the java.util package. It extends the Collection interface.

            Elements are processed in the order determined by the queue implementation (First In First Out or FIFO for LinkedList, priority order for PriorityQueue).
            Elements cannot be accessed directly by index.
            A queue can store duplicate elements.

        Note: PriorityQueue arranges elements according to priority order (ascending by default), not insertion order.


        A PriorityQueue in Java is a queue where elements are ordered based on their priority, rather than the order of insertion.
        By default, it uses natural ordering (min-heap), but a custom comparator can be used to define different priorities.

            Elements are processed based on priority rather than insertion order.
            Supports standard queue operations like add(), poll(), and peek().
            Automatically grows as elements are added.
            Uses a heap data structure internally to ensure efficient insertion and removal of the highest-priority element.

        */

    }
}
