package com.ds.sorting;

class QuickSort extends MainClass {

    public static void main(String[] args) {
        int[] ar = {6,5,8,1,2,7,44};

        quickSort(ar,0,ar.length-1);
        print(ar);
    }

    private static void quickSort(int[] ar, int l, int r){

        if (l < r){
         int p =   pivate(ar,l,r);

         quickSort(ar,l,p-1);
         quickSort(ar,p+1,r);
        }

    }

    private static int pivate(int[] ar, int l, int r){
        int key = ar[r];

        int i = l - 1;
        for (int j =l; j < r; j++){

            if (key > ar[j]){
                i++;
                swap(ar,i,j);
            }
        }
        swap(ar,i+1,r);

        return (i+1);
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
