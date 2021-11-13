package com.ds.practice_project.array;

public class MergeTwoArray {

    public static void main(String[] arg){

        int[] ar1 = {1,2,3,5,6,8,10};
        int[] ar2 = {4,7,9};

        mergeAry(ar1,ar2);
    }

    private static void mergeAry(int[] ar1, int[] ar2) {

        int aLength = ar1.length;
        int bLength = ar2.length;

        int[] ar = new int[aLength+bLength];
        int a = 0,b=0;
        int k = 0;


        while (a < ar1.length && b< ar2.length) {

            if (ar1[a] < ar2[b]) {
                ar[k] = ar1[a];
                a++;
            } else {
                ar[k] = ar2[b];
                b++;
            }
            k++;
        }


        while (a < ar1.length){
            ar[k] = ar1[a];
            a++;
            k++;
        }
        while (b < ar2.length){
            ar[k] = ar2[b];
            b++;
            k++;
        }


        for (int c : ar){
            System.out.print(" "+c);
        }
    }
}
