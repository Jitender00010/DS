package com.ds.strings.anagram;

/**
 * Given a sequence of words, print all anagrams together using STL
 * Difficulty Level : Medium
 * Last Updated : 10 Jun, 2021
 * Given an array of words, print all anagrams together.
 *
 * For example,
 *
 * Input: array = {“cat”, “dog”, “tac”, “god”, “act”}
 * output: cat tac act, dog god
 * Explanation: cat tac and act are anagrams
 * and dog and god are anagrams as
 * they have the same set of characters.
 *
 * Input: array = {“abc”, “def”, “ghi”}
 * output: abc, def, ghi
 * Explanation: There are no anagrams in the array.
 * */
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

public class PrintAllAnagramFromSequence {

    public static void main(String[] args) {
        String[] words = {"cat", "dog", "tac", "god", "act"};
        print(words);
    }

    static void print(String[] words) {

        HashMap<Integer, LinkedList<String>> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            int key = ASCIIVALUE(str);
            if (!map.containsKey(key)) {
                LinkedList l = new LinkedList();
                l.add(str);
                map.put(key, l);
            } else {
                LinkedList l = map.get(key);
                l.add(str);
                map.put(key, l);
            }
        }

        for (Entry entry : map.entrySet()) {
            LinkedList l = (LinkedList) entry.getValue();
            Collections.sort(l);
            System.out.println(l);
        }

    }

    static int ASCIIVALUE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count = count + str.charAt(i);
        }

        return count;
    }

}