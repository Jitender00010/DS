package com.ds.practice_project.StringPracktis;

public class ReversWordInString {

    public static void main(String arg[]){
        String srt = "pqr.mno";

        reverseString(srt);
    }

    private static void reverseString(String srt) {
        String[] strings = srt.split("\\.");
        for (int i = strings.length-1; i >=0; i--) {
            if (i == 0)
            System.out.print(strings[i]);
            else
                System.out.print(strings[i]+".");

        }
    }
}
