package com.ds.practice_project.thread;

class FirstThreadEx {

     boolean check =true;

    public void EvenThread(){
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    synchronized (this){
                        for (int i =0; i < 10; i= i+2){

                            if (!check) {
                                wait();
                            }

                            System.out.println(i);
                            check = false;
                            notify();
                            sleep(1000);
                        }
                    }

                }catch (Exception e){
                    System.out.println(" is even.." + e.getMessage());

                }
            }
        }.start();
    }

    public void OddThread(){
        new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    synchronized (this){
                           for (int i =1; i < 10; i= i+2){

                               if (check) {
                                  wait();
                               }

                               System.out.println(i);
                               check = true;
                               notify();
                               sleep(1000);
                           }
                    }

                }catch (Exception e){

                }
            }
        }.start();
    }

    public static void main(String[] args) {

        FirstThreadEx obj = new FirstThreadEx();
        obj.EvenThread();
        obj.OddThread();
    }
}

