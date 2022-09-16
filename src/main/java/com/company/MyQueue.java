package com.company;

import java.util.Stack;


public class MyQueue {
    // use only stack
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public MyQueue() {

    }

    public void push(int x) {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.empty();
    }
}
