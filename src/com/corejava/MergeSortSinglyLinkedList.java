package com.corejava;

public class MergeSortSinglyLinkedList {
    public static void main(String [] args){
        MergeSortSinglyLinkedList list = new MergeSortSinglyLinkedList();
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(20);

        Node begin = list.mergeSort(list.head);

        Node print = begin;
        while (print!=null){
            System.out.println(print.data);
            print = print.next;
        }
    }

    private Node mergeSort(Node start) {

        if(start==null || start.next==null){
            return start;
        }

        Node middleNode = middleNode(start);
        Node nextMiddle = middleNode.next;

        middleNode.next = null;

        Node left = mergeSort(start);
        Node right = mergeSort(nextMiddle);

        Node sortedList = merge(left,right);
        return sortedList;
    }

    public Node middleNode(Node start){
        if(start==null){
            return start;
        }

        Node pointer = start;
        Node pointer1 = start;
        while(pointer1.next!=null && pointer1.next.next!=null){
            pointer = pointer.next;
            pointer1 = pointer1.next.next;
        }
        Node middle = pointer;
        return middle;
    }
    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    private void add(int data) {
        if(head==null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        Node newNode = new Node(data);
        current.next = newNode;
    }
    private Node merge(Node leftList, Node rightList) {
        Node sortedList = null;

        if(leftList==null){
            return rightList;
        }
        if(rightList==null){
            return leftList;
        }
        //while (leftList!= null || rightList!= null) {
            if (leftList.data < rightList.data) {
                sortedList = leftList;
                //leftList = leftList.next;
                sortedList.next = merge(leftList.next,rightList);
            } else {
                sortedList = rightList;
                //rightList = rightList.next;
                sortedList.next = merge(leftList,rightList.next);
            }
        return sortedList;
    }
}

