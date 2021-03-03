package com.ds.easyQuestion;


import java.util.Arrays;

class SortedSquaredArray {

    public static void main(String[] args) {
        int[] ar = {-7, -3, 1, 9, 22, 30};

        System.out.println(sortedSquaredArray(ar));
    }

    public int[] sortedSquaredArray2(int[] array) {
        int[] ar = new int[array.length];

        for(int i=0,j =0 ; i < array.length; i++){
            int v = array[i];
            ar[i] = v * v;

        }

        Arrays.sort(ar);
        return ar;
    }

    public int[] sortedSquaredArray1(int[] array) { // MYCODE
        int[] ar = new int[array.length];

        for(int i=0,j =0 ; i < array.length; i++){

            if(array[i] >= 0){
                if( i == j){
                    int s = getSquare(array[i]);
                    ar[i] = s;

                }else{
                    for(int k =0; k < i; k++){
                        ar[k] = array[i];
                    }
                }
                j++;
            }
        }
        return ar;
    }

    public int getSquare(int val){
        int s = val * val;
        return s;
    }

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.  1 3 5 7
        int[] ar = new int[array.length];
        int smallIdx =0;
        int largeIdx = array.length-1;
        for(int i = array.length -1; i >= 0; i--){
            int small = array[smallIdx];
            int large = array[largeIdx];
            if(Math.abs(small) > Math.abs(large)){
                ar[i] = small * small;
                smallIdx++;
            }else{
                ar[i] = large * large;
                largeIdx--;
            }
        }
        return ar;
    }
}
