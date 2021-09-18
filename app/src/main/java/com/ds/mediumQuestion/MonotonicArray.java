package com.ds.mediumQuestion;


class MonotonicArray extends Print {

    public static void main(String[] args) {

        int[] ar ={1, 1, 1, 2, 3, 4, 1};
        System.out.println(isMonotonic(ar));
    }

    public static boolean isMonotonic(int[] ar) {
        int l = 0,r = ar.length-1;
        if(ar.length == 0)
            return true;

        if(ar[l] > ar[r]){
            for(int i = 0; i < ar.length-1; i++){
                if(ar[i] < ar[i+1])
                    return false;
            }
        }else{
            for(int i = 0;i < ar.length-1; i++){
                if(ar[i] > ar[i+1])
                    return false;
            }
        }

        return true;
    }
}
