package com.ds.practice_project.oops.inheritance;

public class SubClass extends BaseClass {

    public void subClassdisplay(){
        variable = 0;
        System.out.println("SubClass ===SubClassdisplay funtion==  "+variable);
    }

        void display(){
        System.out.println("SubClass ===display funtion==");
    }

    public static void main(String[] args) {

        SubClass obj = new SubClass();

        obj.subClassdisplay();
        System.out.println("SubClass ===display funtion== "+new SubClass());
        obj.display();
    }

    public static void main(String[] s, String s2) {
        System.out.println("SubClass ===main main==");
    }
}
