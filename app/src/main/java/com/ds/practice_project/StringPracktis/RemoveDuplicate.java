package com.ds.practice_project.StringPracktis;

import java.util.TreeMap;

public class RemoveDuplicate {
    //Same sequence mentain

    public static void main(String[] arg){

        String str1 = "geeksforgeeks";
        removeDuplicate(str1);
    }

    private static void removeDuplicate(String str1) {

        TreeMap<String, String> map = new TreeMap<>();
        String res = "";
        for (int i=0; i<str1.length(); i++){
            if (map.containsKey(String.valueOf(str1.charAt(i)))){

            }else {
                res += String.valueOf(str1.charAt(i));
                map.put(String.valueOf(str1.charAt(i)), String.valueOf(str1.charAt(i)));
            }
        }


        System.out.println(res);
    }
}
