package com.ds.recursion;

class MaxInArray {

    public static void main(String[] args) {
        int[] ar = {50,70,130,40};

      System.out.println(displayAr1(ar,0));
    }

    private static int displayAr1(int[] ar, int i) {

        if (ar.length-1 == i){
            return ar[i];
        }

        int miar = displayAr1(ar, i+ 1);
        if (miar > ar[i]){
            return miar;
        }else {
            return ar[i];
        }
    }

    private static int displayAr(int[] ar, int i,int max) {

        if (ar.length == i){
            return max;
        }

        if (ar[i] > max){
            max = ar[i];
        }
       return displayAr(ar,i + 1,max);
    }
}
