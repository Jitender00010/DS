package com.ds.practice_project.sorting;

import com.example.practice.linkList.Node;

public class MergeSortLinkList2 {

    static Node node;

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

    public static void main(String[] arg) {
        int[] ar = {5, 4, 2, 7, 1};

        node = add(ar);
        print(node);
        System.out.println();
        // System.out.println(getMiddel(node).data);
        //  sortList(node);
        print(sortList(node));
    }

    public static Node sortList(Node node){

        if (node == null || node.next == null)
            return node;

        Node mid = middelNode(node);
        Node nextMiddle = mid.next;
        mid.next = null;

        Node left = sortList(node);
        Node right = sortList(nextMiddle);

        Node node1 = mergeNode( left, right);
        return node1;
    }

    private static Node mergeNode(Node left, Node right) {

        if (left == null)
            return right;

        if (right == null)
            return left;
        Node node = null;
        if (left.data >= right.data){
             node = mergeNode(left,right.next);
        }else {
            node = mergeNode(left.next,right);
        }
        return node;


    }

    public static Node middelNode(Node node){
        Node slow = node;
        Node fast = node.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
