package com.ds.practice_project.array;

public class SubArrayGivenSum {

    public static void main(String[] arg){
        int[] ar = {1,2,3,7,5};
        int sum = 12;

        arraySum(ar , sum);
    }

    private static void arraySum(int[] ar, int sum) {

        for (int i=0; i < ar.length; i++){
            int j = i+1;
            int kk = 0;
            if (j < ar.length)
             kk = ar[i] + ar[j];

            if (kk == sum){
                System.out.println("Position  "+i +"  to "+j);
                return;
            }

            for ( ;j < ar.length-1; ){
                j++;
                int ss = kk + ar[j];
                if (ss == sum){
                    System.out.println("Position  "+i +"  to "+j);
                    return;
                }
                kk = ss;
            }
        }
    }
}
