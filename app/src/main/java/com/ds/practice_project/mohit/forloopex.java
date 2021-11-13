package com.ds.practice_project.mohit;



class forloopex {
    void loop(){
        for (int i = 5; i>=0; i--){
            for (int j = i; j>=0 ;j--) {
                System.out.print("*");
            }
             System.out.println("*");
        }

    }
        public static void main(String[] args){
            forloopex obj = new forloopex();
            obj.loop();
        }
}
