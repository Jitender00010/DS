package com.ds.practice_project.array;

import java.util.Arrays;

public class InversionArray {

   static int count = 0;
    public static void main(String[] arg) {
        // 00 01    2 4 1 3 5

        int[] ar = {1, 20, 6, 4, 5};

       // bubbleSort(ar);
        ;
        System.out.println(mergeSort(ar,0,ar.length-1));
        print(ar);
    }

    private static int mergeSort(int[] ar,int start, int end) {

        int count = 0;
        if (start < end){
            int mid = (start + end)/2;

           count += mergeSort(ar,start,mid);
           count +=  mergeSort(ar,mid+1,end);

          count += mergeArry(ar,mid,start,end);
        }

        return count;
    }

    private static int mergeArry(int[] ar, int mid, int start, int end) {

        int firstLen = (mid - start)+1;
        int lastLen = end - mid;

        int[] ar1 = new int[firstLen];
        int[] ar2 = new int[lastLen];

        int ss = start;
        int mm = mid+1;

        for (int i = 0; i < firstLen; i++){
            ar1[i] = ar[ss];
            ss++;
        }

        for (int i = 0; i < lastLen; i++){
            ar2[i] = ar[mm];
            mm++;
        }


        int i = 0,j = 0,k = start,swap =0;
        while ( i < firstLen && lastLen > j){
            if (ar1[i] <= ar2[j] ){
                ar[k] = ar1[i];
                i++;
                k++;
                count++;
            }else {
                ar[k] = ar2[j];
                j++;
                k++;

                swap += (mid + 1) - (ss - i);
            }
        }

        while ( i < firstLen){
            ar[k] = ar1[i];
            i++;
            k++;
        }
        while ( j < lastLen){
            ar[k] = ar2[j];
            j++;
            k++;
        }

        return swap;
    }


    private static void bubbleSort(int[] ar) {

        int count = 0;
        for (int i = 0 ; i < ar.length; i++){

            for (int j =0 ; j <ar.length-1; j++){
                if (ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;

                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }

    }

    private static int mergeAndCount(int[] arr, int l, int m, int r)
    {

        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {  //1, 20, 6, 4, 5
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }

        // Fill from the rest of the left subarray
        while (i < left.length)
            arr[k++] = left[i++];

        // Fill from the rest of the right subarray
        while (j < right.length)
            arr[k++] = right[j++];

        return swaps;
    }

    // Merge sort function
    private static int mergeSortAndCount(int[] arr, int l, int r)
    {

        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            count += mergeSortAndCount(arr, l, m);

            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }
}
