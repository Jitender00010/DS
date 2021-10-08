package com.ds.strings.anagram;
/**
 * Remove minimum number of characters so that two strings become anagram
 * Difficulty Level : Easy
 * Last Updated : 12 Apr, 2021
 * Given two strings in lowercase, the task is to make them anagram. The only allowed operation is to remove a character from any string. Find minimum number of characters to be deleted to make both the strings anagram?
 * If two strings contains same data set in any order then strings are called Anagrams.
 *
 * Examples :
 *
 * Input : str1 = "bcadeh" str2 = "hea"
 * Output: 3
 * We need to remove b, c and d from str1.
 *
 * Input : str1 = "cddgk" str2 = "gcd"
 * Output: 2
 *
 * Input : str1 = "bca" str2 = "acb"
 * Output: 0*/

class RemoveNoOfCharMakeAnagram {

    public static void main(String[] args) {
        String str1 = "bca";
        String str2 = "acb";

        search(str1,str2);
    }

    private static void search(String str1, String str2) {

        char[] ar = new char[26];

        for (char s : str1.toCharArray()){
            ar[s - 'a']++;
        }
        for (char s : str2.toCharArray()){
            ar[s - 'a']--;
        }

        int co = 0;
        for (int i=0 ;i < ar.length; i++){
            if (ar[i] == 1){
                co++;
            }
        }

        System.out.print(co);
    }
}
