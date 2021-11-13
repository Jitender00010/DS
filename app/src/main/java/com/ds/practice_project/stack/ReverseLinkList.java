package com.ds.practice_project.stack;

import com.example.practice.linkList.Node;

public class ReverseLinkList {

    private Node GenrateNode(int x){
        return new Node(x);
    }

    public static void main(String[] arg){
        StackLinkList firstNode = new StackLinkList();
        StackLinkList firstNode2 = new StackLinkList();
        firstNode.Push(new Node(1));
        firstNode.Push(new Node(2));
        firstNode.Push(new Node(3));
        firstNode.Push(new Node(4));
        firstNode.Push(new Node(5));

        firstNode.print(firstNode.getTop());
        System.out.println();
        //System.out.print( firstNode.head().data+"  ");
        Node node1 = firstNode.getTop();
        Node head = node1;
        firstNode.Pop();
        while (head != null){

            node1.next = firstNode.getTop();
            System.out.print( head.data+"  ");
            firstNode.Pop();
            head =head.next;
        }

        //firstNode.print(firstNode2.getTop());
    }
}
