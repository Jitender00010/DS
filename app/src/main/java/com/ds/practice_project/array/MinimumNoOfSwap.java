package com.ds.practice_project.array;

public class MinimumNoOfSwap {

    public static void main(String[] arg){
       int[] a = {2,3,4,1,5};
      // int[] a = {7,1,3,2,4,5,6};
       //int[] a = {4 ,3 ,1 ,2};
       //         2  3 1 4
       //         2  1 3 4

      System.out.println( minimumSwaps(a));
    }

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            while(arr[i] != i+1) {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
                count ++;
            }
        }
        return count;
    }
}
