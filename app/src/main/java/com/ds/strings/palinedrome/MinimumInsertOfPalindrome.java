package com.ds.strings.palinedrome;
/**
 * Given a string str, the task is to find the minimum number of characters to be inserted to convert it to palindrome.
 *
 * Before we go further, let us understand with few examples:
 *
 * ab: Number of insertions required is 1 i.e. bab
 * aa: Number of insertions required is 0 i.e. aa
 * abcd: Number of insertions required is 3 i.e. dcbabcd
 * abcda: Number of insertions required is 2 i.e. adcbcda which is same as number of insertions in the substring bcd(Why?).
 * abcde: Number of insertions required is 4 i.e. edcbabcde*/

class MinimumInsertOfPalindrome {

    public static void main(String[] args) {
        String a = "anasdad";

        check(a);
    }

    private static void check(String a) {
        char[] ar = new char[256];

        for (char c : a.toCharArray()){
            if (Character.isUpperCase(c))
            ar[c - 'A']++;
            else{
                ar[c - 'a']++;
            }
        }

        int count =0;

        for (int i=0; i < ar.length; i++){
            if (ar[i] == 1){
                count++;
            }
        }

        if (count > 0){
            int r = count - 1;
            System.out.println("Miniume no of char is "+r);
        }else {
            System.out.println("Miniume no of char is "+count);
        }

    }
}
