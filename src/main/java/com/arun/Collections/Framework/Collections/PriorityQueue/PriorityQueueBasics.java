package com.arun.Collections.Framework.Collections.PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueBasics {

    public static void main(String []args){

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        minHeap.offer(10);
        minHeap.offer(20);
        minHeap.offer(2);

        Iterator<Integer> iterator = minHeap.iterator();
        while(iterator.hasNext()){
            int minValue= iterator.next();
            System.out.println(minValue);
        }


        System.out.println("Min Value"+minHeap.peek());

        while(!minHeap.isEmpty()){
            int mini=minHeap.poll();
            System.out.println(mini);
        }


        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((Integer val1,Integer val2)->val2-val1);
        maxHeap.add(10);
        maxHeap.add(2);
        maxHeap.add(30);

        System.out.println("Max Value"+maxHeap.peek());
        while(!maxHeap.isEmpty()){
            int maxvalue= maxHeap.poll();
            System.out.println(maxvalue);
        }

    }
}
