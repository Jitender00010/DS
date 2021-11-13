package com.ds.practice_project.stack;

public class Stack {

    public StackNode top = null;

    public void print(StackNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        print(node.next);
    }

    public StackNode push(StackNode node) {
        if (top == null) {
            top = node;
            return top;
        }

        node.next = top;
        top = node;
        return top;
    }

    public StackNode pop() {  // 3   7   5
        if (top == null) {
            System.out.print("List under flow");
            return null;
        }
        StackNode mTop = top;

        top = top.next;
        return mTop;
    }

    public StackNode getTop() {
        return top;
    }

    public boolean isEmpty(){
        if (top == null)
            return true;
        return false;
    }
}
