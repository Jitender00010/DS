package com.ds.practice_project.tree;

public class DeleteBST {

    public static void main(String[] arg){
        DoubleLinkList root = null;
        root = insertNode(root,15);
        root = insertNode(root,10);
        root = insertNode(root,20);
        root = insertNode(root,26);
        root = insertNode(root,17);
        root = insertNode(root,16);
        root = insertNode(root,28);
        root = insertNode(root,8);
        root = insertNode(root,9);
        root = insertNode(root,7);
        root = insertNode(root,6);

        preOrder(root);
        System.out.println();
       DoubleLinkList deletNodeval =  deleteNode(root,17);
       preOrder(deletNodeval);
    }

    public static DoubleLinkList deleteNode(DoubleLinkList node,int x){
        if (node == null){
            return node;
        }else if (x < node.data){
            node = deleteNode(node.left,x);
        }else if (x > node.data){
            node = deleteNode(node.right,x);
        }else {
            if (node.left == null && node.right==null){
                node = null;
            }else if (node.left == null){
                node = node.right;
            }else if (node.right == null){
                node = node.left;
            }else {
                DoubleLinkList root = isRightNodeSmall(node.right);
                node.data = root.data;

                node.right  = deleteNode(node.right,node.data);
            }
        }

        return node;
    }

    public static DoubleLinkList isRightNodeSmall(DoubleLinkList node){
        if (node.left == null)
            return node;
        else {
            node = isRightNodeSmall(node.left);
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

    public static DoubleLinkList insertNode(DoubleLinkList node,int x){
        if (node == null){
            node = new DoubleLinkList(x);
            return node;
        }else if (x < node.data){
            node.left = insertNode(node.left,x);
        }else {
            node.right =  insertNode(node.right,x);
        }

        return node;
    }
}
