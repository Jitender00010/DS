package com.ds.practice_project.stack;

public class CheckParentheses {

    public static void main(String[] agr) {
        CheckParentheses checkParentheses = new CheckParentheses();
        String str = "{[()]}";
      //  String str = "{[)(]}";
        //String str = "}{";
        checkParentheses.push(str.toCharArray());
    }

    public void push(char[] charAry){

        if (charAry.length ==0)
            return;

        Stack stackLinkList = new Stack();
        StackNode head = null;
        for (char c : charAry) {

            if (c =='{' || c == '('|| c == '['){
                 stackLinkList.push(new StackNode(c));   //{[)(]}
            }
            else if (c ==')') {
                if (stackLinkList.isEmpty() || !stackLinkList.pop().data.toString().equalsIgnoreCase("(") ) {
                    System.out.print("FALSE");
                    return;
                }
            } else if (c ==']'){
                if (stackLinkList.isEmpty() || !stackLinkList.pop().data.toString().equalsIgnoreCase("[") ) {
                    System.out.print("FALSE");
                    return;
                }
            } else if (c =='}'){
                if (stackLinkList.isEmpty() || !stackLinkList.pop().data.toString().equalsIgnoreCase("{") ) {
                    System.out.print("FALSE");
                    return;
                }
            }
        }

        System.out.print(stackLinkList.isEmpty());
    }
}
