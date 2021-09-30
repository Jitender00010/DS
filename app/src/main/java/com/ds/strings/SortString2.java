package com.ds.strings;

/**
 * Sort the given string using character search
Difficulty Level : Easy
Last Updated : 14 Jun, 2021
Given a string str of size n. The problem is to sort the given string without using any sorting techniques (like bubble, selection, etc). The string contains only lowercase characters.
Examples:


Input : geeksforgeeks
Output : eeeefggkkorss

Input : coding
Output : cdgino*/

class SortString2 {

    public static void main(String[] args) {
        String str = "anchal";

        sortString(str.toCharArray());
    }

    private static void sortString(char[] toCharArray) {

        StringBuffer stringBuffer = new StringBuffer();

       for (int i= 'a'; i <= 'z'; i++){
           for (char a : toCharArray){
               if (a == i){
                   stringBuffer.append(a);
               }
           }
       }

       System.out.println(stringBuffer);
    }
}
