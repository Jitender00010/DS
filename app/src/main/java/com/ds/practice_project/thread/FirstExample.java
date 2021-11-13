package com.ds.practice_project.thread;

import static java.lang.Thread.sleep;

public class FirstExample{

    volatile boolean check = true;

    public void odd() throws Exception {
        synchronized (this) {
            for (int i = 1; i < 20; i = i + 2) {
                //System.out.println("Second is Running.dd.");
                if (check) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("First is Running.." + i);
                check = true;
                notify();
                sleep(100);
            }
        }
    }

    public void even() throws Exception {
        synchronized (this) {
            for (int i = 0; i < 20; i = i + 2) {
                if (!check) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        System.out.println(" is errr.." + e.getMessage());
                    }
                }

                System.out.println("Second is Running.." + i);
                check = false;
                notify();
                sleep(100);
            }
        }
    }

    public static void main(String[] args) {
        final FirstExample obj = new FirstExample();

        Thread thread  = new Thread(){
            @Override
            public void run() {
                //super.run();
                try {
                    obj.even();
                    /*synchronized (this) {
                        for (int i = 1; i < 20; i = i + 2) {
                            //System.out.println("Second is Running.dd.");
                            if (obj.check) {
                                try {
                                    wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            System.out.println("First is Running.." + i);
                            obj.check = true;
                            notify();
                            sleep(100);
                        }
                    }*/
                }catch (Exception e){
                    System.out.print(e.getMessage());
                }
            }
        };

        Thread thread2  = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    obj.odd();
                   /* synchronized (this) {
                        for (int i = 0; i < 20; i = i + 2) {
                            if (!obj.check) {
                                try {
                                    wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                    System.out.println(" is errr.." + e.getMessage());
                                }
                            }

                            System.out.println("Second is Running.." + i);
                            obj.check = false;
                            notify();
                            sleep(100);
                        }
                    }*/
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread2.start();
        thread.start();

        try {
            thread2.join();
            thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        System.out.print("hello test");
    }
}
