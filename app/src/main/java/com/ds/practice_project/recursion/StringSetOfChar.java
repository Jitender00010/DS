package com.ds.practice_project.recursion;

public class StringSetOfChar {

    public static void SetOfChar(char[] ar,int i,int k,char[] d,int c){

        if (c == k)
            return;

        d[c] = ar[i];

        if (ar.length-1 >c)
            i++;

        SetOfChar(ar,i,k,d,c+1);


        print(d,k);

    }

    static void printAllKLength(char[] set, int k)
    {
        int n = set.length;
        printAllKLengthRec(set, "", n, k,0);
    }

    // The main recursive method
// to print all possible
// strings of length k
    static void printAllKLengthRec(char[] set, String prefix, int n, int k, int i)
    {
        // Base case: k is 0,
        // print prefix
        if (k == 0)
        {
            System.out.println(prefix);
            return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
       /* for (int i = 0; i < n; ++i)
        {*/
            // Next character of input added
            String newPrefix = prefix + set[i];
            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix, n, k - 1,i+1);
       // }
    }

    public static void print(char[] str,int k){
        for (int i=0; i<str.length; i++){
            System.out.print(str[i]);
        }
        System.out.println();

    }

    public static void main(String[] ar){
        System.out.println("First Test");
        char[] set1 = {'a', 'b'};
        int k = 3;
        String cat = "cat";
        //printAllKLength(cat.toCharArray(), k);

        fun("cat".toCharArray(),2,2);

    }

    private static void fun(char[] c , int i, int p){

        if (i == 0)
            return;

        char temp = c[i];
        c[i] = c[p];
        c[p] = temp;
        fun(c,i-1,i);

        print(c,0);
    }
}
