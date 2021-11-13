package com.ds.practice_project.tree;

public class InOrderPreOrderPostOrder {

    public static void main(String[] arg){
        DoubleLinkList root = null;
        root = insertNode(root,15);
        root = insertNode(root,10);
        root = insertNode(root,8);
        root = insertNode(root,9);
        root = insertNode(root,7);
        root = insertNode(root,20);
        root = insertNode(root,22);
        root = insertNode(root,24);
        root = insertNode(root,26);
        root = insertNode(root,19);

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
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

    public static void preOrder(DoubleLinkList node){
        if (node == null)
            return;

        System.out.print(" "+node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void inOrder(DoubleLinkList node){
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(" "+node.data);
        inOrder(node.right);
    }

    public static void postOrder(DoubleLinkList node){
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" "+node.data);
    }
}
