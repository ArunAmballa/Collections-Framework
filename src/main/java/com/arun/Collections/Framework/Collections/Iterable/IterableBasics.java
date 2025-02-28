package com.arun.Collections.Framework.Collections.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableBasics{

    public static void main(String []args){

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()){
            Integer value= iterator.next();
            System.out.println(value);
            if(value==30){
                iterator.remove();
            }
        }

        numbers.forEach((Integer value)->System.out.println(value));
    }
}
