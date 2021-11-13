package com.ds.practice_project.array;

public class EquiliburmPoint {

    public static void main(String[] arg){
        //int[] ar = {43, 34, 2, 8, 17, 5, 11, 8}; // 1,4,3,1,1,1,2
      //  int[] ar = {-80,-20,30,-20,-20,-20,-40}; // 1,4,3,1,1,1,2
        //int[] ar = {7,1,2,2,2,1}; // 7,1,2,2,2,1,  12,3,2,3,4,10

        int [] ar = {5 ,1 ,4, 1};
        equilPoint(ar);
    }

    private static void equilPoint(int[] ar){

        int sum = 0;
        for (int i=0; i < ar.length; i++){  // 2 3 5 4 1
            sum = ar[i] + sum;
        }

        int first = 0;
        int last = 0;

        for (int i=0; i < ar.length; i++){

            sum = sum - ar[i];

            if (first == sum){
                System.out.println(i);
                return;
            }

            first = first+ar[i];

        }

    }

    private static void equiliburmSum1(int[] ar) {

        int pre = 0;
        int next = 0;
        for (int i = 0; i < ar.length; i++) {
            pre = pre + ar[i];
            next = 0;
            for (int j = i + 1; j < ar.length - 1; j++) {
                next = next + ar[j + 1];
            }

            if (pre == next) {
                int c = i + 1;
                System.out.println("index  " + c+" val "+ar[c]);
                return;
            }
        }
    }

    private static void equiliburmSum2(int[] ar) {
            int mid = ar.length/2;
            int pre = 0;
            int next = 0;
            int finalIndex = 0;
            for (int k=0; k < ar.length ; k++ ){

                if (k < mid){
                    pre = pre + ar[k];
                }else if (k == mid){
                    finalIndex = k;
                } else {
                    next = next + ar[k];
                }
            }

            for (int l = 0 ; l < ar.length; l++){
                if (pre == next){
                    System.out.println("index "+mid+" val "+ar[mid]+" mid "+mid);
                    return;
                }

                if (pre  < 0 && next < 0){
                    if (pre > next){

                        next = next - ar[mid + 1];

                        pre = ar[mid + 1] + pre;

                        mid = mid + 1;

                    } else {

                                pre = pre - ar[mid - 1];

                                next = ar[mid + 1] + next;
                                mid = mid - 1;

                    }
                }else {
                    if (pre > next) {
                        if (mid > 0)
                            pre = pre - ar[mid - 1];

                        next = ar[mid + 1] + next;
                        mid = mid - 1;
                    } else {
                        if (ar.length > mid)
                            next = next - ar[mid + 1];

                        pre = ar[mid + 1] + pre;

                        mid = mid + 1;
                    }
                }
            }

            System.out.println("-1");

    }


}
