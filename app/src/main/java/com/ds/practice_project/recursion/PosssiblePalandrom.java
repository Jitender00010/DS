package com.ds.practice_project.recursion;

public class PosssiblePalandrom {

    public static void Palandrom(String str){

        if (checkPalan(str,0,str.length()-1)){
            System.out.print("palandrom ");
        }else {
            System.out.print("not palandrom ");
        }

    }

    private static Boolean checkPalan(String str, int i, int len) {
/*
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return checkPalan(str.substring(1,str.length()-1), i + 1, len - 1);
        }*/

        if (i >= len) {
            return true;
        }

        if (str.charAt(i) == str.charAt(len)) {
           return checkPalan(str, i + 1, len - 1);
        }

        return false;
    }

    public static void main(String[] ar){

        Palandrom("madem");

       // System.out.println(reverse("jittu"));
    }

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
