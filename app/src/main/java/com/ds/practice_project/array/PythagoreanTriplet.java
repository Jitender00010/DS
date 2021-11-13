package com.ds.practice_project.array;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        int[] ar = {3,2,4,5,6};  //  9 4 16 25 36 49
                                //   4 9 16 25 36 49 64 81 100

        triplet(ar);
    }

    private static void triplet(int[] ar) {


        for (int i=0; i < ar.length; i++){
            for (int j =i+1; j < ar.length-1; j++){
                for (int k = 0; k < ar.length; k++) {
                    if ((sqrt(ar[i]) + sqrt(ar[j])) == sqrt(ar[k])) {

                        System.out.println("yes");
                        break;
                    }
                }

            }
        }
    }

    private static int sqrt(int a){
        return  a*a;
    }

}
