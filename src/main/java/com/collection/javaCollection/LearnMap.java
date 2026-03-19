package com.collection.javaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {

//        Map<String, Integer> num = new HashMap<>();
        Map<String, Integer> num = new TreeMap<>();

        num.put("one",1);
        num.put("two",2);
        num.put("three",3);

        num.put("three",5); //override

        System.out.println("num: "+num);

//        if(!num.containsKey("four")){
//            num.put("four",4);
//        }
        num.putIfAbsent("five",5);

        num.putIfAbsent("four",4);

        System.out.println(num.isEmpty());

        System.out.println("num: "+num);


        //iteration
        for( Map.Entry<String,Integer> e: num.entrySet()){
//            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key:num.keySet()){
            System.out.println(key);
        }
        for(Integer val: num.values()){
            System.out.println(val);
        }



        /*
        Map Interface
        In Java, the Map Interface is part of the java.util package and represents a collection of key-value pairs,
        where Keys should be unique, but values can be duplicated.

        It provides efficient retrieval, insertion, and deletion operations based on keys.
        HashMap and LinkedHashMap allow one null key, and TreeMap does NOT allow null keys (if natural ordering is used).
        Use ConcurrentHashMap for thread-safe operations, or Collections.synchronizedMap() to make an existing map synchronized.
        Declaration of the Map interface
        public interface Map<K, V>

        K -> Type of keys maintained by the map
        V -> Type of mapped values

        Implemented Classes of Map Interface
            HashMap: Stores key-value pairs using hashing for fast access, insertion, and deletion.
            LinkedHashMap: Similar to HashMap but maintains the insertion order of key-value pairs.
            TreeMap: Stores key-value pairs in sorted order using natural ordering or a custom comparator.
            Hashtable: A synchronized Map implementation that doesn’t allow null keys or values.



        //tree and hash map are mostly used

        //hashmap
            A HashMap is a part of Java’s Collection Framework and implements the Map interface.
            It stores elements in key-value pairs, where, Keys are unique. and Values can be duplicated.

        Internally uses Hashing, hence allows efficient key-based retrieval, insertion, and removal with an average of O(1) time.
        HashMap is not thread-safe, to make it synchronized, use Collections.synchronizedMap().
        Insertion order is not preserved in HashMap. To preserve the insertion order, LinkedHashMap is used and to maintain sorted order, TreeMap is used.


        //Treemap
        A TreeMap in Java is a part of the java.util package that implements the Map interface.
        It stores key-value pairs in a sorted order using either a natural or custom comparator.

            TreeMap internally uses a Red-Black Tree for efficient sorting.
            Provides O(log n) time for insertion, deletion and lookup.
            TreeMap does not allow null keys, but allows null values.




        */

    }
}
