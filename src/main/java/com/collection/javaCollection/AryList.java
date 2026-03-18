package com.collection.javaCollection;

import java.util.ArrayList;
import java.util.List;


public class AryList {
    public static void main(String[] args) {

        //ArrayList

        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(41);
        list.add(71);
        System.out.println(list);
        list.add(1);
        list.add(2);
        System.out.println(list);

        list.add(2,100);

        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(101);
        newList.add(105);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.remove(0));
        System.out.println(list);

        System.out.println(list.contains(50));

        list.clear();
        System.out.println(list);



        /*
        List<Integer> li = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<Integer>();

        what is difference between them ?? Both are same ??  method ares different ??

        Core Difference
        | Feature                  | `List<Integer> li = new ArrayList<>();` | `ArrayList<Integer> a = new ArrayList<>();` |
        | ------------------------ | --------------------------------------- | ------------------------------------------- |
        | Type                     | Interface reference                     | Concrete class reference                    |
        | Flexibility              | ✅ High                                  | ❌ Low                                       |
        | Switching implementation | Easy                                    | Hard                                        |
        | Accessible methods       | Only `List` methods                     | All `ArrayList` methods                     |


        Explanation (Simple)
        1.  List<Integer> li = new ArrayList<>();
            You are using interface (List) as reference
            Object is still ArrayList

            This is called:
                👉 Upcasting / Programming to Interface

            ✔ Advantage:
                li = new LinkedList<>();
                li = new Vector<>();
            👉 You can switch implementation anytime



        2. ❌ ArrayList<Integer> a = new ArrayList<>();
            You are tightly coupled to ArrayList
            Cannot change easily to other implementations

            ❌ Example:
                a = new LinkedList<>(); // ❌ Compile error

        🔥 Interview Answer (Perfect Line)
            Both create an ArrayList object, but using List reference provides abstraction and flexibility,
            while using ArrayList reference allows access to implementation-specific methods but creates tight coupling.


        🎯 Best Practice
        👉 Always prefer:
            List<Integer> list = new ArrayList<>();
        Because:
            Loose coupling
            Better design
            Easy to maintain & scale

        🚀 Real-World Example (Spring Boot)
            List<User> users = new ArrayList<>();

        Later you can change:
            List<User> users = new LinkedList<>();

        👉 No code changes needed elsewhere ✔

        */

        /* Internal Working Of ArrayList

        🔑 1. What is ArrayList internally ?
            ArrayList is backed by a dynamic array
                    transient Object[] elementData;

            Internally it uses an array
            Size grows dynamically when needed


        📦 2. Default Capacity
            ArrayList<Integer> list = new ArrayList<>();

                Initial capacity = 0 (Java 8+ optimization)

            When first element is added:
                Capacity becomes 10

           3. How Add Works
            Case 1: Space Available
                list.add(10);

               Simply adds element at next index
               Time Complexity = O(1)

            Case 2: No Space (Resize Happens)
                When array is full:
                    newCapacity = oldCapacity + (oldCapacity >> 1);
                Means:
                    New Capacity = 1.5 × old capacity

                Example:
                    10 → 15 → 22 → 33 → ...
                Then:
                    New array created
                    Old elements copied
                    New element added

                👉 Time Complexity = O(N) (for resizing)


           ⚡ 4. Why Add is “Amortized O(1)”?
                Because resizing doesn’t happen every time
                    Most inserts → O(1)
                    Few inserts → O(N)
                Average = Amortized O(1)

           5. How Get Works
                list.get(index);
            👉 Direct array access:
                return elementData[index];

            ✔ Time Complexity = O(1) (very fast)


        6. How Remove Works
                list.remove(index);
            Steps:
                Remove element
                Shift remaining elements left

                System.arraycopy(...)

            👉 Time Complexity = O(N)


        7. How Set (Replace) Works
            list.set(index, value);
            👉 Direct replacement in array

            ✔ Time Complexity = O(1)

        8. Memory Behavior
            Stores elements in continuous memory
            Better cache performance
            Faster iteration than LinkedList

        ⚠️9. Important Interview Points
            🔸 Not Synchronized
                Not thread-safe
                Use:
                    Collections.synchronizedList(new ArrayList<>());

            🔸 Allows Duplicates
                list.add(10);
                list.add(10); // allowed

            🔸 Allows Null
                list.add(null);


          ArrayList internally uses a dynamic array. When capacity is exceeded, it resizes by 1.5x and copies elements to a new array.
          This makes add operation amortized O(1), while get is O(1) and remove is O(N) due to shifting.


        */

        /* Operation
            Maintains insertion order
            Allows duplicate elements
            Supports null elements (implementation dependent)
            Supports bidirectional traversal using ListIterator

            ArrayList is not thread-safe. To make it thread-safe, you must wrap it manually using Collections.synchronizedList().


        Java List - Operations

        1. Adding Elements
            To add an element to the list, we can use the add() method. This method is overloaded to perform multiple operations based on different parameters.

                add(Object o): This method is used to add an element at the end of the List.
                add(int index, Object o): This method is used to add an element at a specific index in the List

            Note: If we try to add element at index 1 before adding elements at  index 0 it will throw an error.
            It is always recommended to add elements in a particular index only when the size is defined or to add them sequentially.


        2. Updating Elements
            To update an element in a list, use the set() method with the target index and the new value.
            Since List is indexed, the element is replaced at the specified position.

                set(1, "For");


        3. Searching Elements
            Searching in a List can be done using indexOf(), lastIndexOf() methods.

                indexOf(Object o): It returns the index of the first occurrence of the specified element in the list or -1 if the element is not found
                lastIndexOf(Object o): It returns the index of the last occurrence of the specified element in the list or -1 if the element is not found


        4. Removing Elements
            To remove an element from a list, we can use the remove() method. This method is overloaded to perform multiple operations based on different parameters.

                remove(Object o): Removes the first occurrence of the specified object from the list.
                remove(int index): Removes the element at the specified index and shifts subsequent elements left.


        5. Accessing Elements
            To access an element in the list, we can use the get() method, which returns the element at the specified index.

                get(int index): This method returns the element at the specified index in the list.


        6. Checking if an element is present or not
            To check if an element is present in the list, we can use the contains() method. This method returns true if the specified element is present in the list, otherwise, it returns false.

                contains(Object o): This method takes a single parameter, the object to be checked if it is present in the list.


            //Complexity see later

        */

        /* question

        1. What is difference between size and length ??
        🔥 Difference Between size and length in Java

        | Feature  | `length`            | `size()`                     |
        | -------- | ------------------- | ---------------------------- |
        | Type     | Property (variable) | Method                       |
        | Used for | Arrays              | Collections (List, Set, Map) |
        | Syntax   | `arr.length`        | `list.size()`                |
        | Brackets | ❌ No brackets       | ✅ Requires `()`              |
        | Package  | Core Java (array)   | Java Collections Framework   |


            length is a property used for arrays, while size() is a method used in collections to return the number of elements
        */

    }
}
