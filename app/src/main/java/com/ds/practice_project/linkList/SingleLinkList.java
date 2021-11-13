package com.ds.practice_project.linkList;

public class SingleLinkList {

    private Node head;

    public static void main(String[] ag){
        SingleLinkList list = new SingleLinkList();
        int[] ar = {1,2,3,4,5};
        list.print(list.addBegining1(ar,0));
        System.out.println();
        list.print(list.addLast(ar));
    }

    public void print(Node node){
        if (node == null)
            return;
        System.out.print(node.data+" ");
        print(node.next);
    }

    public Node addBegining(int[] ar){
        Node firstNode = null;

        for (int i=0; i< ar.length; i++){
            Node newNode = new Node(ar[i]);
            newNode.next = firstNode;
            firstNode = newNode;
        }
        return firstNode;
    }

    public Node addLast(int[] ar){
        Node firstNode = null;
        Node lastNode = null;

        for (int i=0; i< ar.length; i++){
            Node newNode = new Node(ar[i]);
            if (firstNode == null) {
                firstNode = newNode;
                lastNode = firstNode;
            }else{
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }
        return firstNode;
    }

    public Node addBegining1(int[] ar,int x){
        Node node = new Node(ar[x]);
        if (ar.length-1 == x) {
            node.next = head;
            head = node;
            return head;
        }
        node.next = head;
        head = node;
        x++;
       return addBegining1(ar,x);
    }

}
