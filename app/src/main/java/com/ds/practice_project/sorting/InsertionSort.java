package com.ds.practice_project.sorting;

public class InsertionSort {

    public static void main(String[] arg){
        int[] ar1 = {6,4,5,2,3,1};  // 4 5 6 6
        int[] ar = {10,4,5,7,8,1};  // 4 5 2 6 3 1  2 6 5 4 3 1

        sort(ar);
        print(ar);
    }

    private static void sort(int[] ar) {
        for (int i=1; i < ar.length; i++){
            int j = i -1;
            int key = ar[i];

            while (j >= 0 && ar[j] > key ){
                int cc = ar[j];
                int dd = key;

                swap(j,j+1,ar);
                j--;
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
