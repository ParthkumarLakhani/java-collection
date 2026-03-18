package com.collection.javaCollection;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> student = new Stack<>();

        student.push("");
        student.push("Kumar");
        student.push("patel");
        student.push("ketam");
        System.out.println("student: "+student);

        System.out.println("student: "+student.peek());

        System.out.println("student: "+student.pop());

        student.push("Kumar");

        System.out.println("student: "+student);


        /*
        In Java, a Stack is a linear data structure that follows the Last In First Out (LIFO) principle and is defined in the java.util package.
        Internally, it extends the Vector class. It is a thread-safe class. It is recommended to use ArrayDeque for stack implementation as it
        is more efficient in a single-threaded environment.

        - Stack class maintains insertion order and allows duplicates and null values.
        - Grows dynamically when its capacity is exceeded.
        - All the methods of Stack are synchronized. It is thread-safe.
        - Stack is considered a legacy class, introduced in early versions of Java and a preferred solution to implement Stack Data Structure
          (especially when thread synchronization is not needed) is either to use ArrayDeque or LinkedList.
        - Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.

        */
    }
}
