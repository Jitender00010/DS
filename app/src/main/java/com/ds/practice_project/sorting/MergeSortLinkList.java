package com.ds.practice_project.sorting;

import com.example.practice.linkList.Node;

public class MergeSortLinkList {

   static Node node;

    public static Node add(int[] data){
        Node head = null;
        int i=0;
        while ( i < data.length){
            Node newNode = new Node(data[i]);
            i++;
            if (head == null){
                head = newNode;
                continue;
            }

            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = newNode;
        }

        return head;
    }

    public static void main(String[] arg){
        int[] ar = {5,4,2,7,1};

        node = add(ar);
        print(node);
        System.out.println();
       // System.out.println(getMiddel(node).data);
      //  sortList(node);
        print(sortList(node));
    }

    public static void print(Node node){
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public static Node sortList(Node node) {

        if (node == null || node.next == null) {
            return node;
        }
        Node middelNode = getMiddel(node);
        Node nextMiddle = middelNode.next;

        middelNode.next = null;

        Node left = sortList(node);
        Node right = sortList(nextMiddle);

        Node nn = merge(left,right);
        return nn;

    }

    public static Node merge(Node left,Node right){
        Node result = null;  //5,4,2,7,1

        if (left == null)
            return right;

        if (right == null)
            return left;

        if (left.data <= right.data){
            result = left;
            result.next = merge(left.next,right);
        }else {
            result = right;
            result.next = merge(left,right.next);
        }
        return result;
    }

    public static Node getMiddel(Node node){
        Node fast = node.next;  //5,4,2,7,1
        Node slow = node;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
