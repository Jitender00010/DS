package com.ds.practice_project.thread.objectLockClassLock;


class ThreadEx extends Thread {

    ObjectLock objectLock;
    
    ThreadEx(ObjectLock objectLock){
        this.objectLock = objectLock;
    }
    
    @Override
    public void run() {
        super.run();
        
        objectLock.LoopMethod();

    }

    public static void main(String[] args) {
        
       /* ObjectLock objectLock = new ObjectLock();    // this is example of object base lock if use single object multipal thread then only object use by one thread at a time
        ThreadEx threadEx = new ThreadEx(objectLock);
        ThreadEx threadEx1 = new ThreadEx(objectLock);
        threadEx.start();
        threadEx1.start();*/

        ObjectLock objectLock = new ObjectLock();
        ObjectLock objectLock1 = new ObjectLock();
        ThreadEx threadEx = new ThreadEx(objectLock);
        ThreadEx threadEx1 = new ThreadEx(objectLock1);
        threadEx.start();
        threadEx1.start();

    }
}