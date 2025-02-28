package com.arun.Collections.Framework.Collections.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionBasics {

    public static void main(String []args){

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Size of Array"+numbers.size());
        System.out.println("Check if Array is Empty"+numbers.isEmpty());
        System.out.println("Check if array contains an element"+numbers.contains(20));

        numbers.remove(3);
        numbers.remove(Integer.valueOf(10));

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            Integer value=iterator.next();
            System.out.println(value);
        }

        ArrayList<Integer> numbersSecond=new ArrayList<>();
        numbersSecond.add(10);
        numbersSecond.add(100);

        numbers.addAll(numbersSecond);
        System.out.println("All Numbers"+numbers);


        System.out.println(numbers.equals(numbersSecond));

        numbers.clear();
        System.out.println(numbers);
    }


}
