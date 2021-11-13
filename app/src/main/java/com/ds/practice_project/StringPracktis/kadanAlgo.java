package com.ds.practice_project.StringPracktis;

public class kadanAlgo {

    public static void main(String[] arg){

        int[] ar = {-2,-3,4,-1,-2,1,5,-3};
        maxSum(ar);
    }

    private static void maxSum(int[] ar) {
        int mSum = ar[0];
        int count = ar[0];

        for (int i=1; i<ar.length; i++){

            mSum = mSum + ar[i];

            if (ar[i] > mSum ){
                mSum = ar[i];
            }

            if (mSum > count )
                count = mSum;
        }

        System.out.println(count);
    }
}



/*package whatever //do not write package name here */


/*
class GFG {
    public static void main (String[] args) {
        //code
        //int[] arS = null;
        Scanner sc = new Scanner(System.in);
        int noOfInput = sc.nextInt();

        int[] arIn = new int[noOfInput];
        System.out.println(noOfInput);

        for(int a : arIn){
            int arSi = sc.nextInt();
            System.out.println(arSi);

            int[] arS = new int[arSi];

            for(int i=0 ; i<arS.length; i++){
                arS[i] = sc.nextInt();
                System.out.print(arS[i]+" ");
            }
            System.out.println();

            int mSum = arS[0];
            int count = arS[0];


            for (int i=1; i< arS.length; i++){

                mSum = mSum + arS[i];

                if (arS[i] > mSum ){
                    mSum = arS[i];
                }

                if (mSum > count )
                    count = mSum;
            }

            System.out.println(count);

        }
    }
}
*/
