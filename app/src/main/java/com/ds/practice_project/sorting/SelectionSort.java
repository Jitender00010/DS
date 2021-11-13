package com.ds.practice_project.sorting;

public class SelectionSort {

    public static void main(String[] arg){
        int[] ar = {4,5,6,2,3,1};
        sort(ar);
        print(ar);
    }

    private static void sort(int[] ar){

        for (int i=0; i < ar.length-1; i++){

            for (int j = i+1; j <ar.length; j++){

                if (ar[i] > ar[j]){
                    swap(i,j,ar);
                }
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
