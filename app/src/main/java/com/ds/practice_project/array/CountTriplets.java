package com.ds.practice_project.array;

public class CountTriplets {

    public static void main(String[] arg){
        int[] ar = {1,2,3,4,5};  // 1 1 1 1 1 1 1 1 1
        //     9 7 4 3 2 6
        //   9 7 4    3 2 6
        //   9 7  4    3  2 6
        //   9  7  4    3  2  6
        //   7 9  4    2 3  6
        //   4 7 9     2 3  6
        //   2 3 4     6 7  9

        countTriple(ar);
    }

    private static void countTriple(int[] ar) {

        int count = 0;
        for (int i = 0; i< ar.length; i++){
            for (int j=i+1; j < ar.length; j++){
                int c = ar[i] + ar[j];

                for (int a: ar){
                    if (c == a){
                        count++;
                    }
                }
            }
        }

        System.out.println("result "+count);
    }
}
