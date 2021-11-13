package com.ds.practice_project.tree;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverser {

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

        orderTraverser(root);
    }

    public static void orderTraverser(DoubleLinkList node ){
        if (node == null)
            return;

         Queue<DoubleLinkList> q = new LinkedList<>();
        ((LinkedList<DoubleLinkList>) q).add(node);

         while (!q.isEmpty()){
             DoubleLinkList doubleLinkList = ((LinkedList<DoubleLinkList>) q).getFirst();

             System.out.print(" "+doubleLinkList.data);

             if (doubleLinkList.left != null)
                ((LinkedList<DoubleLinkList>) q).add(doubleLinkList.left);

             if (doubleLinkList.right != null)
                 ((LinkedList<DoubleLinkList>) q).add(doubleLinkList.right);

             ((LinkedList<DoubleLinkList>) q).removeFirst();
         }
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
