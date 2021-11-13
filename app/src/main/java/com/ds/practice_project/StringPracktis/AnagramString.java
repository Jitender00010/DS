package com.ds.practice_project.StringPracktis;

import java.util.HashMap;

public class AnagramString {

    public static void main(String[] arg) {
        String str1 = "allergy";
        String str2 = "allergc";

        if (checkAnagram(str1, str2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }

    private static Boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(String.valueOf(str1.charAt(i)))) {
                int val = map.get(String.valueOf(str1.charAt(i)));
                val++;
                map.put(String.valueOf(str1.charAt(i)), val);
            } else {
                map.put(String.valueOf(str1.charAt(i)), 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(String.valueOf(str2.charAt(i)))) {
                int val = map.get(String.valueOf(str2.charAt(i)));
                val--;
                map.put(String.valueOf(str2.charAt(i)), val);
            }
        }

        for (String s : map.keySet()){
            if (map.get(s) != 0){
                return false;
            }

        }

        return true;

    }
}
