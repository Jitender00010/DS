package com.ds.practice_project.linkList.doublyLinklist;

public class InsertionOperation {
    Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.pre = newNode;

        head = newNode;
    }

    public void addMid(int data,int pos){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node node = head;
        Node curr = null;
        Node pre = null;
        int i = 1;
        while (node != null){
            if (i == pos){
                curr = node;
                break;
            }
            pre = node;
            node = node.next;
            i++;
        }

        pre.next = newNode;
        newNode.pre = pre;
        newNode.next = curr;
        curr.pre = newNode;
    }

    public void add1(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node node = head;

        while (node.next != null)
            node = node.next;

        node.next = newNode;
        newNode.pre = node;
    }

    public void printList(Node node){
     //  Node node = head;
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public Node add(int[] ar,Node nNode) {
        Node node = null;
        for (int i = 0; i < ar.length; i++) {
            Node newNode = new Node(ar[i]);

            if (nNode == null) {
                nNode = newNode;
                continue;
            }

            node = nNode;
            Node pre  = null;

            while (node.next != null){
                pre = node;
                node = node.next;
            }

            node.next = newNode;
            newNode.pre= node;
        }

        return nNode;
    }

    public static void main(String[] ag){
        InsertionOperation list = new InsertionOperation();
        /*list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(6);
        list.addMid(5,5);*/

        int[] ar = {1,2,3,4,5};
        Node nod = null;
        Node node = list.add(ar,nod);
        list.printList(node);

        System.out.println();

        int[] ar1 = {6,7,8,9,10};
        Node nod1 = null;
        Node node1 = list.add(ar1,nod1);
        list.printList(node1);

    }
}
