package com.arun.Collections.Framework.Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {

    public static void main(String []args) {

        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);

        System.out.println(values.get(0));
        System.out.println(values.indexOf(20));
        System.out.println(values.size());


        ArrayList<Integer> valuesSecond=new ArrayList<>();
        valuesSecond.add(100);
        valuesSecond.add(200);

        values.addAll(valuesSecond);
        System.out.println(values);
        System.out.println(valuesSecond);

        values.set(0,1000);

        values.sort((Integer val1,Integer val2)->val1-val2);
        System.out.println(values);

        values.remove(1);
        values.remove(Integer.valueOf(1000));

        System.out.println(values);
        values.removeAll(valuesSecond);

        values.clear();
        System.out.println(values);
        System.out.println(valuesSecond);

        List<Integer> subList=valuesSecond.subList(0,1);
        System.out.println(subList);

    }
}
