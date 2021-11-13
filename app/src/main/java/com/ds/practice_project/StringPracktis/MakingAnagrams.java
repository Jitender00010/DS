package com.ds.practice_project.StringPracktis;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    public static void main(String[] arg) {
        String str1 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";  // cde c   fcrxzwscanmligyxyvym  absdjkvuahdakejfnfauhdsaavasdlkj output 30
        String str2 = "fcrxzwscanmligyxyvym";            // abc   jxwtrhvujlmrpdoqbisbwhmgpmeoke   djfladfhiawasdkjvalskufhafablsdkashlahdfa

        //28
        Map<String, Integer> map = new HashMap<>();
        String str = "";

        int i = 1;
        int count = 0;
        int count2 = 0;

        if (str1.length() > str2.length()) {
            for (char c : str1.toCharArray()) {
                if (map.containsKey(String.valueOf(c))) {
                    int v = map.get(String.valueOf(c));
                    v = v + 1;
                    map.put(String.valueOf(c), v);
                } else {
                    map.put(String.valueOf(c), 1);
                }

                count++;
            }
            for (char c : str2.toCharArray()) {
                if (map.containsKey(String.valueOf(c))) {
                    int v = map.get(String.valueOf(c));

                    if (v >= 1) {
                        v = v - 1;
                        map.put(String.valueOf(c), v);
                        count--;
                        //System.out.println("size ** " + v + " k*  " + c + " count  " + count);
                    } else {
                        count++;
                    }
                } else {
                    count++;
                    //System.out.println("val  k*  " + c + " count  " + count);
                }
            }
        } else {
            for (char c : str2.toCharArray()) {
                if (map.containsKey(String.valueOf(c))) {
                    int v = map.get(String.valueOf(c));
                    v = v + 1;
                    map.put(String.valueOf(c), v);
                } else {
                    map.put(String.valueOf(c), 1);
                }

                count++;
            }

            for (char c : str1.toCharArray()) {
                if (map.containsKey(String.valueOf(c))) {
                 int v = map.get(String.valueOf(c));

                    if (v >= 1) {
                        v = v - 1;
                        map.put(String.valueOf(c), v);
                        count--;
                        //System.out.println("size ** " + v + " k*  " + c + " count  " + count);
                    } else {
                        count++;
                    }
                } else {
                    count++;
                    //System.out.println("val  k*  " + c + " count  " + count);
                }
            }

        }

        System.out.println("if " + count);
    }
}
