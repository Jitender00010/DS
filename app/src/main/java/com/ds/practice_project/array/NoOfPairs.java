package com.ds.practice_project.array;

import java.util.Scanner;

public class NoOfPairs{

    public static void main(String[] arg){
        // 2 1 6
        // 1 5

        int[] ar1 = {2,1,6};
        int[] ar2 = {1,5};


        Scanner scanner = new Scanner(System.in);
        int  input = scanner.nextInt();
        while (input-- > 0){
            int value = scanner.nextInt();
            int[] a = new int[value];
            int i = 0;

            while (value-- >0){
                a[i] = scanner.nextInt();
                i++;
            }

            int value2 = scanner.nextInt();
            int[] a2 = new int[value2];
            int j = 0;

            while (value2-- >0){
                a2[j] = scanner.nextInt();
                j++;
            }

            findNoOfPair(a,a2);
            System.out.println();
        }
    }

    private static void findNoOfPair(int[] ar1, int[] ar2) {
        int count = 0;
        System.out.println(ar1.length+" dd   "+ar2.length);
        for (int i = 0 ; i < ar1.length; i++){
            //count = 0;
            for (int j = 0 ; j < ar2.length; j++){

                if (noPower(ar1[i],ar2[j]) > noPower(ar2[j],ar1[i])){
                 count++;
                }
            }
        }

        System.out.println(" count "+count);
    }

    public static int noPower(int a, int b){
        //2  * 3
        int res = a;

        for (int i = 1; i < b; i++){

            res = res * a;
        }

        return res;

    }
}
