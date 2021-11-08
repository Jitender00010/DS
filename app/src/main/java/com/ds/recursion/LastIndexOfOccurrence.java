package com.ds.recursion;

class LastIndexOfOccurrence {

    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40, 20, 55, 30, 60};

        System.out.println(displayAr1(ar, 0, 10));
    }

    private static int displayAr1(int[] ar, int i, int x) {
        if (ar.length == i)
            return -1;

        int lioa = displayAr1(ar, i+1,x);

        if (lioa == -1){

            if (ar[i] == x){

                return i;
            }else {
                return -1;
            }
        }else {
            return lioa;
        }

    }
}

