package com.dn.corejava;
    class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
public class BST {
    static Node head = null;
    Node current;


    public static void main(String[] args) {
        int[] arr = {50,40,70,60,80,55,65,30,35};
        BST bst = new BST();
        for (int i = 0; i < arr.length; i++) {
            if (head == null) {
                head = bst.bst(head, arr[i]);
                continue;
            }
            bst.bst(head, arr[i]);
        }

        //left view of BST
        bst.leftView(head);


        //searching key
        System.out.println(bst.search(head, 8));
        //minimum key
        Node min = bst.minimumElement(head);
        System.out.println(min.key);

       // Node node = bst.LCA(head, 10, 3);
        //System.out.println(node.key);

        //fix BST
        Node root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(12);
        root.right.left = new Node(7);
        System.out.println("Before Fixing");
        bst.inOrder(root);
        bst.correctBST(root);
        System.out.println("Fixing BST");
        bst.inOrder(root);

        //Deleting Node
        System.out.println("Before Deleting..Delete Node");
        bst.inOrder(head);
        int x = 50;
        bst.deleteNode(head, x);
        System.out.println("After Deleting");
        bst.inOrder(head);
    }

    private void leftView(Node node) {

        if(node!=null){
            Node leftNode = node.left;
            System.out.println(node.key);
            leftView(leftNode);
            if(leftNode==null){
                leftView(node.right);
            }
        }
    }


    Node successor = null;
    Node nullToBe = null;
    public void deleteNode(Node node, int x) {
        boolean result = search(node, x);
        if(result==false)
        return;
        if (x < node.key) {
            deleteNode(node.left, x);
        } else if (x > node.key) {
            deleteNode(node.right, x);
        } else if (node.key == x) {
            //exchange value

            inOrderSuccessor(node.right);
            if(successor!=null) {
                node.key = successor.key;
                if(node.key == node.right.key){
                    node.right =null;
                }
            }
        }
    }
    Node pre = null;
    public void inOrderSuccessor(Node node) {

        while (node!=null){
            if(node.left==null){
                successor = node;
                if(pre!=null)
                pre.left = null;
                return;
            }
            pre = node;
            node = node.left;
        }
    }



    private Node bst(Node node, int key) {

        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = bst(node.left, key);
        } else if (key > node.key) {
            node.right = bst(node.right, key);
        }
        return node;
    }

    boolean search(Node node, int searchKey) {
        boolean flag = false;

        if (node.key == searchKey && node != null) {
            flag = true;
        } else if (searchKey < node.key) {
            if (node.left != null)
                flag = search(node.left, searchKey);
        } else if (searchKey > node.key) {
            if (node.right != null)
                flag = search(node.right, searchKey);
        }
        return flag;
    }

    Node minimumElement(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

   /* Node LCA(Node node,int n1,int n2){
        Node nodeResult;
        if(node.key>n1 && node.key>n2){
            Node node1 = LCA(node.left,n1,n2);
            nodeResult = node1;
        }
        else if(node.key<n1 && node.key<n2){
            Node node2 = LCA(node.right,n1,n2);
            nodeResult = node2;
        }
        else{
            return node;
        }
        return nodeResult;
    }*/
    Node first = null,middle = null,last = null;
    public void correctBST(Node root){
        nodesSearching(root);

        if(last!=null){
            int temp= first.key;
            first.key = last.key;
            last.key = temp;
            //swap first & last

        }
        else {
            //swap first & middle
            Node temp = middle;
            middle = first;
            first = temp;
        }
    }
    //BST Traversal
Node previous = null;
    public void nodesSearching(Node root){
        if(root!=null) {
            //root = root.left;
            nodesSearching(root.left);


            //root = root.right;
            if (previous!=null && previous.key > root.key) {
                if (first == null) {
                    first = previous;
                    middle = root;
                } else {
                    last = root;
                }
            }
            previous = root;
            nodesSearching(root.right);
        }
    }

    private void inOrder(Node node) {
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.key);
        inOrder(node.right);
    }

}

