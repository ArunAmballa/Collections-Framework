package com.arun.Collections.Framework.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListBasics {

    public static void main(String []args){

        LinkedList<Integer> list=new LinkedList<>();
        list.offer(10);
        list.offerFirst(20);
        list.offerLast(30);

        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        list.add(100);
        list.add(200);

        System.out.println(list.get(0));
        System.out.println(list.indexOf(100));
        list.remove(0);
        list.remove(Integer.valueOf(200));

        System.out.println(list);

    }
}
