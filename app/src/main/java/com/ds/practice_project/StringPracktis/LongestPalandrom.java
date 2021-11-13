package com.ds.practice_project.StringPracktis;

public class LongestPalandrom {


    public static void main(String[] args) {
        String str = "aaabbaaa";

        findLongestPalandrom(str);
    }

    private static void findLongestPalandrom(String str) {

        int left =0,right =0;
        for (int i= 1; i < str.length()-1; i++){

            if (str.charAt(i-1) == str.charAt(i+1)){
                int j = i-1,k = i+1;
                while (j >= 0 && str.length() > k && str.charAt(j) == str.charAt(k)){
                    left = j;
                    right = k;
                    j--;
                    k++;
                }

                if (str.length() == k)
                    break;
            }
        }

        System.out.print(str.substring(left,right+1));
    }
}
