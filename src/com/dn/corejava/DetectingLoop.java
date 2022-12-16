package com.dn.corejava;

public class DetectingLoop {
    Node head = null;
    class Node{
        int data;
        Node next;
        boolean flag;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.flag = false;
        }
    }

    private Node add(int data) {
        if(head==null) {
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
    private void circular(Node node,int x) {
        float count=0;
        Node loopNode = null;
        while (node.next!=null){
            node = node.next;
            count++;
            if(count==x){
                loopNode = node;
            }
        }
        node.next = loopNode;

    }

    private boolean loopDetecting(Node node){
        Node previous = null;
        while(node.next!=null){

            previous = node;
            node.flag = true;
            if(node.next.flag==true) {
                // previous.next = null;
                break;
            }
            node = node.next;

        }
        Node lastNode = node;
        if(lastNode.next==null)
            return false;
        return true;
    }
    public static void main(String[] args) {
        DetectingLoop list = new DetectingLoop();
        Node head = list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

       list.circular(head,3);
        System.out.println(list.loopDetecting(head));

    }




}

