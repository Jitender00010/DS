package com.ds.practice_project.stack;

import java.util.ArrayList;
import java.util.Stack;

public class ParentheseQ {

   // static String ar[] = {"5", "5", "15", "+", "*", "5", "15", "5", "+", "*", "+"};
    static String ar1[] = {"5", "*", "15", "+", "5", "+", "15", "*", "3", "-", "20"};
    static Stack<String> infixStact = new Stack<>();  // 5*15+5+15*3-20  75+45 120-20 100
    static String res = "";
    static Stack stack = new Stack();

    public static void main(String[] arg) {  //((5+5)*5)
        String srt = "[{[{5*{5+15}}]+{5*{5+5}}}]"; //150  100 250  5515+*555+*+
        //  String srt= "{[())]}"; // ab+c*


        // System.out.println(checkParenthese(srt.toCharArray()));
        String ar[] = {"[", "{", "[", "{","5", "-", "{", "5", "+", "15", "}", "}",
                "]","+","{","5","*","{","5","+","5","}","}","}","]"};

        System.out.println(checkParenthese(ar));
        infixToPostfix2(ar);
        addNo1(list);
    }
    static ArrayList<String> list = new ArrayList<>();
    private static void infixToPostfix2(String[] toCharArray) {
        String result = "";
        int i = 0;
        for (String s : toCharArray){
            if (checkBrakit(s) ){
                result = result+s;
                list.add(s);
            }else if (s == "{" || s == "[" || s == "("  || s == "+" || s == "-" || s == "/" || s == "*" ){
                infixStact.push(s);
            }else {
               while (!infixStact.empty() && checkInStack(s,infixStact.peek())){
                   String ss = infixStact.pop();
                   result = result+ss;
                   list.add(ss);
               }
            }
        }

        System.out.println("res = "+result);
        System.out.println("res = "+list);
    }

    private static boolean checkHighVal(String s, String top){
        if (top == "*" && (s == "*") )
            return true;
        else if (top == "/" && (s == "*" || s == ")" || s == "]" || s == "}"))
            return true;
        else if (top == "+" && (s == "*" || s == "/" || s == ")" || s == "]" || s == "}") )
            return true;
        else if (top == "-"  && (s == "*" || s == "/" || s == "+" || s == ")" || s == "]" || s == "}") )
            return true;
        else if (top == "(" || top == "[" || top == "{") {
            infixStact.pop();
            return false;
        }
        else
        return false;
    }
    private static boolean checkInStack(String s, String top){
        if (top == "*" && (s == "*" || s == ")" || s == "]" || s == "}") )
            return true;
        else if (top == "/" && (s == "*" || s == ")" || s == "]" || s == "}"))
            return true;
        else if (top == "+" && (s == "*" || s == "/" || s == ")" || s == "]" || s == "}") )
            return true;
        else if (top == "-"  && (s == "*" || s == "/" || s == "+" || s == ")" || s == "]" || s == "}") )
            return true;
        else if (top == "(" || top == "[" || top == "{")
            infixStact.pop();
            return false;
    }

    private static boolean checkBrakit(String s){
        if (s != "{" && s != "[" && s != "(" && s != "}" && s != "]" && s != ")" && s != "+" && s != "-"&& s != "/"&& s != "*" )
            return true;
        else
            return false;
    }

    public static boolean checkParenthese(String[] ar) {
        Stack<String> s = new Stack<>();

        for (String c : ar) {

            if (c == "(" || c == "{" || c == "[") {
                s.push(c);
            } else if (c == ")") {
                if (!s.empty() && !s.pop().equalsIgnoreCase("(")) {
                    return false;
                }
            } else if (c == "}") {
                if (!s.empty() && !s.pop().equalsIgnoreCase("{")) {
                    return false;
                }
            } else if (c == "]") {
                if (!s.empty() && !s.pop().equalsIgnoreCase("[")) {
                    return false;
                }
            }
        }

        if (s.empty())
            return true;
        else
            return false;
    }

    static Stack<String> stack1 = new Stack<>();

    private static void addNo(char[] toCharArray) {  //5+5*5
        for (char c : toCharArray) {
            if (c != '*' && c != '-' && c != '+' && c != '/') {
                stack.push(new StackNode(Integer.parseInt(String.valueOf(c))));
            } else {
                int a = Integer.parseInt(stack.pop().toString());
                int b = Integer.parseInt(stack.pop().toString());

                performoperaterFunction(a, b, c);
            }
        }

        System.out.print("result == " + stack.pop().toString());
    }

    private static void addNo1(ArrayList<String> toCharArray) { //5515+*555+*+
        for (String c : toCharArray) {
            if (c != "*" && c != "-" && c != "+" && c != "/") {
                stack1.push(c);

            } else {
                int a = Integer.parseInt(stack1.pop());
                int b = Integer.parseInt(stack1.pop());

                performoperaterFunction1(b, a, c);
            }
        }

        System.out.print("result == " + stack1.pop().toString());
    }

    private static void performoperaterFunction(int a, int b, char c) {
        int result = 0;
        if (c == '*') {
            result = b * a;
        } else if (c == '+') {
            result = b + a;
        } else if (c == '/') {
            result = b / a;
        } else if (c == '-') {
            result = b - a;
        }

        stack.push(new StackNode(result));
    }

    private static void performoperaterFunction1(int a, int b, String c) {
        int result = 0;
        if (c == "*") {
            result = b * a;
        } else if (c == "+") {
            result = b + a;
        } else if (c == "/") {
            result = b / a;
        } else if (c == "-") {
            result = b - a;
        }

        stack1.push("" + result);
    }

}
