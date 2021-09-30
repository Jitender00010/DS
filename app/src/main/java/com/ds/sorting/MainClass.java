package com.ds.sorting;

class MainClass {

    public static void print(int[] arrays){

        for (int a : arrays){
            System.out.print(a+" ");
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
