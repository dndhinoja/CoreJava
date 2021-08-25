package com.corejava;

public class QueueUsingArray {

    int front,rear = 0;
    int[] arr = new int[5];

    public static void main(String[] args){


        QueueUsingArray aq = new QueueUsingArray();
        aq.push(6);
       // aq.printQueue();
        aq.pop();
        aq.pop();
        aq.pop();
        aq.push(22);
        aq.push(12);
        aq.push(33);
        aq.push(99);
        aq.pop();

    }

    private float pop() {
        if(front==rear){
            return -1;
        }
        else{
            int popElement = arr[front];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            arr[rear] = 0;
            rear--;
            return popElement;
        }
    }

    private void push(int element) {
        if(rear<arr.length){
            arr[rear] = element;
            rear++;
        }
    }


    private void printQueue() {
    }
}
