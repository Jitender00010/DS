package com.ds.sorting;

import java.lang.reflect.Array;

class BubbleSort {

    public static void main(String[] args) {

        int[] ar = {6,5,8,1,2,7,44};

        bubbleSort(ar,ar.length);

        print(ar);
    }

    public static void bubbleSort(int[] ar,int l){
        for (int i=1; i < l; i++){
            int k = ar[i];
            int j = i -1;

            while (j >=0 && ar[j]> k){

                ar[j+1] = ar[j];
                j--;
            }

            ar[j+1]  = k;
        }
    }

    public static void print(int[] arrays){

        for (int a : arrays){
            System.out.print(a+" ");
        }
    }
}
