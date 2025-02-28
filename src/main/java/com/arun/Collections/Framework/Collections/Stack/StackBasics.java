package com.arun.Collections.Framework.Collections.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackBasics {

    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        for (int value : stack) {
            System.out.println(value);
        }

        stack.pop();

        System.out.println(stack);
        System.out.println(stack.peek());


    }

}
