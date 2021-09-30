package com.ds.algo;


class KadaneAlgo {


    private static void kadaneAlgo(int[] ar){

        int large = 0;
        int sum  = 0;

        for (int i : ar){
            sum = sum + i;

            if (sum < 0){
                sum = 0;
            }

            if (sum > large){
                large = sum;
            }
        }

        System.out.println("value  "+large);
    }

    public static void main(String[] args) {
       // int[] ar = {-2,-3,4,-1,-2,1,5,-3};
        int[] ar = {-3,-4,7,-3,-2,6,-8,-1,1};

        kadaneAlgo(ar);
    }
}
