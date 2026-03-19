package com.collection.javaCollection;

import java.util.*;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        li.add(24);
        li.add(4);
        li.add(245);
        li.add(245);
        li.add(241);
        li.add(204);
        li.add(2894);

        System.out.println("min element: "+ Collections.min(li));
        System.out.println("max element: "+ Collections.max(li));
        System.out.println("frequency of element: "+ Collections.frequency(li,245));

//        Collections.sort(li);
        Collections.sort(li, Comparator.reverseOrder());

        System.out.println("sort: "+li);


        //how can we sort custom classes like student

        List<Student> ss = new ArrayList<>();

        ss.add(new Student("parth",22));
        ss.add(new Student("patel",24));
        ss.add(new Student("aman",21));

        ss.add(new Student("abhi",22));

        System.out.println("set: "+ss);

        Student s1 = new Student("kalyan",2);
        Student s2 = new Student("omji",45);

        System.out.println(s1.compareTo(s2));

        Collections.sort(ss);
        // inorder to solve that you have to implement one interface called comparable    on student class.

        System.out.println("set: "+ss);


//        Collections.sort(ss, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });

        //also we can writelike
        Collections.sort(ss, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println("set: "+ss);


        /* Comparable and Comparator
        Comparable
        The Comparable interface in Java is used to define the natural ordering of objects of a class.
        It enables objects to be compared and sorted automatically without using an external Comparator.

            It contains the compareTo() method, which compares the current object with another object.
            It is commonly used with Collections.sort() and Arrays.sort() for sorting custom objects.

        Syntax
            class MyClass implements Comparable<MyClass> {
                @Override
                 public int compareTo(MyClass obj) {
                 // comparison logic
                }
            }

            Returns negative if this < obj.
            Returns 0 if this == obj.
            Returns positive if this > obj.
            Key Method: int compareTo(T obj) - Compares the current object with the specified object.




        Comparator

        The Comparator interface in Java is used to define custom sorting logic for objects.
        It belongs to java.util package allows sorting of objects of user-defined classes without modifying their source code. It is especially useful when:

            We need multiple sorting strategies for a class.
            We want to keep sorting logic separate from the class definition.


        Syntax
            class MyComparator implements Comparator<Type> {
                       public int compare(Type obj1, Type obj2) {
                           // comparison logic
                  }
            }

            Returns negative integer if obj1 < obj2.
            Returns 0 if obj1 == obj2.
            Returns positive integer if obj1 > obj2.

        Methods in Comparator Interface:
            compare(T o1, T o2): Compares two objects for order.
            equals(Object obj): Indicates whether another object is equal to this comparator.

        How Collections.sort() Works with Comparator
        The Collections.sort() method arranges the elements of a List based on the rules defined by a Comparator.

        Syntax
        public static <T> void sort(List<T> list, Comparator<? super T> c)

        The method uses the compare() function of the given Comparator to decide the order of elements. The compare() method compares two elements and returns:

        -1 -> if the first element should come before the second
        0 -> if both elements are equal
        1 -> if the first element should come after the second
        */


    }
}
