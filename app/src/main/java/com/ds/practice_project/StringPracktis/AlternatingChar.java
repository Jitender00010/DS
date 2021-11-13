package com.ds.practice_project.StringPracktis;

public class AlternatingChar {

    public static void main(String[] arg){

        String str ="AAABBB";  // A   ABC ACB BAC BCA CAB CBA
        //                         abc    acb    bac  aca     cba   cab
                   //ABABAB           bac
                            //        cba
                   //AABAAB   ABAB    s i+1 n
                   //AAABBB   AB

       //System.out.println( findAlternating1(str.toCharArray()));
       System.out.println( alternatingCharacters(str));
    }

    private static int findAlternating1(char[] str) {

        int count = 0;
        for (int i = 0; i< str.length-1; i++){
            int j = i+1;

            String aStr = String.valueOf(str[i])+ String.valueOf(str[j]);
            String bStr = String.valueOf(str[i])+ String.valueOf(str[j]);
            if (aStr.equalsIgnoreCase("AB") || bStr.equalsIgnoreCase("BA")){

            }else {
                count++;
            }
        }

        return count;
    }

    static int alternatingCharacters(String s) {
        int min = 0;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i-1) == s.charAt(i))
                min++;
        }
        return min;
    }
}
