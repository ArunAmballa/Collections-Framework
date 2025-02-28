package com.arun.Collections.Framework.Collections.Vector;

import java.util.Vector;

public class VectorBasics {

    public static void main(String[] args) {

        Vector<Integer> list=new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.indexOf(30));

        list.set(0,1000);

        System.out.println(list);
    }
}
