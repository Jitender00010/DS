package com.ds.practice_project.array;

public class PrintAlldistinElement {

    public static void main(String[] arg){

        int[] ar = {1,1,1,1,1,1,1,1,2,2,2,2,4,6,6};

    //    printElement(ar);

        duplecateNoInAr(ar);
    }

    private static void duplecateNoInAr(int[] ar) {
        int count = 0;
        int temp =0;
        int max = 0;
        int val = 0;
        for (int i=0 ; i < ar.length-1; i++) {

            count++;

            if (ar[i] != ar[i + 1]) {
                System.out.println(ar[i] + " count "+count);
                temp = count;
                count = 0;
            }

            // System.out.println(i+"   "+ar.length);
            if (i+1 == ar.length-1) {
                count++;
                temp = count;
                System.out.println(ar[ar.length-1] + " count " + count);
            }

            if (max < temp){
                max = temp;
                val = ar[i];
            }
        }

        System.out.println(val + " max "+max);
    }

    private static void printElement(int[] ar) {
        for (int i=0 ; i < ar.length-1; i++) {

            if (ar[i] != ar[i + 1]) {
                System.out.print(ar[i] + " ");
            }

           // System.out.println(i+"   "+ar.length);
            if (i+1 == ar.length-1)
                System.out.print(ar[ar.length-1] + " ");
        }
    }


}
