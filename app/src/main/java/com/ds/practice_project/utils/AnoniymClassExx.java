package com.ds.practice_project.utils;

public class AnoniymClassExx {

    AnonimusClass anonimusClass = new  AnonimusClass(){

        int v = 0;
        @Override
        void print(String val) {

            System.out.print(" print "+val+"   "+v);
        }

        @Override
        void print2(String val2) {
            System.out.print(" print "+val2);
        }
    };




    public static void main(String[] args) {

        AnoniymClassExx t = new AnoniymClassExx();
        t.anonimusClass.print("jitu ");
        t.anonimusClass.print2("mohit ");

         AnonimusClass c = new AnonimusClass() {
            @Override
            void print(String val) {
                System.out.print(" printeee "+val);

            }
        };

        c.print("dddd");

        AnonimusInterface anonimusInterface = new AnonimusInterface() {
            @Override
            public void printVal(String val) {
                System.out.print(val);
            }

            @Override
            public void printVal1(String val) {
                System.out.println("ttes "+val);
            }
        };

        anonimusInterface.printVal("anonimaintercace");
    }


    abstract static class AnonimusClass{
        abstract void print(String val);
        void print2(String val2){
        }
    }


    interface AnonimusInterface{
        void printVal(String val);
        void printVal1(String val);
    }

}