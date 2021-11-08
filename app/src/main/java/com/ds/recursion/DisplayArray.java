package com.ds.recursion;

class DisplayArray {

    public static void main(String[] args) {

        int[] ar = {10,20,30,40};

        displayAr(ar,0);
    }

    private static void displayAr(int[] ar, int i) {

        if (ar.length == i){
            return;
        }

        System.out.println(ar[i]);
        int r = i + 1;
        displayAr(ar,r);
       // System.out.println(ar[i]);  for revers
    }


}
