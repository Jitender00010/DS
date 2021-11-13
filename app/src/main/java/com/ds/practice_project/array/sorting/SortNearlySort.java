package com.ds.practice_project.array.sorting;

public class SortNearlySort {

    public static void main(String[] arg){
        int[] ar= {6, 5, 3, 2, 8, 10, 9};
        //int[] ar= {10, 9, 8, 7, 4, 70, 60, 50};
        int k = 3;

        //bubbleSort(ar,k);

        //insertionSort(ar,k);

        mergeSort(ar,0,ar.length-1);
        print(ar);
    }

    private static void bubbleSort(int[] ar, int k) {

        for (int i = 0 ; i < ar.length; i++){
            for (int j = 0 ; j < k; j++){
                if (ar[j] > ar[j+1]){
                    swap(j,j+1,ar);
                }
            }
        }
    }

    private static void insertionSort(int[] ar, int k){

        for (int i = ar.length - k; i < ar.length; i++){

            int j = i-1;
            int key = ar[i];

            if (j >=0 && ar[j] > key){
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

    private static void mergeSort(int[] ar,int start,int end){
        if (start < end){

            int mid = (start + end)/2;

            mergeSort(ar,start,mid);
            mergeSort(ar,mid+1,end);
            merge(ar,start,end,mid);
        }
    }
    // 7 5 4 1 9 10
    private static void merge(int[] ar,int start, int end,int mid){
        int llen =  mid - start + 1;
        int rlen = end - mid;

        int ll = start;
        int[] lar = new int[llen];
        for (int i = 0 ; i < llen; i++){
            lar[i] = ar[ll];

            ll++;
        }

        int[] rar = new int[rlen];

        int k = mid + 1;
        for (int i = 0; i< rlen; i++){
            rar[i] = ar[k];
            k++;
        }

        int i =0,j=0;
        int f = start;

        while (i < llen && j < rlen){

            if (lar[i] < rar[j]){
                ar[f] = lar[i];
                i++;
            }else{
                ar[f] = rar[j];
                j++;
            }
            f++;
        }

        while (i < llen){
            ar[f] = lar[i];
            i++;
            f++;
        }
        while (j < rlen){
            ar[f] = rar[j];
            j++;
            f++;
        }
    }



}
