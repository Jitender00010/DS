package com.ds.recursion;

class FirstIndexOfOccurrence {

    public static void main(String[] args) {
        int[] ar = {10,20,30,40,20,55,40,60};

       System.out.println(displayAr1(ar,0,20));
    }

    private static int displayAr(int[] ar, int i,int val) {

        if (i < ar.length && ar[i] == val){
            return val;
        }

        if (ar.length == i){
            return -1;
        }

        return displayAr(ar,i +1,val);
    }

    private static int displayAr1(int[] ar, int i,int val) {
        if (ar.length == i){
            return -1;
        }


        if(val == ar[i]){
            return i;
        }else {
            int foa = displayAr1(ar, i + 1, val);
            return foa;
        }

        /* int foa =  displayAr1(ar,i +1,val);
        *   if(val == ar[i]){
            return i;
        }else {
            return foa;
        }*/
    }
}
