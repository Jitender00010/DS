package com.ds.practice_project.array;

import java.util.Scanner;

public class zigzagFashion {

    public static void main(String[] args) {
        //4 3 7 8 6 2 1       3 7 4 8 2 6 1

        //1 2 3 4 6 7 8
        //1 3 2 6 4 8 7

       // int[] ar = {4,3,7,8,6,2,1};
        //int[] ar = {1, 4, 3 ,2};

        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int input = scan.nextInt();

            int[] ar = new int[input];
            int i = 0;
            while (input-- > 0) {
                ar[i++] = scan.nextInt();
            }

            zigzag(ar);
        }



       // print(ar);
    }

    private static void print(int[] ar) {
        for (int a : ar){
            System.out.print(a+" ");
        }
    }

    private static void zigzag(int[] ar) {  //4 3 7 8 6 2 1       3 7 4 8 2 6 1

        for (int i =0; i < ar.length-1; i = i+2){

            if (i == 0 && ar[i] > ar[i+1]){
                swap(ar,i,i+1);
            }
            else if (i != 0 && ar[i-1] < ar[i] && ar[i] < ar[i+1] ){
                swap(ar,i-1,i);
            }else if (i != 0 && ar[i-1] > ar[i] && ar[i] > ar[i+1]){
                swap(ar,i,i+1);
            }

        }

        for (int a : ar){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    private static void swap(int[] ar, int i, int i1) {
        int temp = ar[i];
        ar[i] = ar[i1];
        ar[i1] = temp;
    }
}
