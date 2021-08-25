package com.corejava;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

class NodeLinkedList{
    NodeLinkedList next;
    int data;

    public NodeLinkedList(int data) {
        this.next = null;
        this.data = data;
    }
}

public class MiddleElementLinkedList {

    public static void main(String[] args){
        MiddleElementLinkedList middleElementLinkedList = new MiddleElementLinkedList();

        NodeLinkedList root = middleElementLinkedList.add(1);
        middleElementLinkedList.add(2);
        middleElementLinkedList.add(3);
        middleElementLinkedList.add(4);
        middleElementLinkedList.add(5);
        middleElementLinkedList.add(6);

        int middle = middleElementLinkedList.getMiddle(root);

        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        //list.push(6);
        int ll = list.pop();

        System.out.println(list.get(middle));

    }
NodeLinkedList head = null;
    private NodeLinkedList add(int data) {
        if(head==null){
            head = new NodeLinkedList(data);
            return head;
        }
        NodeLinkedList current = head;
        while(current.next!=null){
            current = current.next;
        }
        NodeLinkedList newNode = new NodeLinkedList(data);
        current.next = newNode;
        return newNode;
    }

    private int getMiddle(NodeLinkedList node) {
        float lastIndex =-1;
        int firstIndex = 0;
        while(node!=null){
            lastIndex++;
            node = node.next;
        }

        int middle = (int) (firstIndex + (lastIndex-firstIndex)/2);
       // if(lastIndex%2!=0){
         //   middle++;
        //}
        //for getting middle node

        /*while (node!=null){
            node = node.next;
            count++;
        }*/
        return middle;
    }
}
