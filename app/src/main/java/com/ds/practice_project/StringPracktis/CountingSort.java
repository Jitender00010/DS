package com.ds.practice_project.StringPracktis;

public class CountingSort {

    public static void main(String[] arg){

        String str = "cba";
        sortString(str.toCharArray()); // abcabcabc    aaaabbcc
    }

    private static void sortString(char[] toCharArray) {
        int[] ar = new int[toCharArray.length];

        for (int i=0 ; i < toCharArray.length; i++){
            int a = (int)'a';
            int c = (int) toCharArray[i];

            int r = a-c;

            ar[Math.abs(r)] = 1;
        }


        for (int s : ar){
            System.out.print(s);
        }
    }
}
