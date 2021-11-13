package com.ds.practice_project.StringPracktis;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctCharacters {

    public static void main(String[] arg){
      //  String str = "geeksforgeeks"; //abababcdefababcdab  6  1,-2,1,2,3
        //                                  geeksforgeeks   7

        //longDistance(str);

        String str = "abcdefa";
        System.out.println(getMinInsert(str,0,str.length()-1));
    }

    private static void longDistance(String str) {

        //abcabfg
        int a = 0,b=0,max =0;
        Set<Character> set = new HashSet<>();

        for (int i=0; i<str.length(); i++){
            a++;
            if (!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                max = Integer.max(max,a-b);
            }else {
                b++;
            }

        }

        System.out.println(max);
    }


    private static int getMinInsert(String str, int l, int h){
        //abcda        abcdcba       output 2 cb
        //abcdefa      abcdefedcba          4 edcb

        if (l > h) return Integer.MAX_VALUE;
        if (l == h) return 0;
        if (l == h-1) return (str.charAt(l) == str.charAt(h)) ? 0 : 1;

        if (str.charAt(l) == str.charAt(h))
            return getMinInsert(str,l+1,h-1);
        else
            return Integer.min(getMinInsert(str,l+1,h)
                    ,getMinInsert(str,l,h-1))+1;
    }
}
