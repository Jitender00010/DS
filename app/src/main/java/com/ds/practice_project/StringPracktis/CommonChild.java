package com.ds.practice_project.StringPracktis;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.HashMap;
import java.util.Map;

public class CommonChild {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] arg){
        String str1 = "SHINCHAN";   // OUTPUT NHA   ABCDEF          HARRY  AY
        String str2 = "NOHARAAA";       //          FBDAMN     BD   SALLY

        // -1 10

        String X = "SHINCHAN";
        String Y = "NOHARAAA";

        int m = X.length();
        int n = Y.length();

        System.out.println("Length of Longest Common Substring is "
                + LCSubStr(X.toCharArray(), Y.toCharArray(), m, n));

    // System.out.println( getChildCount(str1.toCharArray(),str2.toCharArray()));
    }

    private static int getChildCount(char[] str1, char[] str2) {
        int count =0;
        int itemPos = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length; i++) {
            for (int j =0; j < str2.length; j++){
                if (str1[i] == str2[j]){
                    itemPos = i;
                }
            }
        }


        for (int i=0; i < str2.length; i++){

            if (map.containsKey(String.valueOf(str2[i]))){
                int v = map.get(String.valueOf(str2[i]));

                if (v >0){
                    v--;
                    count++;
                    map.put(String.valueOf(str2[i]), v);
                }
            }
        }

        return count;
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    static int LCSubStr(char X[], char Y[], int m, int n)
    {
        // Create a table to store lengths of longest common suffixes of
        // substrings. Note that LCSuff[i][j] contains length of longest
        // common suffix of X[0..i-1] and Y[0..j-1]. The first row and
        // first column entries have no logical meaning, they are used only
        // for simplicity of program
        int LCStuff[][] = new int[m + 1][n + 1];
        int result = 0;  // To store length of the longest common substring

        // Following steps build LCSuff[m+1][n+1] in bottom up fashion
        for (int i = 0; i <= m; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                if (i == 0 || j == 0)
                    LCStuff[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                {
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result, LCStuff[i][j]);
                }
                else
                    LCStuff[i][j] = 0;
            }
        }
        return result;
    }
}
