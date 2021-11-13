package com.ds.practice_project.array;

public class ArrayRotation {

    public static void main(String[] arg){
        int[] ar = {1,2,3,4,5,6};
        rotation2(ar,2);
        print(ar);
    }


    public static void rotation(int[] ar,int x){

        int k = x;
        int[] ar2 = new int[ar.length];

        for (int i=0; i< ar.length; i++){
            if (k == ar.length){
                k = 0;
            }
            if (x > i){
                ar2[i] = ar[k];
                k++;
            }else{
                ar2[i] = ar[k];
                k++;
            }
        }

    }

    public static void print(int[] ar){
        for (int c : ar){
            System.out.print(" "+c);
        }
    }

    public static void rotation2(int[] ar,int x){

        for (int i=0; i<x;  i++){
            rotate(ar);
        }
    }

    public static void rotate(int[] ar){
        int temp ;
        for (int i=0; i<ar.length-1; i++){
            temp = ar[i];
            ar[i] = ar[i+1];
            ar[i+1] = temp;
        }
    }

    public static void rotation3(int[] ar,int x){
        leftRotate(ar,0,x);
        leftRotate(ar,x,ar.length);
        leftRotate(ar,0,ar.length);

        print(ar);

    }

    public static void leftRotate(int[] ar,int a,int b){
        int j = b-1;

        for (int i = a; i < j; i++,j--){
            int temp;
            temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        }
    }
}
