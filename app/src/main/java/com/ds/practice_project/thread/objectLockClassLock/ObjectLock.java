package com.ds.practice_project.thread.objectLockClassLock;

class ObjectLock {

    public  void LoopMethod(){

        synchronized (ObjectLock.class){
            for (int i=0; i<5; i++){
                System.out.println("Value = "+i);
                try{
                    Thread.sleep(1000);
                }catch (Exception e){

                }
            }
        }

    }
}


