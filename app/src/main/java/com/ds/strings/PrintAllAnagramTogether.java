package com.ds.strings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given a sequence of words, print all anagrams together | Set 2
 * Difficulty Level : Hard
 * Last Updated : 13 Sep, 2021
 * Given an array of words, print all anagrams together. For example, 
 * if the given array is {"cat", "dog", "tac", "god", "act"},
 * then output may be "cat tac act dog god".
 * */

class PrintAllAnagramTogether {

    public static void main(String[] args) {
        String[] ar = {"cat", "dog", "tac", "god", "act"};

        printAllAnagram(ar);
    }

    private static void printAllAnagram(String[] ar) {
        ArrayList<String> ar2 = new ArrayList<>();
        String[] aa = ar;

        for (String s : ar){
            Arrays.sort(s.toCharArray());
        }

        for (int i=0; i< ar.length; i++ ){

            for (int j = i+1; j< ar.length; j++){

                if (ar[i].length() != ar[j].length()){

                    break;
                }

                for (int k=0; k < ar[i].length() ;k++){
                    if (ar[i].charAt(k) != ar[j].charAt(k)){
                        break;
                    }
                }

                ar2.add(aa[i]);
            }
        }

        for (String a : ar2){
            System.out.print(a+" ");
        }
    }
}
