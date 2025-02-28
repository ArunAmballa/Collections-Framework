package com.arun.Collections.Framework.Collections.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeBasics {

    public static void main(String []args){

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offerFirst(20);
        deque.offerLast(30);

        System.out.println("Array Deque"+deque);

        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());

        deque.offer(10);
        deque.offerFirst(20);
        deque.offerLast(30);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        while(!deque.isEmpty()){
            Integer value=deque.pollLast();
            System.out.println(value);
        }

    }
}
