package com.ds.practice_project.thread;

public class SecondThread implements Runnable {

    SecondThread(){

    }

    @Override
    public void run() {
        try {
            synchronized (SecondThread.class) {
                for (int i = 1; i < 20; i = i + 2) {
                   // sleep(10);
                    //System.out.println("Second is Running.dd.");
                    /*while (FirstExample.check) {
                        wait();
                    }
                    System.out.println("Second is Running.." + i);
                    FirstExample.check = true;
                    notify();*/
                }
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
