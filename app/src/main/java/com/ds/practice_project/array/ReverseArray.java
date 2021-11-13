package com.ds.practice_project.array;

public class ReverseArray {

    public static void main(String[] arg){

        int[] ar = {3,2,1};
        // 2 1 6
        // 1 5

        reverseArray(ar);
        printar(ar);
    }

    private static void printar(int[] ar) {
        for (int a : ar){
            System.out.print(" "+a);
        }
    }

    private static void reverseArray(int[] ar) {

        int i=0; int j= ar.length-1;
        while (i < j){
            int temp = ar[j];
            ar[j] = ar[i];
            ar[i] = temp;
            i++;
            j--;
        }
    }
}
