package com.ds.practice_project.StringPracktis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherLockString {

    public static void main(String[] arg) {
        String str = "aaaabbbbc";     //aabbc    ABCABCABC  aaaabbbbccc

        //a  2
        //b  4              1  2
        //c  4
        //D  4


        System.out.println(ValidString1(str.toCharArray()));
    }

    private static String ValidString(char[] str) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map1 = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(String.valueOf(str[i]))) {
                int v = map.get(String.valueOf(str[i]));
                if (v != 0)
                    v--;
                else
                    v++;
                map.put(String.valueOf(str[i]), v);

                int v1 = map.get(String.valueOf(str[i]));

                map1.put(String.valueOf(str[i]), v1++);
            } else {
                map.put(String.valueOf(str[i]), 1);
                map1.put(String.valueOf(str[i]), 1);
            }
        }

        for (String k : map1.keySet()) {

        }

        int count = 0;
        for (String k : map.keySet()) {
            int v = map.get(k);
            if (v == 1) {
                count++;
            }
        }

        if (count == map.size())
            return "yes";
        else if (count >= 2)
            return "no";

        return "YES";

    }

    private static String ValidString1(char[] str) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            if (map.containsKey(String.valueOf(str[i]))) {
                int v = map.get(String.valueOf(str[i]));
                v++;
                map.put(String.valueOf(str[i]), v);
            } else {
                map.put(String.valueOf(str[i]), 1);
            }
        }

        Set<Integer> set = new HashSet<>();

        for (String k : map.keySet()) {
            int v = map.get(k);
            set.add(v);
        }

        System.out.println("set " + set.size());
        if (set.size() > 2) {
            return "* NO";
        }

        if (set.size() == 1) {
            return "YES";
        }

        int pos = 0;
        int a = 0, b = 0;
        for (int i : set) {
            if (pos == 0) {
                a = i;
            }
            if (pos == 1) {
                b = i;
            }
            pos++;
        }

        if (a == 1 && b == 1)
            return "YES";

        if (a > 2 && b > 2)
            return "NO";

        int c = a - b;

        if (Math.abs(c) == 1)
            return "& YES";

        return "# NO";

    }
}
