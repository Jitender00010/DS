package com.ds.strings;
/**
 * Rearrange a string in sorted order followed by the integer sum
 * Difficulty Level : Easy
 * Last Updated : 28 Apr, 2021
 * Given a string containing uppercase alphabets and integer digits (from 0 to 9), the task is to print the alphabets in the order followed by the sum of digits.
 *
 *
 * Examples:
 *
 * Input : AC2BEW3
 * Output : ABCEW5
 * Alphabets in the lexicographic order
 * followed by the sum of integers(2 and 3).*/

class StringSortIntSum {

    public static void main(String[] args) {
        String str = "AC2BEW3";

        sortStringAndSum(str.toCharArray());
    }

    private static void sortStringAndSum(char[] toCharArray) {
        StringBuffer stringBuffer = new StringBuffer();
        int sum = 0;
        int[] ar = new int[26];

        for (char x : toCharArray) {
            if (Character.isUpperCase(x)) {
                ar[x - 'A']++;
            } else {
                sum = sum + (x-'0');
            }
        }


        for (int i=0; i < 26; i++){
            for (int j=0; j < ar[i]; j++){
                stringBuffer.append((char)(i +'A'));
            }
        }

        stringBuffer.append(sum);

        System.out.print(stringBuffer);
    }
}
