package com.ds.practice_project.queue;

import com.example.practice.linkList.Node;

public class QueueLinkList {

    public static Node head =null, front = null,rear = null;

    public static void main(String[] arg) {

        enQueue(1);
        deQueue();
        enQueue(2);

        print(front);
    }

    public static void print(Node node){
        if (node == null)
            return;

        System.out.print(node.data+" ");
        print(node.next);
    }

    public static void enQueue(int x) {
        Node node = new Node(x);

        if (front == null && rear == null){
            front = node;
            rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    public static void deQueue(){
        if (front == null)
        {
            System.out.println("Nothing to delete");
            return;
        }

        if (front == rear){
            front = null;
            rear = null;
            return;
        }

        front = front.next;
    }
}
