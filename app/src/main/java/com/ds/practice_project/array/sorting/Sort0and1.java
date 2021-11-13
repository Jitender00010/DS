package com.ds.practice_project.array.sorting;

public class Sort0and1 {

    public static void main(String[] arg){
        int[] ar = {1,0,1,0,1,0,1,0,1,0,1,0,1,1}; //0,0,0,0,0,0,0,0,1,1,1,1,1,1

        //arSort(ar);
        segregate0and1(ar,ar.length);

    }

    private static void arSort(int[] ar) {
        int zeroCount = 0;
        for (int i=0; i < ar.length; i++){
            if (ar[i] == 0){
                zeroCount++;
            }
        }

        for (int i=0; i < ar.length; i++){
            if (zeroCount > i){
                ar[i] = 0;
            }else {
                ar[i] = 1;
            }
        }
    }

    static void segregate0and1(int arr[], int n) {
        int type0 = 0;
        int type1 = n - 1;

        while (type0 < type1) {
            if (arr[type0] == 1) {

                // swap type0 and type1
                arr[type0] = arr[type0] + arr[type1];
                arr[type1] = arr[type0]-arr[type1];
                arr[type0] = arr[type0]-arr[type1];
                type1--;
            } else {
                type0++;
            }
        }
    }
}
