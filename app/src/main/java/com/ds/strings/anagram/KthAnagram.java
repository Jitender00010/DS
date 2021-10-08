package com.ds.strings.anagram;

/**
 * Check if two strings are k-anagrams or not
 * Difficulty Level : Easy
 * Last Updated : 13 Jul, 2021
 * Given two strings of lowercase alphabets and a value k, the task is to find if two strings are K-anagrams of each other or not.
 * Two strings are called k-anagrams if following two conditions are true.
 *
 * Both have same number of characters.
 * Two strings can become anagram by changing at most k characters in a string.
 * Examples :
 *
 * Input:  str1 = "anagram" , str2 = "grammar" , k = 3
 * Output:  Yes
 * Explanation: We can update maximum 3 values and
 * it can be done in changing only 'r' to 'n'
 * and 'm' to 'a' in str2.
 *
 * Input:  str1 = "geeks", str2 = "eggkf", k = 1
 * Output:  No
 * Explanation: We can update or modify only 1
 * value but there is a need of modifying 2 characters.
 * i.e. g and f in str 2.*/

class KthAnagram {

    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grammar";
        int k = 3;

        search(str1,str2,k);
    }

    private static void search(String str1, String str2, int k) {

        if (str1.length() != str2.length()){
            return;
        }

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

        if (k >= co){
            System.out.print("YES "+co);
        }else {
            System.out.print("YES 0");
        }
    }
}
