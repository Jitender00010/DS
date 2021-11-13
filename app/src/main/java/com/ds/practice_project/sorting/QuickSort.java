package com.ds.practice_project.sorting;

public class QuickSort {

    public static void main(String[] arg){
        int[] ar = {7,4,8,5,10,11,6};
        // int[]   {4,5,6,7,10,11,8};
        // int[]   {4,5,8,9,2,3,6};
        // int[]   {4,5,2,9,8,3,6};
        // int[]   {4,5,2,3,8,9,6};

        sort(ar,0,ar.length-1);

        print(ar);
    }

    public static void sort(int[] ar,int start,int end){

        if (start < end){
            int pivat = pivatNo(ar,start,end);

            sort(ar,start,pivat-1);
            sort(ar,pivat+1,end);
        }
    }

    private static int pivatNo(int[] ar, int start, int end) {
        //    7,4,8,5,10,11,6
        int pivat = ar[end];

        int i = start - 1;

        for (int j=start; j < end; j++){
            if (ar[j] < pivat){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }

        i++;
        int temp = ar[end];
        ar[end] = ar[i];
        ar[i] = temp;
        return i;
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }
}
