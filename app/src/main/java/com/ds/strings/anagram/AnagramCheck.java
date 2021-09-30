package com.ds.strings.anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "dcba";
        checkAnangram(s1.toCharArray(),s2.toCharArray());
    }

    private static void checkAnangram(char[] s1, char[] s2) {
        if (s1.length != s2.length){
            System.out.print("Not anagram");
            return;
        }

        Arrays.sort(s1);
        Arrays.sort(s2);


        for (int i=0; i < s1.length; i++){
            if (s1[i] != s2[i]){
                System.out.print("Not anagram");
                return;
            }
        }
        System.out.print("Anagram given string");
    }

}
