package com.ds.practice_project.StringPracktis;

public class PermutaionString {

    public static void main(String[] args) {

        String a = "ABCD";

        permutation(a,0,a.length()-1);
    }

    private static void permutation(String a, int s, int e) {

        if (s == e)
            System.out.print(a+" ");
        else
        for (int i=s; i <= e; i++){

            a = swap(a,s,i);
            permutation(a,s+1,e);
            a = swap(a,s,i);
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
