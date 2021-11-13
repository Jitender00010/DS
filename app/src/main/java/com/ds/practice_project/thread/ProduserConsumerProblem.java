package com.ds.practice_project.thread;

import java.util.Stack;

public class ProduserConsumerProblem {

    public volatile Stack<Integer> stack = new Stack<>();

    public void produser() throws Exception {
        synchronized (this) {
            for (int i = 0; i < 4; i++) {

                    if (!stack.isEmpty()) {
                        wait();
                    }

                System.out.println("Produser "+i);
                stack.push(i);
                notify();
                Thread.sleep(100);
            }
        }
    }

    public void consumer() throws Exception {
        synchronized (this) {
            for (int i = 0; i < 4; i++) {
                if (stack.isEmpty()) {
                    wait();
                }

                System.out.println("Consumer "+stack.peek());
                stack.pop();
                notify();
                Thread.sleep(100);
            }
        }
    }

    public static void main(String[] args) {
        final ProduserConsumerProblem obj = new ProduserConsumerProblem();

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        obj.produser();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {

                    try {
                        obj.consumer();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            t1.start();
            t2.start();
    }
}
