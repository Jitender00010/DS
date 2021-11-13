package com.ds.practice_project.StringPracktis;

import java.util.Stack;

public class RemoveAllAdjacent {

    public static void main(String[] arg){

        String str = "qpaaaaadaaaaadprq";  //qpaaaaadaaaaadprq
       // removeAdjacent(str.toCharArray());      amazon
        //                                        azonam

                                            //   geeksforgeeks
                                            //   geeksgeeksfor
        removeAdjacent2(str);
       // String s = str.substring(0,2) + str.substring(5,str.length());
        //System.out.println(s);
    }

    private static void removeAdjacent2(String str) {
        //System.out.println(res1.trim());

        Stack<Character> stack = new Stack<>();

        char last = 'p';

        for (char c : str.toCharArray()){

            if (!stack.isEmpty()) {
                if (stack.peek() == c) {
                    last = stack.pop();
                }else if (last == c){
                    last = '9';
                }
                else {
                    last = '9';
                    stack.push(c);
                }
            }
            else {
                last = '9';
                stack.push(c);
            }
        }

        for (char c : stack){
            System.out.print(c);
        }
    }

    private static void removeAdjacent(char[] c) {
        String res = "";
        String res1 = "";

        char[] cc = removeStr(c);

        for (int i=0 ;i < cc.length; i++){
            if (cc[i] != '\0'){
                res += cc[i];
            }
        }

        char[] ce = removeStr(res.toCharArray());

        for (int i=0 ;i < ce.length; i++){
            if (ce[i] != '\0'){
                res1 += ce[i];
            }
        }

        System.out.println(res1.trim());
    }

    private static char[] removeStr (char[] c){
        boolean check = true;
        for (int i=0; i < c.length-1; i++){
            if (i > -1 && c[i] == c[i+1] && c[i] != '\0'){
                int j = i+1;
                check = true;
                while (check){
                    if (c.length-1 >= j && c[i] == c[j]) {
                        c[j] = '\0';
                        j++;
                    }else {
                        check = false;
                        c[i] = '\0';

                        i--;
                    }
                }
            }
        }

        return c;
    }
}
