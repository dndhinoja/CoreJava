package com.dn.corejava;

public class QuickSortWithSinglyLinkedList {

    public static void main(String[] args){
        QuickSortWithSinglyLinkedList list = new QuickSortWithSinglyLinkedList();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(80);

        Node lastNode = list.head;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
        }

        list.quickSort(list.head,lastNode);

        while (list.head!=null){
            System.out.println(list.head.data);
            list.head = list.head.next;
        }

    }

    private void quickSort(Node start, Node end) {
        if(start==end){
            return;
        }
        Node partition = partitionNode(start,end);
        quickSort(start,partition);

        if(partition==start && partition!=null){
            quickSort(partition.next,end);
        }
        else if(partition!=null && partition.next!=null){
            quickSort(partition.next.next,end);
        }
    }

    private Node partitionNode(Node start, Node end) {

        Node current = start;
        Node pivotPrevious = start;
        int pivot = end.data;

        while(start!=end){
            if(start.data<pivot){
                pivotPrevious = current;
                //pivotPrevious = pivotPrevious.next;
                int temp = start.data;
                start.data = current.data;
                current.data = temp;

                current = current.next;
            }
            start = start.next;
        }
        int temp1 = end.data;
        end.data = current.data;
        current.data = temp1;

        return pivotPrevious;
    }

    public class Node{
        int data;
        //int next;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void add(int data){

        if(head==null){
            head = new Node(data);
           return;
        }
        Node current  = head;

        while (current.next!=null){
            current = current.next;
        }
        Node newNode = new Node(data);
        current.next = newNode;

       // return newNode;
    }
}
