package com.ds.practice_project.stack;

import java.util.Stack;

public class ReverseStack {

    public static void main(String[] arg) {
        Stack stack = new Stack();
        Stack stack1 = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverse(stack);

        print(stack);
    }

    private static void print(Stack stack) {
        if (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
            print(stack);
        }
    }

    private static Stack reverse(Stack stack) {

        if (stack.size() == 0) {
            return stack;
        }

        int val = Integer.parseInt(stack.peek().toString());
        stack.pop();
        reverse(stack);
        Stack ss= reverseStack(stack,val);
        return ss;
    }

    public static Stack reverseStack(Stack stack, int x){   // 3
                                                          //  2      2 1
                                                          //  1  1   1 2
        if (stack.isEmpty())
            stack.push(x);
        else {
            int val = Integer.parseInt(stack.peek().toString());
            stack.pop();
            reverseStack(stack,x);
            stack.push(val);
        }
        return stack;
    }
}
