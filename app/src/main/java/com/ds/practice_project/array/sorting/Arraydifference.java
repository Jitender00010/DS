package com.ds.practice_project.array.sorting;
public class Arraydifference {

    public static void main(String[] arg){
        int[] ar = {10, 5, 3, 9, 2};
        //t[] ar = {3, 2, 4, 2, 5};   5 10 3 9 2

        int x = 7;

        difference(ar,x);
    }

    private static void difference(int[] ar, int x) {
        int[] ar1 = new int[ar.length];

        int i = 0;
        for (int a : ar){
            int c = x - a;
            ar1[i] = Math.abs(c);
            i++;
        }

        insertSort(ar,ar1);

        print(ar);
    }

    private static void insertSort(int[] ar, int[] ar1) {
        for (int i=1; i < ar1.length; i++){

            int j = i -1;
            int key = ar1[i];

            while (j >= 0 && ar1[j] > key){
                swap(j+1,j,ar1);
                swap(j+1,j,ar);
                j--;
            }

            /*for (int j = 0 ; j <ar1.length-1; j++){
                if (ar1[j] > ar1[j+1]){
                    swap(j,j+1,ar1);
                    swap(j,j+1,ar);
                }
            }*/
        }
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }

    private static void swap(int a,int b,int[] ar){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
