package com.ds.practice_project.sorting;

public class BubbleSort {

    public static void main(String[] arg){
        int[] ar = {4,5,6,2,3,1};

        sort(ar);
        print(ar);
    }

    public static void sort(int[] ar) {
        boolean ischeck;

        for (int i = 0; i < ar.length - 1; i++) {

            ischeck = false;

            for (int j = 0; j < ar.length - 1 - i; j++) {

                if (ar[j] > ar[j + 1]) {
                    swap(j, j + 1, ar);
                    ischeck = true;
                }
            }

            if (!ischeck) {
                break;
            }
        }
    }

    private static void swap(int a,int b,int[] ar){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }
}
