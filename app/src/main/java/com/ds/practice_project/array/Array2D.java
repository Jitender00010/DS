package com.ds.practice_project.array;

import java.util.Scanner;

public class Array2D {


    public static void main(String[] arg){

        int[][] ar = new int[2][2];
        int[][] arr = { { 1, 2 },
                        { 3, 4 } };
        //
        // 10 11

        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i < ar.length; i++){
            for (int j = 0 ; j< ar.length; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        for (int i =0 ; i < ar.length; i++){
            for (int j = 0 ; j< ar.length; j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }
}
