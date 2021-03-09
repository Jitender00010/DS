package com.ds.mediumQuestion;

import java.util.Arrays;

class SmallestDiff extends Print{

    public static void main(String[] args) {
        int[] ar ={-1, 5, 10, 20, 28, 3};
        int[] ar2 ={26, 134, 135, 15, 17};

        Println(smallestDifference(ar,ar2));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne =0,idxTwo =0;
        int current = Integer.MAX_VALUE;
        int small = Integer.MAX_VALUE;
        int[] res = new int[2];
        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length){
            int first = arrayOne[idxOne];
            int second = arrayTwo[idxTwo];

            if(first < second){
                current = second - first;
                idxOne++;
            }else if(second < first){
                current = first - second;
                idxTwo++;
            }else{
                return new int[]{first,second};
            }

            if(small > current){
                small = current;
                res = new int[]{first,second};
            }
        }


        return res;
    }

    public static int[] smallestDifference1(int[] arrayOne, int[] arrayTwo) {
        int val1 =0,val2=0;
        int small = Math.abs( arrayOne[0]) - Math.abs(arrayTwo[0]);
        for(int i=0; i < arrayOne.length; i++){
            for(int j=0; j < arrayTwo.length; j++){
                int v =Math.abs( arrayOne[i]) - Math.abs(arrayTwo[j]);
                if(Math.abs(small) > Math.abs(v) ){
                    small = v;
                    val1 = arrayOne[i];
                    val2 = arrayTwo[j];
                    //return new int[] {arrayOne[i],arrayTwo[j]};
                }
            }
        }
        return new int[] {val1,val2};
    }
}
