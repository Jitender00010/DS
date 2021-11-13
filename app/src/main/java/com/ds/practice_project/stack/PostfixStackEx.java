package com.ds.practice_project.stack;

public class PostfixStackEx {
    static Stack stack = new Stack();

    public static void main(String[] arg){

        String str = "93*55*+3-";  //"2*3+4*5-9"  17 93*55*+3-
        String postFixString = "-+*23*459";  //"2*3+4*5-9"  17 -+*23*459
        //postFixString(postFixString.toCharArray());
        addNo(str.toCharArray());

        //infixToPostfix2("{(a+b)*c}-d*e".toCharArray());   // ab+c*de*-
    }

    private static void addNo(char[] toCharArray) {
        for (char c : toCharArray){
            if(c != '*' && c != '-' && c != '+' && c != '/' ){
                stack.push(new StackNode(Integer.parseInt(String.valueOf(c))));
            }else {
                int a = Integer.parseInt(stack.pop().data.toString());
                int b = Integer.parseInt(stack.pop().data.toString());

                performoperaterFunction(a,b,c);
            }
        }

        System.out.print("result == "+stack.pop().data.toString());
    }

    private static void performoperaterFunction(int a, int b, char c) {
        int result = 0;
        if (c == '*'){
            result= b * a;
        }else if (c == '+'){
            result= b + a;
        }else if (c == '/'){
            result= b / a;
        }else if (c == '-'){
            result= b - a;
        }

        stack.push(new StackNode(result));
    }

    private static void postFixString(char[] ary){  //"2*3+4*5-9"  17 -+*23*459
        for (int i = ary.length-1; i >=0; i--){

            if (ary[i] != '-' && ary[i] != '+' && ary[i] != '*' && ary[i] != '/'  ){
                stack.push(new StackNode(String.valueOf(ary[i])));
            }else if (ary[i] == '-' || ary[i] == '+' || ary[i] == '*' || ary[i] == '/' ){

                int a = Integer.parseInt(stack.pop().data.toString());
                int b = Integer.parseInt(stack.pop().data.toString());
                performoperaterFunction(b,a,ary[i]);
            }
        }
        System.out.print("result == "+stack.pop().data.toString());
    }
    static String res = "";
    private static void infixTopostFix(char[] ary) {//a+b*c-d*e    abc*+de*-
        for (char c : ary) {
            if (c != '-' && c != '+' && c != '*' && c != '/') {
                res = res + String.valueOf(c);                                     //  -
            } else {                                          // *// +
                while (!stack.isEmpty() && !highPriority(stack.getTop().data.toString().toCharArray()[0],c) ){
                    res = res+stack.pop().data.toString();
                }
                stack.push(new StackNode(String.valueOf(c)));
            }
        }

        while (!stack.isEmpty()){
            res = res+stack.pop().data.toString();
        }
        System.out.print("result == "+res);

    }

    private static boolean highPriority(char top,char c){
        if (top == '*' && c == '*' ){
            return true;
        }else if (top == '/' && c == '*'){
            return true;
        }else if (top == '+' &&  c == '/' || c== '*' ){
            return true;
        }else if (top == '-' && ( c == '/' || c== '*'|| c== '+' )){
            return true;
        }else if (top == '(' && ( c == '/' || c== '*'|| c== '+' || c == '-' )){
            return true;
        }
        return false;
    }

    private static void infixToPostfix2(char[] ary){ //((a+b)*c)-d*e    ab+c*d-e*
        for (char c : ary) {                         // a+(b*c)
            if (c != '-' && c != '+' && c != '*' && c != '/' && c != '('&& c != '['&& c != '{'&& c != ')'&& c != ']'&& c != '}' ) {
                res = res + c;                                     //  -
            } else if (c == '(' ||c == '{' ||c == '[' ){                                          // *// +
                stack.push(new StackNode(String.valueOf(c)));
            } else if (c == ')' || c == '}' || c == ']'){
                while (!stack.isEmpty() &&  checkVal(stack.getTop().data.toString().toCharArray()[0])){
                    res = res+stack.pop().data.toString().toCharArray()[0];
                }
            } else {                                          // *// +
                while (!stack.isEmpty() && !highPriority(stack.getTop().data.toString().toCharArray()[0],c) ){
                    res = res+stack.pop().data.toString();
                }
                stack.push(new StackNode(String.valueOf(c)));
            }
        }

        while (!stack.isEmpty()){
            res = res+stack.pop().data.toString();
        }
        System.out.print("result == "+res);
    }

    private static boolean checkVal (char c){
        if (c == '*' || c == '+' || c == '-'|| c == '/') {
            return true;
        }else if (c == '(' || c == '{' || c == '['){
            stack.pop();
            return false;
        }
        return false;
    }
}
