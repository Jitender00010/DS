package com.ds.sorting;

class MergeSortLinkList extends MainClass {

    public static void main(String[] args) {
        int[] ar = {5,4,2,7,1};

       Node node = addNode(ar);
        print(node);

        print(mergeSort(node));
    }

    public static Node addNode(int[] ar){
        Node head = null;

        for (int i : ar){
           Node node = new Node(i);
            if (head == null){
               head = node;
               continue;
            }

            Node newNode = head;

            while (newNode != null && newNode.next != null){
                newNode = newNode.next;
            }

            newNode.next = node;
        }

        return head;
    }

    public static void print(Node node){
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }

        System.out.println();
    }

    private static Node mergeSort(Node node){
        if (node == null || node.next == null)
            return node;

        Node middle = getMiddle(node);
        Node middleNext = middle.next;
        middle.next = null;

        Node left = mergeSort(node);
        Node right = mergeSort(middleNext);

       Node node1 =  merge(left,right);
        return node1;
    }

    private static Node merge(Node leftNode, Node rightNode) {
        if (leftNode == null){
            return rightNode;
        }

        if (rightNode == null)
            return leftNode;

        Node result = null;
       // {5,4,2,7,1};
        if (leftNode.data <= rightNode.data){
            result = leftNode;
            result.next = merge(leftNode.next, rightNode);
        }else {
            result = rightNode;
            result.next = merge(leftNode, rightNode.next);

        }
        return result;
    }

    private static Node getMiddle(Node node){
        Node fastNode = node.next;
        Node slowNode = node;

        while (fastNode != null && fastNode.next != null ){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}
