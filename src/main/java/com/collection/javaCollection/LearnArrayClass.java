package com.collection.javaCollection;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        //Traditional Method's of array.  means it is not part of java collection

        int[] number = { 1,2,3,4,5,6,7,8,9,10,1,11,24};
        System.out.println("number: "+ Arrays.binarySearch(number,4));

        int[] num = {45,78,56,8,5,2,4,7,45,12,7487,96,3,4};
        Arrays.sort(num);
        System.out.println("sort: "+Arrays.toString(num));
    }
}
