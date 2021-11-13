package com.ds.practice_project.array;

public class KadaneAlgo {

    public static void main(String[] arg){

        int[] ar = {-2,-3,4,-1,-2,1,5,-3};
        //int[] ar = {1,2,3,-2,5};

        kadanealgo2(ar);
    }

    private static void kadanealgo(int[] ar) {

        int sum = ar[0];

        for (int i=0; i < ar.length-1; i++){

            int j = i+1;
            sum = sum + ar[j];
        }

        System.out.println(sum);
    }

    private static void kadanealgo2(int[] ar) {
        int leftno = 0,sum = 0;
        for (int i=0; i < ar.length; i++){
            sum = sum + ar[i];
            if (sum < 0){
                sum = 0;
            }
            else if (leftno < sum){
                leftno = sum;
            }
        }

        System.out.println(leftno);
    }

    private static void kadanealgo1(int[] a) {

        int size = a.length;
        int max_so_far = 0, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0)
                max_ending_here = 0;

        /* Do not compare for all
           elements. Compare only
           when max_ending_here > 0 */
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;

        }

        System.out.println(max_so_far);
    }
}
