package com.ds.practice_project.array;

import java.util.TreeMap;

public class RepetedNoInAry {

    public static void main(String[] arg){
        int[] ar = {1,2,3,1,2,1,2,2,2,4,5,3};
              //    1 1 1 2 2 2 2 2 3 3 4 5

        arySort(ar);
    }

    private static void arySort(int[] ar) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int a : ar){

            if (treeMap.containsKey(a)){
                int no = treeMap.get(a);
                no++;
                treeMap.put(a,no);
            }else {
                treeMap.put(a,1);
            }
        }


        int[] ar2 = new int[ar.length];
        for (int i=0 ; i< ar.length; i++){
            int count = 0;
            for (int j=0; j < ar.length; j++){
                if (ar[i] == ar[j]){
                    count++;
                    ar2[i] = count;
                }
            }
        }
        for (int i=0 ; i< ar2.length; i++){
            int count = 0;
            for (int j=0; j < ar2.length-1; j++){
                if (ar2[j]< ar2[j+1]){
                 //   swap(j,j+1,ar);
                   // swap(j,j+1,ar2);
                }
            }
        }


        for (int c : ar2){
            System.out.print("  "+c);
        }
    }

    private static void swap(int a,int b,int[] ar){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
