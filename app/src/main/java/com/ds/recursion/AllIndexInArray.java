package com.ds.recursion;

/**
 * In this video, we discuss the solution where we are required to find all the indices of
 * occurrence for a given element and print it using a separate array using a recursive logic.
 * To watch the problem statement, click here: https://youtu.be/TYIZmI5FesU*/

class AllIndexInArray {
    public static void main(String[] args) {
        int[] ar = {10,20,30,40,20,55,40,60,20,3};

        for (int a : displayAr(ar,0,20,0)) {
            System.out.println(a);
        }

    }

    private static int[] displayAr1(int[] ar, int i, int x, int[] resAr, int rIdx) {
        if (ar.length == i){
            return null;
        }

        int[] mVal = displayAr1(ar,i +1,x,resAr,rIdx + 1);

        if (ar[i] == x){
            resAr[rIdx] = i;
            return resAr;
        }else {
            return mVal;
        }
    }

    private static int[] displayAr(int[] ar, int i, int x, int fsf) {
        if (ar.length == i) {
            return new int[fsf];
        }

        if (ar[i] == x) {
            int[] d = displayAr(ar, i + 1, x, fsf + 1);
            d[fsf] = i;
            return d;
        } else {
            int[] d = displayAr(ar, i + 1, x, fsf);
            return d;
        }

    }
}
