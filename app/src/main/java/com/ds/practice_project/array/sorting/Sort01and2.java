package com.ds.practice_project.array.sorting;

import java.util.Scanner;

public class Sort01and2 {

    public static void main(String[] args) {

        int[] ar = {1,2,0,0,1,2,2,1};
      //  sortAry(ar);


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input-- >0){
            int val  = scanner.nextInt();;
            int[] inputAry = new int[val];
            int k = 0;
            while (val-- > 0){
                inputAry[k++] = scanner.nextInt();
            }

            sortAry(inputAry);
        }
    }

    private static void sortAry(int[] ar) {

        int zero = -1;  // 2
        int one = -1;   // 3
        int two = -1;  // 2

        for (int i=0; i < ar.length; i++){
            if (ar[i] == 0)
                zero++;
            else if (ar[i] == 1)
                one++;
            else
                two++;
        }

        int cc = 0;
        int dd = 0;

        for (int i=0; i < ar.length; i++){
            if (zero >= cc) {
                ar[i] = 0;
                cc++;
            }
            else if (one >= dd) {
                ar[i] = 1;
                dd++;
            }else {
                ar[i] = 2;
            }
        }

        for (int c : ar){
            System.out.print(c+" ");
        }

        System.out.println();
    }
}
