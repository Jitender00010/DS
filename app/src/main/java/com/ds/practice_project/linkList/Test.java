package com.ds.practice_project.linkList;

public class Test {
    int temp =0,nn=0;
    Node list1,list2,list3;

    public static void main(String[] args) {
        System.out.printf("hello world");

        Test obj = new Test();

      //  obj.add1(9);                // 5  7  9       9  7  5


        obj.add1(9);
        obj.add1(9); // 7  8  9       9  8  7
        //obj. add1(8);               //1 3  6  8       8  6  3  1


        obj.add2(9);
        obj. add2(9);


        //Log.e(TAG, "list1:==== " );
        System.out.println("List1 ===");
        obj.display(obj.list1);
        obj.reverse(obj.list1);

       // Log.e(TAG, "list2:==== " );
        System.out.println("List2 ===");
        obj.display(obj.list2);
        obj.reverse2(obj.list2);

        obj.combinelist();
        obj.reverse3(obj.list3);
       // Log.e(TAG, "result:= " );
        System.out.println("Result ===");
        obj.display(obj.list3);
    }

    private Node addLinklist(int[] n1, int[] n2) {
    for (int i=0; i < n1.length; i++){
        add1(n1[i]);
    }
    reverse(list1);

    for (int i=0; i < n2.length; i++){
        add2(n1[i]);
    }
    reverse2(list2);

    combinelist();
    reverse3(list3);
    return list3;

    }

    private void combinelist() {
        Node first = list1,second = list2;

        int temp = 0;
        while (first != null || second != null) {
            int sum = 0;
            if (first != null && second != null) {
                sum = first.data + second.data + temp;
            } else if (first == null) {
                sum = second.data + temp;
            } else if (second == null)
                sum = first.data  + temp;

            int no = sum / 10;
            if (no == 0) {
                temp = 0;
                add3(sum);
            } else {
                temp = no;
                int nn = sum % 10;
                add3(nn);
            }
            if (first != null)
            first = first.next;

            if (second != null)
            second = second.next;
        }

        if (temp != 0)
            add3(temp);

    }

    private void add1(int data){
        Node newNode = new Node(data);
        if (list1 == null){
            list1 = newNode;
            return;
        }

        Node node = list1;
        while (node.next != null) {
            node = node.next;
        }

        node.next = newNode;
    }

    private void add2(int data){
        Node newNode = new Node(data);
        if (list2 == null){
            list2 = newNode;
            return;
        }

        Node node = list2;
        while (node.next != null) {
            node = node.next;
        }

        node.next = newNode;
    }

    private void add3(int data){
        Node newNode = new Node(data);
        if (list3 == null){
            list3 = newNode;
            return;
        }

        Node node = list3;
        while (node.next != null) {
            node = node.next;
        }

        node.next = newNode;
    }

    public void display(Node head){

        String res = "";
        while (head != null){
            res = res+" "+head.data;
            head = head.next;
        }
        System.out.println("display"+res);
        //Log.e(TAG, "display: "+res);
    }

    public void reverse(Node list){

        Node current = list;
        Node pre = null;
        Node next;

        while(current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        list1 = pre;
    }

    public void reverse2(Node list){

        Node current = list;
        Node pre = null;
        Node next;

        while(current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        list2 = pre;
    }

    public void reverse3(Node list){

        Node current = list;
        Node pre = null;
        Node next;

        while(current != null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        list3 = pre;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
}
