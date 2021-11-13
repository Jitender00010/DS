package com.ds.practice_project.stack;

public class ReverseArray {

    // 1 2 3 4

    public static void main(String[] arg){
        StackArray stackArray = new StackArray();
        StackArray stackArray2 = new StackArray();

        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.print();
        System.out.println();
        stackArray2.push(stackArray.top());
        stackArray.pop();
        stackArray2.push(stackArray.top());
        stackArray.pop();
        stackArray2.push(stackArray.top());
        stackArray.pop();
        stackArray2.push(stackArray.top());
        stackArray.pop();
        stackArray2.push(stackArray.top());
        stackArray.pop();
        stackArray2.push(stackArray.top());
        stackArray.pop();
        stackArray2.print();


    }
}
