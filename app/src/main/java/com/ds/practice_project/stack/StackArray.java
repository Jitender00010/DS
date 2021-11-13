package com.ds.practice_project.stack;

public class StackArray {

    private int max_Size = 4;
    private int[] ar = new int[max_Size];
    private int top = -1;

    public static void main (String[] ag){

    }

    public void print(){
        for (int x : ar){
            System.out.print(x+" ");
        }

        System.out.println();
    }

    public void push(int a){
        if(top ==  max_Size-1){
            System.out.println("StackArray over flow for "+a+" no.");
            return;
        }

        top++;
        ar[top] = a;
    }

    public void pop(){
        if (top == -1){
            System.out.println("StackArray under flow");
            return;
        }
        top--;
    }

    public int top(){
        if (top == -1)
            return 0;
       return ar[top];
    }
}
