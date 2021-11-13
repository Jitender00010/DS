package com.ds.practice_project.StringPracktis;

import java.math.BigDecimal;
import java.util.Scanner;

public class AtoiString {

    public static void main(String[] arg){
       // String str = "2e102225";
        String str = "123e";
        int[] ar = null;
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int input = scan.nextInt();

            ar = new int[input];
            int i =0;
            while (input-- > 0) {
                ar[i] = scan.nextInt();
                i++;
            }
        }

        for (int c : ar) {
            checkNo1(""+c);
        }
    }

    private static void checkNo(String str) {

        try{
            if (str.contains("."))
                Float.parseFloat(str);
            else
            new BigDecimal(str);
            System.out.println(str);
        }catch (NumberFormatException e){
            System.out.println("-1");
        }
    }

    private static void checkNo1(String str) {
        int res = 0;
        try{

            for (int i=0; i<str.length(); i++){

                res = (res *10)+str.charAt(i) - '0';
            }
        }catch (NumberFormatException e){
            System.out.println("-1");
        }

        System.out.println(res);
    }
}
