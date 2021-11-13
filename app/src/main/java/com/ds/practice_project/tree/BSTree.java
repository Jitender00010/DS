package com.ds.practice_project.tree;

public class BSTree {

    public static void main(String[] arg){
        DoubleLinkList root = null;
        root = BSTreeInsertion(root,15);
        root = BSTreeInsertion(root,10);
        root = BSTreeInsertion(root,8);
        root = BSTreeInsertion(root,7);
        root = BSTreeInsertion(root,20);
        root = BSTreeInsertion(root,22);
        root = BSTreeInsertion(root,24);
        root = BSTreeInsertion(root,26);
        root = BSTreeInsertion(root,19);


      //  System.out.print("res "+searchBST(root,8));
        System.out.print("res "+bstLength(root));
        minNo(root);
        maxNo(root);
    }

    public static int bstLength(DoubleLinkList node){
        int left = 0;
        int right = 0;
        if (node == null)
            return -1;

       left = bstLength(node.left)+1;

       right = bstLength(node.right)+1;


       if (left > right)
           return left;
       else if (left == right)
           return right;
       else
           return right;


    }

    public static DoubleLinkList BSTreeInsertion(DoubleLinkList node,int data){
        if (node == null){
             node = new DoubleLinkList(data);
            return node;
        }
        else if (data < node.data){
            node.left = BSTreeInsertion(node.left,data);
        }else {
            node.right = BSTreeInsertion(node.right,data);
        }

        return node;
    }

    public static boolean searchBST(DoubleLinkList node,int data){
        if (node == null){
            return false;
        }else if (data == node.data){
            return true;
        }
        else if (data < node.data){
          return  searchBST(node.left,data);
        }else {
          return searchBST(node.right,data);
        }
    }

    public static String decimalTobinary(int no) {
        if (no == 1)
            return "" + no;
        return decimalTobinary(no / 2) + " " + no % 2;
    }

    public static void minNo(DoubleLinkList node){
        if (node.left == null) {
            System.out.println("  min "+node.data);
            return;
        }
        minNo(node.left);
    }
 public static void maxNo(DoubleLinkList node){
        if (node.right == null) {
            System.out.println("  max "+node.data);
            return;
        }
        maxNo(node.right);
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
