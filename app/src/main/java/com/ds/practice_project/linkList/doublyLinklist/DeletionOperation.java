package com.ds.practice_project.linkList.doublyLinklist;

public class DeletionOperation {
   Node head;

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

    public void printList(Node node){
        //  Node node = head;
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }

        System.out.println();
    }

    public Node deleteNode(int pos,Node node1){
        Node node = node1;

        if (node == null)
            return null;

        Node curr = node;
        Node pre  = null;
        int  i    = 1;

        while (node != null){
            if (node.data == pos){
                curr = node;
                break;
            }
            i++;
            pre = node;
            node = node.next;
        }

        if (pre == null) {
            node1 = curr.next;
            node1.pre = null;
        }
        else if (curr.next == null){
            pre.next = null;
            curr.pre = null;
        }else {
            pre.next = curr.next;
            curr.next.pre = pre;
        }
        return node1;
    }

    public static void main(String[] ag){
        DeletionOperation list = new DeletionOperation();
        int[] ar = {1,2,3,4,5};

        Node node = null;
        Node n = list.add(ar,node);
        list.printList(n);

        Node dNode =  list.deleteNode(1,n);
        list.printList(dNode);

    }
}
