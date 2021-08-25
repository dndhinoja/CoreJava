package com.corejava;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    int topStack1 =0;
    int topStack2 = 0;

    public static void main(String[] args){
        QueueUsingStack qs = new QueueUsingStack();

        qs.enQueue(22);
        qs.enQueue(11);
        qs.enQueue(10);
        qs.enQueue(90);

        qs.deQueue();
        qs.deQueue();
    }

    private void enQueue(int element) {
        stack1.push(element);
        topStack1++;
    }

    private int deQueue() {
        if(stack2.empty()){
            while(topStack1!=0){
                stack2.push(stack1.pop());
                topStack1--;
            }
        }
        int popedElement = stack2.pop();
        return popedElement;
    }
}
