package com.collection.javaCollection;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnArrayDequeue {
    public static void main(String[] args) {

        Deque<Integer> qu = new ArrayDeque<>();
//        ArrayDeque<Integer> qu = new ArrayDeque<>();

        qu.offer(20);
        qu.offer(10);
        qu.offerFirst(5);
        qu.offer(10);
        qu.offerLast(200);
        qu.offerFirst(206);

        System.out.println(qu);

        System.out.println(qu.peek());
        System.out.println(qu.peekFirst());
        System.out.println(qu.peekLast());

        System.out.println(qu.poll());
        System.out.println(qu.pollFirst());
        System.out.println(qu.pollLast());

        System.out.println(qu);


        /*
        Deque
        The Deque interface is part of the java.util package and extends the Queue interface.
        It stands for Double-Ended Queue and represents a linear collection that allows insertion, removal, and retrieval of elements from both ends.

        Flexible Data Structure: Can be used as a stack (LIFO) or a queue (FIFO).
        Deque allows null depending on implementation, but most throw NullPointerException (ArrayDeque, ConcurrentLinkedDeque).
        Resizable Implementations: Implementations like ArrayDeque grow dynamically as needed.
        Thread Safety: Most implementations are not thread-safe; synchronization is required for concurrent use.

        Common Implementations classes
            ArrayDeque: Resizable array implementation; fast for insertion/removal at both ends; not thread-safe.
            LinkedList: Doubly-linked list; supports all deque operations; allows nulls.
            ConcurrentLinkedDeque: Thread-safe deque based on linked nodes; suitable for concurrent use.


        --ArrayDeque


            ArrayDeque is a resizable-array implementation of the Deque interface in Java.
            It is part of java.util package provides a double-ended queue implementation, allowing elements to be added or removed from both ends efficiently.

            ArrayDeque grows dynamically.
            It generally provides faster operations than LinkedList as it is more cache friendly and does not require overhead of next previous reference management.
            Operations like addFirst(), addLast(), removeFirst(), removeLast() are all done in constant time O(1).
            ArrayDeque is not Thread-Safe
        */
    }
}
