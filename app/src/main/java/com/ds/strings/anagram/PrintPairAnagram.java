package com.ds.strings.anagram;

import java.util.ArrayList;

/**
 * Print all pairs of anagrams in a given array of strings
 * Difficulty Level : Medium
 * Last Updated : 07 Sep, 2021
 * Given an array of strings, find all anagram pairs in the given array.
 * Example:
 *
 *
 * Input: arr[] =  {"geeksquiz", "geeksforgeeks", "abcd",
 *                  "forgeeksgeeks", "zuiqkeegs"};
 * Output: (geeksforgeeks, forgeeksgeeks), (geeksquiz, zuiqkeegs)*/

class PrintPairAnagram {

    public static void main(String[] args) {
        String[] ar ={"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs","geeskforgeesk"};

        search(ar);
    }

    private static void search(String[] ar) {

        String[] nAr = new String[ar.length];
        int j =0;
        for (String s : ar){
            String sortSting ="";
            for (int a= 'a'; a <= 'z'; a++){

                for (int i =0; i < s.length();i++){
                    if (s.charAt(i) == a){
                        sortSting = sortSting + (char)s.charAt(i);
                    }
                }

            }

            nAr[j] = sortSting;
            j++;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i =0 ; i<ar.length; i++){

            for (int k = i+1; k < ar.length; k++){
                if (nAr[i].equals(nAr[k])){
                    System.out.print(ar[i]+" , "+ar[k]);
                    list.add(ar[i]);
                    list.add(ar[j]);
                }
            }
        }


        //System.out.print(nAr);
    }



    //===============
    static final int NO_OF_CHARS = 256;

    /* function to check whether two
    strings are anagram of each other */
    static boolean areAnagram(String str1, String str2)
    {
        // Create two count arrays and initialize
        // all values as 0
        int[] count = new int[NO_OF_CHARS];
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < str1.length() && i < str2.length();
             i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (str1.length() != str2.length())
            return false;

        // See if there is any non-zero value in
        // count array
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0)
                return false;
        return true;
    }

    // This function prints all anagram pairs in a
    // given array of strings
    static void findAllAnagrams(String arr[], int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (areAnagram(arr[i], arr[j]))
                    System.out.println(arr[i] +
                            " is anagram of " + arr[j]);
    }

}
