package com.ds.practice_project.stack;

import com.ds.practice_project.linkList.Node;

public class StackLinkList {

    public Node top = null;

    public static void main(String[] ag) {
    }

    public void print(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data+" ");
        print(node.next);
    }

    public Node Push(Node node){
        if (top == null){
            top = node;
            return top;
        }

        node.next = top;
        top = node;
        return top;
    }

    public Node Pop(){  // 3   7   5
        if (top == null){
            System.out.print("List under flow");
            return null;
        }

        top = top.next;
        return top;
    }

    public Node getTop(){
        return top;
    }
}
