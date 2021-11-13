package com.ds.practice_project.linkList.doublyLinklist;

public class ReverseDoublyLinkList {

    public static Node reverseList(Node node){

        if (node == null)
            return null;

        Node preNode = null,currentNode = node,nextNode = null; // 1 2 3 4
        while (currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }

        node = preNode;
        return node;
    }

    public static void main(String[] arg){
        InsertionOperation list = new InsertionOperation();

        int[] ar = {1,2,3,4,5};
        Node firstLiST = null;
        Node node = list.add(ar,firstLiST);
        list.printList(node);
        System.out.println();

        list.printList(reverseList(node));


    }
}
