package com.ds.array;


class PrintAllDistingElement {

    public static void main(String[] args) {
        int[] ar = {1,1,1,1,1,2,2,2,2,4,6,6,6,6,6,6,6,6};

        printDisting(ar);
    }

    private static void printDisting(int[] ar){
        int max = 1,count =1,val =0;
        for (int i=0; i < ar.length-1; i++){

            if (ar[i] == ar[i+1]){
                count++;
            }else {
                count = 1;
            }

            if (max < count ){
                max = count;
                val = ar[i];
            }
        }

        System.out.println(val +"   "+max);
    }
}
