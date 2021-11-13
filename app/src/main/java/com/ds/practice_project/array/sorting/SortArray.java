package com.ds.practice_project.array.sorting;

public class SortArray {

    public static void main(String[] arg){
        int ar[] = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
     //   Output : 1 2 3 4 5 6 7 8 9 10

        arraySort(ar);
        print(ar);
    }

    private static void arraySort(int[] ar) {
        for (int i = 0; i < ar.length; i++){
            ar[i] = i+1;
        }
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }
}
