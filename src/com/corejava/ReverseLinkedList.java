package com.corejava;

public class ReverseLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public static void main(String[] args){
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        Node root = reverseLinkedList.insert(1);
        reverseLinkedList.insert(2);
        reverseLinkedList.insert(3);
        reverseLinkedList.insert(4);
        reverseLinkedList.insert(5);
        reverseLinkedList.insert(6);


       // reverseLinkedList.reverseList(root);
       reverseLinkedList.head =  reverseLinkedList.reverseListWithSize(root,3);
    }
    private Node reverseList(Node head) {

        Node pointer1 = null;
        Node pointer2 = head.next;
        while(true) {
            head.next = pointer1;
            pointer1 = head;
            if(pointer2==null)
                break;
            head = pointer2;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }

    private Node reverseListWithSize(Node head,int k){
        Node root = head;
        Node pointer1 = null;
        Node pointer2 = head;

        int count = 0;
        while(count<k && head!=null){

            head = pointer2;
            pointer2 = pointer2.next;
            head.next = pointer1;
            pointer1 = head;
            count++;

        }
        if(pointer2!=null) {
            root.next = reverseListWithSize(pointer2, k);
        }
        return pointer1;
    }

    private Node insert(int data) {
        if(head==null){
            head = new Node(data);
            return head;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        Node newNode = new Node(data);
        current.next = newNode;
        return newNode;
    }
}
