package com.collection.javaCollection;

public class CollectionCollections {
    public static void main(String[] args) {

        /*  Collection vs Collections

        Collection:
        Collection is a interface present in java.util package. It is used to represent a group of individual objects as a single unit.
        It is similar to the container in the C++ language. The collection is considered as the root interface of the collection framework.
        It provides several classes and interfaces to represent a group of individual objects as a single unit.

            The List, Set, and Queue are the main sub-interfaces of the collection interface.
            The map interface is also part of the java collection framework, but it doesn't inherit the collection of the interface.
            The add(), remove(), clear(), size(), and contains() are the important methods of the Collection interface.

        Declaration:

            public interface Collection<E> extends Iterable<E>

            Type Parameters: E - the type of elements returned by this iterator


        Collections:
        Collections is a utility class present in java.util package. It defines several utility methods like sorting and searching which is used to operate on collection.
        It has all static methods. These methods provide much-needed convenience to developers, allowing them to effectively work with Collection Framework.
        For example, It has a method sort() to sort the collection elements according to default sorting order, and it has a method min(), and max() to find
        the minimum and maximum value respectively in the collection elements.

        Declaration:
            public class Collections extends Object



        Collection vs Collections:

            | Feature | Collection                  | Collections         |
            | ------- | --------------------------- | ------------------- |
            | Type    | Interface                   | Utility Class       |
            | Purpose | Store group of objects      | Perform operations  |
            | Methods | Abstract + default + static | Only static methods |
            | Usage   | Data structure              | Helper methods      |

        Collection is an interface used to store a group of objects, whereas Collections is a utility class that provides static methods to perform operations on collections.

        */

    }
}
