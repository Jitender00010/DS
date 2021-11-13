package com.ds.practice_project.linkList;

public class RemoveDuplicateList {
    public Node head;

    public static void main(String[] ag){
        RemoveDuplicateList list = new RemoveDuplicateList();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(3);

        list.displayList();

        System.out.println("RESULT ==== ");
        //list.removeDuplicateShortedList();
        //list.removeDuplicates();
        list.remove_duplicates();
        list.displayList();
    }

    private void add(int data){
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

    private void displayList(){
        Node node = head;
        while (node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    void removeDuplicates()
    {
        int i = 0;
        Node first = head,second = null,pre =head;  // 1 1 1 2 2 4
       while (first != null ){
           second = first.next;
           while (second != null){
               if (first.data == second.data){
                   pre.next = second.next;
               }
               pre = second;
               second = second.next;
           }
           first = first.next;
         //  break;
       }
    }

    void remove_duplicates() {
        Node ptr1 = null, ptr2 = null;
        ptr1 = head;   // // 1 1 2 9 4 3

        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;

            while (ptr2.next != null) {
                if (ptr1.data == ptr2.next.data) {
                    ptr2.next = ptr2.next.next;
                } else {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }

    private void removeDuplicateShortedList(){
        Node first = head,second = null;
        Node preNode = head;
/*
        while (first != null){
            second = first.next;
            while (second != null){
                if (first.data == second.data){
                    first.next = second.next;
                }
                second = second.next;
            }

            first = first.next;
        }*/

        while (first != null){
            Node sec = first;

            while (sec != null && sec.data == first.data)
                sec = sec.next;

            first.next = sec;
            first = first.next;
        }

    }
}
