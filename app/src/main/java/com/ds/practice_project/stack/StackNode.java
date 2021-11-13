package com.ds.practice_project.stack;

public class StackNode<T> {
    T data;
    StackNode next;

    StackNode(T t){
        data = t;
        next = null;
    }
}
