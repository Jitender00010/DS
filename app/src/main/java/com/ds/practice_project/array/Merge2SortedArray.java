package com.ds.practice_project.array;

public class Merge2SortedArray {

    public static void main(String[] age){
        // 1 5 9 10 15 20       10
        // 2 3 8 13             2   3

        // 1  2  3  5  8 9      2
        // 10 13 15 20          3  10

        int[] ar1 = {1, 5 ,9,10 ,15,20};
        int[] ar2 = {2, 3 ,8, 13};
        mergeArray(ar1,ar2);
    }

    private static void mergeArray(int[] ar1, int[] ar2) {

        for (int i =0 ; i < ar1.length; i++){
            for (int j = 0; j <ar2.length; j++){
                if (ar1[i] > ar2[j]){
                    swap(i,j,ar1,ar2);
                }
            }
        }

        for (int i =0 ; i < ar2.length; i++){
            for (int j = i+1; j <ar2.length; j++){
                if (ar2[i] > ar2[j]){
                    swap(i,j,ar2,ar2);
                }
            }
        }
        for (int i =0 ; i < ar1.length; i++){
            for (int j = i+1; j <ar1.length; j++){
                if (ar1[i] > ar1[j]){
                    swap(i,j,ar1,ar1);
                }
            }
        }

        for (int a : ar1){
            System.out.print(" "+a);
        }
        System.out.println();
        for (int a : ar2){
            System.out.print(" "+a);
        }
    }

    private static void swap(int a,int b,int[] ar1,int[] ar2){
        int temp = ar1[a];
        ar1[a] = ar2[b];
        ar2[b] = temp;
    }
}
