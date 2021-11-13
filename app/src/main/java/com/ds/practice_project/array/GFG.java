package com.ds.practice_project.array;

import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        //code

        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        // int[] ar = null;
        while (testCase-- > 0) {
            int input = scan.nextInt();

            int[] ar = new int[input];
            int i = 0;
            while (input-- > 0) {
                ar[i] = scan.nextInt();
                i++;
            }

            int d = scan.nextInt();

            //arrayRotation(ar, d);
            rotatRecu(ar, d);
        // -1 -1  6  1  9  3 2 -1  4 -1
        // -1  1  2  3  4 -1 6 -1 -1  9

        }

        int[] re = {-1, -1 , 6 , 1  ,9  ,3 ,2 ,-1 , 4, -1};
        rearrangeArray(re);
    }

    public static void rotatRecu(int[] ar,int d){
        int c = ar.length-d;

        rotate(ar,0,d-1);
        rotate(ar,d,ar.length-1);
        rotate(ar,0,ar.length-1);

        for (int v : ar) {
            System.out.print(" " + v);
        }
    }

    public static void arrayRotation(int[] ar, int d) {
        // 1 2 3 4 5 .  2
        int[] ar2 = new int[ar.length];
        int k = d;
        int c = 0;
        int ll = ar.length - d;
        for (int i = 0; i < ar.length; i++) {

            if (i < ll) {
                ar2[i] = ar[k];
                k++;
            } else {

                ar2[i] = ar[c];
                c++;
            }
        }

        for (int v : ar2) {
            System.out.print(" " + v);
        }
    }

    public static void rotate(int[] ar, int s, int e) {

        while (s < e) {
            int temp = ar[s];
            ar[s] = ar[e];
            ar[e] = temp;

            s++;
            e--;
        }
    }


    public static void rearrangeArray(int[] ar){
        // -1 -1  6  1  9  3    2 -1  4 -1
        // -1  1  2  3  4 -1    6 -1 -1  9
        // -1  1  2  3  4 -1   -6 -1 -1  9

        for (int i=0; i < ar.length; i++){
            if (ar[i] != -1){
                //res[ar[i]] = ar[i];
                int val = ar[i];

                int temp = ar[val];
                ar[val]  = ar[i];
                ar[i] = temp;
            }
        }

        int c = 0;
        for (int a : ar){
            if (a == 0){
                ar[c] = -1;
            }
            c++;
        }

        for (int a : ar){
            System.out.print(" "+a);
        }
    }

  /*  public static void rearrangeArray(int[] ar){
        // -1 -1  6  1  9  3    2 -1  4 -1
        // -1  1  2  3  4 -1    6 -1 -1  9
        // -1  1  2  3  4 -1   -6 -1 -1  9

        int[] res = new int[ar.length];
        for (int i=0; i < ar.length; i++){
            if (ar[i] != -1){
                res[ar[i]] = ar[i];
            }*//*else{
                if (res[i] <= 0)
                res[i] = -1;
            }*//*
        }

        int c = 0;
        for (int a : res){
            if (a == 0){
                res[c] = -1;
            }
            c++;
        }

        for (int a : res){
            System.out.print(" "+a);
        }
    }*/
}