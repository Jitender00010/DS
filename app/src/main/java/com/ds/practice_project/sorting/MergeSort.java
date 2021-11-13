package com.ds.practice_project.sorting;

public class MergeSort {

    public static void main(String[] arg){

        int[] ar = {3,2,5,7};
        //     9 7 4 3 2 6
        //   9 7 4    3 2 6
        //   9 7  4    3  2 6
        //   9  7  4    3  2  6
        //   7 9  4    2 3  6
        //   4 7 9     2 3  6
        //   2 3 4     6 7  9

       // merge(ar,0,ar.length/2,ar.length);

        sort(ar,0,ar.length-1);
        print(ar);
    }

    public static void sort(int ar[],int l,int r){
        if (l < r){  // 9 7 4 3 2 6
            int mid = (l+r)/2;
            sort(ar,l,mid);
            sort(ar,mid+1,r);

            merge(ar,l,mid,r);
        }
    }

    public static void merge(int[] ar,int l,int m,int r){
        int[] arLeft = new int[m - l + 1];
        int[] arRight = new int[r-m];

        int k = l;
        int ll = l;
        for (int i=0; i < arLeft.length ; i++){
            arLeft[i] = ar[ll];
            ll++;
        }

        int rr = m+1;
        for (int i=0; i < arRight.length ; i++){
            arRight[i] = ar[rr];
            rr++;
        }

        int ii=0,jj=0;
        while ( ii < arLeft.length && jj < arRight.length){
            if (arLeft[ii] <= arRight[jj]){
                ar[k] = arLeft[ii];
                ii++;
            }else {
                ar[k] = arRight[jj];
                jj++;
            }
            k++;
        }

        while (ii < arLeft.length){
            ar[k] = arLeft[ii];
            ii++;
            k++;
        }
        while (jj < arRight.length){
            ar[k] = arRight[jj];
            jj++;
            k++;
        }
    }

    public static void merge1(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }
}
