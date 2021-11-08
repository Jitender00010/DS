package com.ds.recursion;

import java.util.ArrayList;

/**
 * With this video, we introduce the concept of dynamic array also called as Arraylists.
 * We cover the basic concepts of arraylists and strings and move towards our first question
 * of recursion using arraylists. We also state the problem where we are required to get subsequences
 * from a string using recursion.
 *
 *
 * ex bc ->[--,b-,c-,bc]
 * For a better experience and more exercises, VISIT: https://www.pepcoding.com/resources/o...*/

class GetSubsequence {

    public static void main(String[] args) {

        String s = "abc";

        System.out.println(gss(s));
    }

    private static ArrayList<String> gss(String s) {
        if (s.length() == 0){
            ArrayList<String> newlIST = new ArrayList<>();
            newlIST.add("");
            return newlIST;
        }

        char c = s.charAt(0);
        String s1 = s.substring(1);
        ArrayList<String> list = gss(s1);
        ArrayList<String> myList = new ArrayList<>();

        for (String d : list){
            myList.add("-"+d);
            myList.add(c+d);
        }
        return myList;
    }
}
