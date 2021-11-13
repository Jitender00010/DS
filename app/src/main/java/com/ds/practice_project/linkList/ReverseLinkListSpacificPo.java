package com.ds.practice_project.linkList;

public class ReverseLinkListSpacificPo {

    static Node dividNext = null;

    public static void main(String[] arg) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        //          3  2  1  4 5 6
        Node node = add(ar);
        print(node);

        System.out.println();
        Node re = reverseList(node, 2);
        print(re);
    }

    private static Node reverseList(Node node, int i) {

        Node current = node;
        Node next = null;
        Node pre = null;
        Node newNode = node;

        Node divideNode = divideNode(node, i);

        int k = 1;

        while (divideNode != null) {

            if (k == 1) {
                next = divideNode.next;
                divideNode.next = dividNext;
                pre = divideNode;
                divideNode = next;
            } else {

                next = divideNode.next;
                divideNode.next = pre;
                pre = divideNode;
                divideNode = next;

            }
            k++;

        }

        //pre.next = dividNext;
        return pre;
    }

    private static Node divideNode(Node node, int i) {

        Node nn = node;
        Node head = null;
        for (int j = 0; j < i; j++) {
            Node newNode = new Node(nn.data);
            if (head == null) {
                head = newNode;
                nn = nn.next;
                continue;
            }
            nn = nn.next;
            Node node1 = head;
            while (node1.next != null) {
                node1 = node1.next;
            }
            node1.next = newNode;
        }


        dividNext = nn;
        return head;
    }

    public static void print(Node node) {
        if (node == null)
            return;

        System.out.print("  " + node.data);
        print(node.next);
    }

    public static Node add(int[] data) {
        Node head = null;
        int i = 0;
        while (i < data.length) {
            Node newNode = new Node(data[i]);
            i++;
            if (head == null) {
                head = newNode;
                continue;
            }

            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }

        return head;
    }
}
