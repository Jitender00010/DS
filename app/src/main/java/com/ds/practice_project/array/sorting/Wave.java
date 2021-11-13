package com.ds.practice_project.array.sorting;

public class Wave {

    public static void main(String[] arg){
        int[] ar = {20,10,3,6,7,5,1};

        qSort(ar,0,ar.length-1);

        print(ar);

        swap(ar);

        System.out.println();
        print(ar);
    }

    private static void swap(int[] ar) {

            for (int j =0 ; j < ar.length-1; j = j+2){
                if (ar[j] < ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
    }


    private static void qSort(int[] ar,int start,int end) {

        if (start < end) {
            int pivat = pivat(ar, start, end);

            qSort(ar, start, pivat - 1);
            qSort(ar, pivat + 1, end);
        }
    }

    private static int pivat(int[] ar, int start, int end) {

        int piv = ar[end];
        int pivIndex = -1;

        for (int i = 0; i < end; i++){
            if (ar[i] < piv){
                pivIndex++;
                int temp = ar[pivIndex];
                ar[pivIndex] = ar[i];
                ar[i] = temp;
            }
        }

        pivIndex++;
        int temp = ar[pivIndex];
        ar[pivIndex] = ar[end];
        ar[end] = temp;

        return pivIndex;
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }
}
