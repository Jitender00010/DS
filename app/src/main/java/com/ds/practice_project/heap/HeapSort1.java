package com.ds.practice_project.heap;

public class HeapSort1 {

    public static void main(String[] arg){

        int arr[] = {12, 11, 13, 5, 6, 7};

        heapsort(arr);
        printArray(arr);
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void heapsort(int[] ar) {

        for (int i = ar.length / 2 - 1; i >= 0; i--) {

            hepify(ar, i, ar.length);
        }

        for (int i = ar.length - 1; i > 0; i--) {

            int temp = ar[0];
            ar[0] = ar[i];
            ar[i] = temp;

            hepify(ar,0,i);
        }
    }

    public static void hepify(int[] ar, int i, int len) {

        int current = i;

        if (leftNode(i) < len && ar[current] < ar[leftNode(i)]){
            current = leftNode(i);
        }

        if (rightNode(i) < len && ar[current] < ar[rightNode(i)]){
            current = rightNode(i);
        }

        if (i != current){

            int temp = ar[i];
            ar[i] = ar[current];
            ar[current] = temp;

            hepify(ar,current,len);
        }
    }

    static int leftNode(int i) {   //                  48
        int re = i * 2 + 1;        //         44              43
        if (re > 0)                // 55            44     47       33
            return re;
        else
            return 0;
    }

    static int rightNode(int i) {
        int re = i * 2 + 2;
        if (re > 0)
            return re;
        else
            return 0;
    }
}
