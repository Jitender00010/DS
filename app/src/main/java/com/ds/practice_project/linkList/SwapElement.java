package com.ds.practice_project.linkList;

public class SwapElement {
    Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node node = head;
        while (node.next != null)
            node = node.next;

        node.next = newNode;
    }

    public void printList(){
        Node node = head;
        while (node != null) {
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public void swap(int a,int b){

        Node node = head;
        Node node1 = head;
        Node firstPre = null,firstNext = null;
        Node secondPre = null,secondNext = null;
        Node second = null;
        Node first = null;

        while (node != null){
            if (node.data == a){
                first = node;
                firstNext = node.next;
                break;
            }
            firstPre = node;
            node = node.next;
        }

        while (node1 != null){
            if (node1.data == b){
                second = node1;
                secondNext = node1.next;
                break;
            }
            secondPre = node1;
            node1 = node1.next;
        }

        if (firstPre == null){
            head = second;
            secondPre.next = first;
            second.next = first.next;
            secondPre.next.next = null;
        }else {
            firstPre.next = secondPre.next;
            second.next = firstNext;

            secondPre.next = first;
            first.next = secondNext;
        }
    }

    public static void main(String[] ag){
        SwapElement swapElement = new SwapElement();

        swapElement.add(1);
        swapElement.add(2);
        swapElement.add(3);
        swapElement.add(4);
        swapElement.add(5);

        swapElement.printList();
        System.out.println();
        swapElement.swapNodes(1,5);
        //swapElement.swap(1,5);
        swapElement.printList();

    }

    public void swapNodes(int x, int y)
    {
        // Nothing to do if x and y are same  null 1 2 3 4 5
        if (x == y) return;

        // Search for x (keep track of prevX and CurrX)
        Node prevX = null, currX = head;
        while (currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }

        // Search for y (keep track of prevY and currY)
        Node prevY = null, currY = head;
        while (currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }

        // If either x or y is not present, nothing to do
        if (currX == null || currY == null)
            return;

        // If x is not head of linked list
        if (prevX != null)
            prevX.next = currY;
        else //make y the new head
            head = currY;

        // If y is not head of linked list
        if (prevY != null)
            prevY.next = currX;
        else // make x the new head
            head = currX;

        // Swap next pointers
        Node temp = currX.next;
        System.out.println("x "+currY.data);

        currX.next = currY.next;
        currY.next = temp;

        System.out.println("y "+currY.next.data);
    }
}
