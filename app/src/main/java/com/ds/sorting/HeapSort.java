package com.ds.sorting;

class HeapSort extends MainClass {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        sort(arr);

        print(arr);
    }

    private static void sort(int[] ar){

        int len = ar.length;

        for (int i = (len/2) -1; i <=0; i--)
            heapify(ar,len,i);

        for (int i = len-1; i >0; i--){
            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;

            heapify(ar,i,0);
        }
    }

    private static void heapify(int[] ar,int len,int i){
        int larger = i;

        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < len && ar[l] > ar[larger]){
            larger = l;
        }

        if (r < len && ar[r] > ar[larger]){
            larger = r;
        }

        if (larger != i){
            swap(ar,larger,i);

            heapify(ar, len, larger);
        }
    }
}
