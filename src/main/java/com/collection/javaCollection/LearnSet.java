package com.collection.javaCollection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedList<>();
        Set<Integer> set = new TreeSet<>();

        set.add(112);
        set.add(212);
        set.add(142);
        set.add(12);

        System.out.println("Set: "+set);

        set.add(1432);
        set.add(142);

        set.remove(1432);

        System.out.println("Contains: "+set.contains(142));
        System.out.println("Empty: "+set.isEmpty());

        System.out.println("Set: "+set);

        set.clear();

        System.out.println("Set: "+set);


        /*
        Set
        In Java, the Set interface is a part of the Java Collection Framework, located in the java.util package.
        It represents a collection of unique elements, meaning it does not allow duplicate values.

            The set interface does not allow duplicate elements.
            It can contain at most one null value except TreeSet implementation which does not allow null.
            The set interface provides efficient search, insertion, and deletion operations.


        Classes that implement the Set interface
            HashSet: A set that stores unique elements without any specific order, using a hash table and allows one null element.
            EnumSet : A high-performance set designed specifically for enum types, where all elements must belong to the same enum.
            LinkedHashSet: A set that maintains the order of insertion while storing unique elements.
            TreeSet: A set that stores unique elements in sorted order, either by natural ordering or a specified comparator.


        🔷 How Set Works Internally (General Concept)
            First Important Point
            Set is an interface, not a class.
            So:
                It does NOT have its own internal working
                Its behavior depends on the implementation class

        🔷 Common Implementations of Set
            1. HashSet
                Uses hashing (HashMap internally)
                No order
                Fast (O(1) average)

            2. LinkedHashSet
                Uses hashing + linked list
                Maintains insertion order

            3. TreeSet
                Uses tree structure (Red-Black Tree)
                Sorted order
                Slower than HashSet (O(log n))


        🔷 Core Rule of Set (Applies to ALL)
            A Set does not allow duplicate elements
        How it ensures this depends on implementation

        1. HashSet
            Uses:
                hashCode() → find location or to find bucket
                equals() → check duplicate
            Fast lookup

        2. LinkedHashSet
                Same as HashSet +
                Maintains a linked list for order
            Order preserved

        3. TreeSet
            Uses:
                compareTo() OR Comparator
                Stores elements in sorted order

        Duplicate check:
            compareTo() == 0 → duplicate


        Set is an interface that ensures uniqueness of elements, and its internal working depends on implementation like HashSet (hashing),
        LinkedHashSet (hashing + order), and TreeSet (sorting using tree structure).

        Simple Analogy 🧠
        Think of Set like:
            HashSet → Random locker system (fast, no order)
            LinkedHashSet → Locker + entry register (order maintained)
            TreeSet → Sorted bookshelf (always arranged)





        //hashset
        here set will create a hash(like atgbfioa,..) of each element internally, and that hash put into the collection and based on that corresponding value are here.
        and also check that newly element's hash is present or not ??
        almost all operation take O(1).

        Simple & Clear Version
            A Set (like HashSet) internally uses hashing to store elements.
            When a new element is added, it generates a hash value and checks whether an element with the same hash already exists.
            If it exists, it does not add the duplicate; otherwise, it stores the element.


        More Accurate (Interview-Level)
            HashSet stores elements using a hash-based mechanism (internally backed by a HashMap).
            When you add an element:
                A hash code is generated using hashCode().
                Based on this hash, a bucket/index is calculated.
                It checks inside that bucket using equals() to see if the element already exists.
                If not present, the element is added; otherwise, it is ignored (to maintain uniqueness).


        ⚠️ Important Correction (Very Important for Interview)
        Your original sentence:
            "check that newly element's hash is present or not"

        Better understanding:
                👉 Same hash ≠ same object
                👉 So Java also uses equals() after hash check

        HashSet uses hashCode() to find the bucket and equals() to ensure no duplicate elements are stored.





        //LinkedHashSet
        LinkedHashSet in Java implements the Set interface of the Collections Framework.

            It combines the functionalities of a HashSet with a doubly-linked list to maintain the insertion order of elements.
            LinkedHashSet stores unique elements only and allows a single null.
            Implements Set, Cloneable and Serializable interfaces.




        //TreeSet
        A TreeSet is a collection class that stores unique elements in a sorted order.
        It is part of java.util package that implements the SortedSet interface, and internally uses a Red-Black tree to maintain sorting.
        almost all operation take O(log n).


            Does not allow duplicates and null values. From JDK 7 onward, inserting null throws NullPointerException.
            Implements the NavigableSet interface and provides navigation methods like higher(), lower(), ceiling() and floor().
            TreeSet is not synchronized. it must be synchronized using Collections.synchronizedSet().


        Note:
            A class must implement Comparable (or provide a Comparator) to be stored in a TreeSet.
            Built-in classes like String, wrapper classes, etc., already implement Comparable



            //For the primitive type set is avoid duplicate but what if non-primitive ?? please check student class
        */


    }
}
