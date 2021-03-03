package com.ds.easyQuestion;

class TowNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) { // My Code
        for(int i=0; i< array.length-1; i++){
            int fNum = array[i];
            for(int j=i+1; j<array.length; j++){
                int lNum = array[j];
                if(fNum + lNum == targetSum){
                    return  new int[] {fNum, lNum};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) { // test

        int[] ar = {1,3,5};
        System.out.println(twoNumberSum(ar,3));
    }
}
