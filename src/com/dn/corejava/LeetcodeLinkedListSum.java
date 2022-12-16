package com.dn.corejava;

public class LeetcodeLinkedListSum {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node head = null;
    //Node head2 = null;

    public Node push(int data) {
        Node newNode = null;

            if (head == null) {
                head = new Node(data);
                return head;
            }
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            newNode = new Node(data);
            current.next = newNode;
            return newNode;
        }

            /*if (head2 == null) {
                head2 = new Node(data);
                return head2;
            }
            Node current = head2;
            while (current.next!=null){
                current = current.next;
            }
            newNode = new Node(data);
            current.next = newNode;
            return newNode;*/

    private Node sumOfLinkedList(Node head1, Node head2) {
        Node current1 = head1;
        Node current2 = head2;
        Node head3 = null;
        int vadi = 0;
        int sumOfNode = 0;
        while (current1!=null && current2!=null){

            if(vadi!=0) {
                sumOfNode = current1.data + current2.data + vadi;
            }
            else {
                sumOfNode = current1.data + current2.data;
            }
            if(sumOfNode>9){
                int extra = sumOfNode%10;
                vadi = sumOfNode/10;
                sumOfNode = extra;
            }
            else {
                vadi = 0;
            }

            if(head==null) {
                head3 = push(sumOfNode);
                current1 = current1.next;
                current2 = current2.next;
                continue;
            }
            push(sumOfNode);
            current1 = current1.next;
            current2 = current2.next;
        }
        if(vadi!=0){
            push(vadi);
        }
        return head3;
    }
    public static void main(String[] args){
        LeetcodeLinkedListSum leetcodeLinkedListSum = new LeetcodeLinkedListSum();
        Node head1 = leetcodeLinkedListSum.push(1);
        leetcodeLinkedListSum.push(4);
        leetcodeLinkedListSum.push(3);

        head = null;
        Node head2 = leetcodeLinkedListSum.push(1);
        leetcodeLinkedListSum.push(7);
        leetcodeLinkedListSum.push(6);

        head = null;
        leetcodeLinkedListSum.sumOfLinkedList(head1,head2);
    }


}
