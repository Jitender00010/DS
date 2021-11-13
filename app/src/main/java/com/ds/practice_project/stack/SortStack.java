package com.ds.practice_project.stack;

import java.util.Stack;

public class SortStack {

    static Stack stack1 = new Stack();  // 10 4 5 7 9

    public static void main(String[] arg) {
        Stack stack = new Stack();  // 10 4 5 7 9
        // Stack stack1 = new Stack();  // 10 4 5 7 9

        //  9 7 5 4 10
        stack.push(7);
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(3);
        sortStack1(stack);
        print(stack1);
    }


    private static void print(Stack stack) {
        if (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
            print(stack);
        }
    }

    private static Stack sortStack(Stack stack) {
        if (stack.isEmpty()) {
            return stack;
        }

        int val = Integer.parseInt(stack.peek().toString());
        stack.pop();
        sortStack(stack);
        //stack.push(val);
        Stack ss = swipStack(stack, val);
        return ss;

    }

    private static Stack sortStack1(Stack stack) {
        if (stack.isEmpty()) {
            return stack;
        }

        int val = Integer.parseInt(stack.peek().toString());
        stack.pop();
        sortStack1(stack);
        //stack.push(val);
        Stack ss = swipStack1( val);
        return ss;
    }


//	3   7
//	6	6	2
//	4   4
//	2		4
//	7              1 2 3 4 5


    private static Stack swipStack1(int x) {

        if (stack1.isEmpty() || x > Integer.parseInt(stack1.peek().toString())) {
            stack1.push(x);
            return stack1;
        }

        int val = Integer.parseInt(stack1.peek().toString());
        stack1.pop();

        swipStack1( x);

        stack1.push(val);
        return stack1;
    }

    private static Stack swipStack(Stack stack, int x) {

        if (stack.isEmpty() || x > Integer.parseInt(stack.peek().toString())) {
            stack.push(x);
            return stack;
        }

        int val = Integer.parseInt(stack.peek().toString());
        stack.pop();

        swipStack(stack, x);

        stack.push(val);
        return stack;
    }

}
