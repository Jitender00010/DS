package com.ds.practice_project.array;

public class MissingNo {

    public static void main(String[] arg){
        int[] ar = {10,2,9,4,6,7,8,3,1}; // 10 9 4 1 5 2 3 8 7
       //int[] ar = {-1,-2,9,4,6,7,8,3,1,10}; // 10 9 4 1 5 2 3 8 7

        findNo(ar);
    }

    private static void findNo1(int[] ar) {

        for (int i=0 ; i< ar.length; i++){

            int temp = ar[i];
            ar[temp-1] = -1;
        }

        System.out.println();

    }


    private static void findNo(int[] ar) {
       int[] ar2 = new int[ar.length+1];
       for (int i=0 ; i < ar.length; i++){
           ar2[ar[i] -1] = ar[i];
       }

       for (int i = 1; i<ar2.length; i++){
           if (ar2[i] == 0){
               int c = i+1;
               System.out.println("Missing no "+c);
               break;
           }
       }

       System.out.println();
    }
}
