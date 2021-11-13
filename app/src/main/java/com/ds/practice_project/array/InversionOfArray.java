package com.ds.practice_project.array;

import java.util.Scanner;

public class InversionOfArray {
    // 2 4 1 3 5

    public static void main(String[] args) {

        //int[] ar = {7,5,4,3,2};  //5,7,1,3,2
       // System.out.println(InverseCount(ar));

        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int input = scan.nextInt();

            int[] ar = new int[input];
            int i = 0;
            while (input-- > 0) {
                ar[i] = scan.nextInt();
                i++;
            }
            System.out.println(InverseCount(ar));
        }

    }

    private static int InverseCount(int[] ar) {
        int count = 0;
        for (int i=0 ; i < ar.length; i++){
            for (int j= i+1; j < ar.length; j++){
                if (ar[i] > ar[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
