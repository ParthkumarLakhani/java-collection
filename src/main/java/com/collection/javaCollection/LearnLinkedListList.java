package com.collection.javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnLinkedListList {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
//        LinkedList<Integer> lists = new LinkedList<>();

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
            List<Integer> list = new LinkedList<>();
            LinkedList<Integer> lists = new LinkedList<>();


            Same as the AryList.


        🔥 ArrayList vs LinkedList (Interview-Ready Table)

        | Feature             | ArrayList         | LinkedList            |
        | ------------------- | ----------------- | --------------------- |
        | Data Structure      | Dynamic Array     | Doubly Linked List    |
        | Memory              | Less (contiguous) | More (extra pointers) |
        | Access (get)        | O(1) ⚡            | O(N) 🐢               |
        | Add (end)           | O(1)*             | O(1)                  |
        | Add (middle)        | O(N)              | O(N)                  |
        | Remove (middle)     | O(N)              | O(N)                  |
        | Remove (first/last) | O(N) / O(1)       | O(1)                  |
        | Iteration           | Faster            | Slower                |
        | Cache Friendly      | ✅ Yes             | ❌ No                  |


        ⚠️ Important Corrections (VERY IMPORTANT)
            ❌ “Insertion and deletion is faster in LinkedList”
            This is half-truth
            Correct version:
                Fast only if you already have node reference
                Otherwise → traversal = O(N)

        🧠 Real Meaning (Interview Depth)
            🔹 ArrayList
                Uses continuous memory
                Shifting required → slow insert/delete
                Very fast read (cache-friendly)

            🔹 LinkedList
                Uses nodes (prev + next pointers)
                No shifting
                But traversal needed → slow access

        🔥 Practical Reality (VERY IMPORTANT)

        In real-world (Spring Boot / APIs):
        ArrayList is used ~90% of the time

        ❌ LinkedList is rarely used because:
            More memory
            Poor cache performance
            Slower in practice (even if theoretically better for insert/delete)

        🎯 Interview One-Liner (Best Answer)
            ArrayList is preferred for fast random access, while LinkedList is useful when frequent insertions and deletions are required,
            but in practice ArrayList is used more due to better cache performance.

        */


    }
}
