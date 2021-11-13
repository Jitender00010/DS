package com.ds.practice_project.StringPracktis;

public class Strstr {

    public static void main(String[] args) {

        String str1 = "gfrereksfr";
        String str2 = "fr";

        System.out.println(checkStrstr(str1,str2));
    }

    private static int checkStrstr(String str1, String str2) {

        int c = 0;
        for (int i = 0 ; i < str1.length(); i = i+1){

            c = i+str2.length();
            if (str1.length() >= c) {
                String s = str1.substring(i, c);
                if (s.equals(str2)) {
                    return i;
                }
            }
        }

        return -1;
    }


    static boolean match(String str, String str2){

        for (int i=0,j=0; i < str.length() && str2.length()> j; i++,j++){
            if (str.charAt(i) != str2.charAt(j))
                return false;
        }

        return true;
    }
}
