package com.ds.practice_project.StringPracktis;

public class FormPalandrom {

    public static void main(String[] arg){
        String str = "geeks";   // abc  cba  sgkeekgs

        //makePalandrom(str);
        System.out.println(findMinInsertions(str.toCharArray(),
                0, str.length()-1));

    }

    private static void makePalandrom(String str) {
        int count = 0;

        int j = str.length()-1;
        String res = "";

        if (str.charAt(0) != str.charAt(j)){
            int stl = str.length()-1;

            for (int i = 0; i<stl; i++) {
                res = str.charAt(i) + res;
                count++;
            }
        }

        for (int i=0; i<str.length() ; i++,j--){
            if (str.charAt(i) != str.charAt(j)){

                int stl = str.length()-2;
            }
        }

        str = str+res;

        System.out.println(str+" count  "+count);
    }

    static int findMinInsertions(char str[], int l,
                                 int h)
    {
        // Base Cases   geeks
        if (l > h) return Integer.MAX_VALUE;
        if (l == h) return 0;
        if (l == h - 1) return (str[l] == str[h])? 0 : 1;

        // Check if the first and last characters
        // are same. On the basis of the  comparison
        // result, decide which subrpoblem(s) to call
        return (str[l] == str[h])? findMinInsertions(str, l + 1, h - 1):
                (Integer.min(findMinInsertions(str, l, h - 1),
                        findMinInsertions(str, l + 1, h)) + 1);
    }

    static int findMinInsertionsDP(char str[], int n)
    {
        // Create a table of size n*n. table[i][j]
        // will store minumum number of insertions
        // needed to convert str[i..j] to a palindrome.
        int table[][] = new int[n][n];
        int l, h, gap;

        // Fill the table
        for (gap = 1; gap < n; ++gap)
            for (l = 0, h = gap; h < n; ++l, ++h)
                table[l][h] = (str[l] == str[h])?
                        table[l+1][h-1] :
                        (Integer.min(table[l][h-1],
                                table[l+1][h]) + 1);

        // Return minimum number of insertions
        // for str[0..n-1]
        return table[0][n-1];
    }


}
