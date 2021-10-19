package com.ds.strings.palinedrome;

/**
 * Check if characters of a given string can be rearranged to form a palindrome
 * Difficulty Level : Easy
 * Last Updated : 06 Oct, 2021
 * Given a string, Check if characters of the given string can be rearranged to form a palindrome.
 * For example characters of “geeksogeeks” can be rearranged to form a palindrome “geeksoskeeg”,
 * but characters of “geeksforgeeks” cannot be rearranged to form a palindrome. */

class RearrangedFormpalindrome {

    public static void check(String str, boolean isEven){
        char[] ar = new char[256];

        for (char c : str.toCharArray()){

            if (Character.isUpperCase(c)){

                ar[c-'A']++;
            }else {
                ar[c-'a']++;
            }
        }


        int count =0;

        for (int a =0; a < ar.length; a++){

            if (isEven){
                if (ar[a]%2 != 0){
                    System.out.println("Not palindrome");
                    return;
                }
            }else {

                if (ar[a]%2 != 0){
                    count++;
                }
            }
        }

        if (count > 2){
            System.out.println("Not palindrome");
        }else {
            System.out.println(" palindrome");
        }
    }

    public static void main(String[] args) {

        String str = "abgccfba";

        int r = str.length()%2;

        boolean c = false;
        if (r == 0)
            c = true;
        check(str,c);
    }
}
