package com.dn.corejava;

import java.util.ArrayList;

class NodeBST{
    int key;
    NodeBST left;
    NodeBST right;
   // boolean flag;

    public NodeBST(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
     //   this.flag = false;
    }
}
public class IsBST {
    NodeBST previous = null;
    ArrayList<Integer> list = new ArrayList<Integer>();
    boolean flag = true;
    private boolean isBst(NodeBST node) {

            if(node!=null) {

                if(list.contains(node.key)){
                    NodeBST duplicateNode = node;
                    System.out.println(duplicateNode.key);
                }
                list.add(node.key);

               // node.flag = true;
                isBst(node.left);

                if(previous!=null && previous.key>node.key) {
                    flag = false;
                    return flag;
                }
                previous = node;

                isBst(node.right);
            }
        return flag;
    }

    public static void main(String[] args){
        NodeBST head = new NodeBST(2);
        head.left = new NodeBST(1);
        head.right = new NodeBST(3);

        head.right.left = new NodeBST(1);
       // head.left.left = new Node(5);

        IsBST isBST = new IsBST();
        System.out.println(isBST.isBst(head));

    }
}

