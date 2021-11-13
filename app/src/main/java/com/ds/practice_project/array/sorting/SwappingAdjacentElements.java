package com.ds.practice_project.array.sorting;

import java.util.Scanner;

public class SwappingAdjacentElements {

    public static void main(String[] arg){
        int[] ar = {1, 2, 5, 3, 4, 6}; // 1 5 2 3 4 6
        int[] ar1 = {0,1,1,1,0};

        int[] aaa = getArray1();
        int[] bar = bolleanAry(aaa);
        swappingElements(aaa,bar);
        print(aaa);
    }

    public static int[] getArray1(){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();

        int[] ar = new int[a];
        for (int i=0 ; i< a; i++){
            int c = sc.nextInt();
            ar[i] = c;

            System.out.print("ar "+ar[i]);
        }

        System.out.println();

        return ar;
    }

    public static int[] bolleanAry(int[] ar){
        Scanner sc= new Scanner(System.in);

        int[] ar1 = new int[ar.length-1];
        for (int i=0 ; i< ar1.length; i++){
            int c = sc.nextInt();
            ar1[i] = c;
            System.out.print("b "+ar1[i]);
        }
        System.out.println();
        return ar1;
    }

    private static void swappingElements(int[] ar, int[] ar1) {

        boolean chcek = true;
        for (int i=0 ; i < ar.length-1; i++){

            if (ar1[i] == 1){

                if (ar[i] > ar[i+1]) {
                    int temp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i  < ar.length-1; i++){
            if (ar[i] > ar[i+1]){
                chcek = false;
                break;
            }
        }

        System.out.println("cheeck "+chcek);
    }

    public static void print(int[] ar){
        for (int a : ar){
            System.out.print(" "+a);
        }
    }
}
