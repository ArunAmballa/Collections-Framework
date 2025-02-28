package com.arun.Collections.Framework.Collections.CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassBasics {

    public static void main(String []args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);

        System.out.println("Original Array"+numbers);

        Collections.sort(numbers);
        System.out.println("Sorted Array"+numbers);

        System.out.println("Min Value"+Collections.min(numbers));
        System.out.println("Max Value"+Collections.max(numbers));
        Collections.reverse(numbers);
        System.out.println("Reversed Array"+numbers);

        Collections.sort(numbers);
        System.out.println("Binary Search an Element"+Collections.binarySearch(numbers,20));



    }
}
