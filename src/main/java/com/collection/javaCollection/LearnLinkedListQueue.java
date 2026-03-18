package com.collection.javaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> qu = new LinkedList<>();

        qu.offer(12);
        qu.offer(45);
        qu.offer(0);
        qu.offer(2);
        System.out.println(qu);

        System.out.println(qu.peek());
        System.out.println(qu.poll());

        System.out.println(qu);


        /*
        if you see linkedlist present in list as well as in queue. so linkedlist is a basically class. so class can implement multiple interfaces

        LinkedList is a part of the Java Collections Framework and is present in the java.util package. It implements a doubly linked list where elements are stored
        as nodes containing data and references to the previous and next nodes, rather than in contiguous memory locations.

            The size of the LinkedList can grow or shrink dynamically at runtime.
            Maintains the order in which elements are inserted.
            Multiple duplicate elements can be stored.
            LinkedList is not thread-safe by default; it can be synchronized using Collections.synchronizedList().
            Provides better performance than ArrayList for insertion and deletion operations, especially at the beginning or middle.

        Note: LinkedList nodes cannot be accessed directly by index; elements must be accessed by traversing from the head.

        */


        /*  Methods of Queue
        The Queue interface includes all the methods of the Collection interface. It is because Collection is the super interface of Queue.

        Some of the commonly used methods of the Queue interface are:

            add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
            offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.

            element() - Returns the head of the queue. Throws an exception if the queue is empty.
            peek() - Returns the head of the queue. Returns null if the queue is empty.

            remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
            poll() - Returns and removes the head of the queue. Returns null if the queue is empty.

         */



    }
}
