package com.ds.practice_project.linkList.doublyLinklist;

public class SwapElements {

    Node head;
    Node nodeTop;

    public Node add(int[] id){
        Node node = null;
        for (int i=0; i< id.length; i++) {
            Node newNode = new Node(id[i]);
            if (node == null) {
                node = newNode;
                continue;
            }

            Node node1 = node;

            while (node1.next != null) {
                node1 = node1.next;
            }

            node1.next = newNode;
        }
        return node;
    }

    static Node newNode(int data)
    {
        Node new_node = new Node(data);
        return new_node;
    }

    public static void print(Node node){

            if (node == null)
                return;
            System.out.print(node.data+" ");
            print(node.next);
    }

    private static void swipeNode(Node nodeList,Node node1,Node node2){

        Node nodeList1 = nodeList;
        Node firstNode = node1;

        while (nodeList1.next != null){
            if (nodeList1.data == node1.data)
                break;

            nodeList1 = nodeList1.next;
        }

        while (nodeList.next != null){
            if (nodeList.data == node2.data)
                break;

            nodeList = nodeList.next;
        }

        Node secNode = nodeList;

        nodeList.next = nodeList1.next;
        nodeList.pre = nodeList1.pre;

        nodeList1.next = secNode.next;
        nodeList1.pre = secNode.pre;

        print(nodeList1);
    }

    public static void main(String ag[]){
        SwapElements list = new SwapElements();
        int[] ar = {1,2,3,4,5,6};

        Node node = list.add(ar);
        Node fNode = new Node(2);
        Node sNode = new Node(5);
        swipeNode(node,fNode,sNode);

        //Node head = null;
      //  print(node);
    }
}
