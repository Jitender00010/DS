package com.ds.strings.palinedrome;
/**
 * Check if a given string is a rotation of a palindrome
 * Difficulty Level : Medium
 * Last Updated : 07 Jul, 2021
 * Given a string, check if it is a rotation of a palindrome. For example your function should return true for “aab” as it is a rotation of “aba”.
 * Examples:
 *
 * Input:  str = "aaaad"
 * Output: 1
 * // "aaaad" is a rotation of a palindrome "aadaa"
 *
 * Input:  str = "abcd"
 * Output: 0
 * // "abcd" is not a rotation of any palindrome*/

class RotationPalindrome {

    public static void main(String[] args) {
        String a = "aab";
        int c = 1;

        isPalindrome(a,c);
    }

    private static void isPalindrome(String a, int c) {

        char[] rotate = a.toCharArray();
        for (int i = 0; i < rotate.length; i++) {
            rotate = rotateString(rotate);

            boolean check = checkPalindrome(rotate);

            if (check) {
                System.out.println("Palindrome");
                return;
            }
        }


        System.out.println("Not Palindrome");
    }

    private static boolean checkPalindrome(char[] rotate) {
        for (int j = 0, k = rotate.length - 1; j < rotate.length && k > 0; j++, k--) {
            if (rotate[j] != rotate[k]) {
                return false;
            }
        }

        return true;
    }

    private static char[] rotateString(char[] toCharArray) {
        for (int i=0; i < toCharArray.length-1; i++){
            char temp;
            temp = toCharArray[i];
            toCharArray[i] = toCharArray[i+1];
            toCharArray[i+1] = temp;
        }

        return toCharArray;
    }
}
