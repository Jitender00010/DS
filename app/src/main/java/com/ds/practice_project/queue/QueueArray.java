package com.ds.practice_project.queue;

public class QueueArray {

    static int[] ar = new int[3];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] arg){
        QueueArray queueArray = new QueueArray();

        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.deQueue();

        queueArray.enQueue(3);

        queueArray.deQueue();
        queueArray.enQueue(4);
        queueArray.enQueue(5);

        if (!queueArray.isEmpty())
        printQue();

    }

    public static void printQue() {

        for (int i=0 ; i< ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        else
            return false;
    }

    public void enQueue(int x){
        /*if (rear == ar.length-1){
            System.out.println("Queue full");
            return;
        }*/

        if (isEmpty()){
            front = rear = 0;
        }else {
            rear = (rear + 1)%ar.length;
        }

        if (front == rear){
            System.out.println("Reach end");
            return;
        }
        ar[rear] = x;
    }

    public void deQueue(){
        if (isEmpty()){
            System.out.println("Queue already empty");
            return;
        }

       else if (front == 0 && rear == 0) {
            front = -1;
            rear = -1;
            return ;
        }else {
            front = (front + 1)%ar.length;
        }
    }

}
