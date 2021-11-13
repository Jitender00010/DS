package com.ds.practice_project.recursion;

public class LowerUpperCombination {

    static void print(char[] chAry){

        for (int i=0; i<chAry.length; i++){
            System.out.print(chAry[i]);
        }
    }

    static void lowUpComb(char[] chAry,int i,int len){

        if (i == len) {

            return;
        }

        chAry[i] = Character.toUpperCase(chAry[i]);

        lowUpComb(chAry,i+1,len);

        print(chAry);
        System.out.println();

        chAry[i] = Character.toLowerCase(chAry[i]);
        lowUpComb(chAry,i+1,len);

    }

    public static void main(String[] ag){

        String str = "the";

        lowUpComb(str.toCharArray(),0,str.length());
    }
}
