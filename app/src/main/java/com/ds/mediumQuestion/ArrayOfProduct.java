package com.ds.mediumQuestion;

class ArrayOfProduct extends Print {

    public static void main(String[] args) {
        int[] ar = {5,1,4,2};

        Println(arrayOfProducts(ar));
    }

    public static int[] arrayOfProducts(int[] array) {

        int[] ar = new int[array.length];

        for (int i =0; i<array.length; i++){
            int res = 1;
            for (int j = 0; j < array.length; j++){
                if ( i != j){
                    res = res * array[j];
                }
            }

            ar[i] = res;
        }
        return ar;
    }
}
