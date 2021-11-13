package com.ds.practice_project.array.sorting;

public class Alternative {

    public static void main(String[] arg){
        int[] ar = {7, 1, 2, 3, 4, 5, 6};
       //int[] ar = {1, 2, 3, 4, 5, 6, 7};

        sort(ar);

        print(ar);
    }

    private static void sort(int[] ar) {

        for (int i=0 ; i < ar.length; i++){
            for (int j = i+1; j < ar.length; j++) {
                if (i % 2 == 0) {
                    if (ar[i] < ar[j]){
                        int temp = ar[j];
                        ar[j]  = ar[i];
                        ar[i] = temp;
                    }
                } else {
                    if (ar[i] > ar[j]){
                        int temp = ar[i];
                        ar[i]  = ar[j];
                        ar[j] = temp;
                    }
                }
            }
        }
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }
}
