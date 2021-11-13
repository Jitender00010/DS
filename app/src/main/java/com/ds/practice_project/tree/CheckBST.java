package com.ds.practice_project.tree;

public class CheckBST {

    public static void main(String[] arg){
        DoubleLinkList root = new DoubleLinkList(15);
        root.left = new DoubleLinkList(10);
        root.right = new DoubleLinkList(20);
        root.right.right = new DoubleLinkList(22);
        root.right.right = new DoubleLinkList(22);
        root.left.left = new DoubleLinkList(5);

        System.out.println(isBST(root));
    }

    public static boolean isBST(DoubleLinkList node){
        if (node == null)
            return true;

        if (checkLeftNode(node,node.left)
                && checkRightNode(node,node.right)
                && isBST(node.left)
                && isBST(node.right))
            return true;
        else
            return false;
    }

    public static boolean checkLeftNode(DoubleLinkList node,DoubleLinkList leftNode){
        if (leftNode == null)
            return true;

        if (leftNode.data < node.data)
            return true;
        else return false;
    }

    public static boolean checkRightNode(DoubleLinkList node,DoubleLinkList rightNode){
        if (rightNode == null)
            return true;

        if (rightNode.data > node.data)
            return true;
        else return false;
    }

    public static DoubleLinkList insertNode(DoubleLinkList node,int data){
        if (node == null){
            node = new DoubleLinkList(data);
            return node;
        }
        else if (data < node.data){
            node.left = insertNode(node.left,data);
        }else {
            node.right = insertNode(node.right,data);
        }

        return node;
    }
}
