package com.ds.practice_project.tree;

public class BoundryNodePrint {

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

        boundryNode(root);
    }

    private static DoubleLinkList boundryNode(DoubleLinkList root) {

        if (root != null && root.left == null || root.right == null ) {
            System.out.print("  "+root.data);
            return null;
        }

        /*if (root.left == null && root.right != null){
            System.out.print("  "+root.right.data);
        }

        if (root.right == null && root.left != null){
            System.out.print("  "+root.left.data);
        }*/

        boundryNode(root.left);
        boundryNode(root.right);

        return null;
    }

    public static DoubleLinkList BSTreeInsertion(DoubleLinkList node, int data){
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
}
