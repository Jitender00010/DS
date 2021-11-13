package com.ds.practice_project.array;

public class ChocoletDistribution {

    //3 4 1 9 56 7 9 12    5
    //1 3 4 7 9 9 12 56

    //2 3 4 7 9 12 56
    //
    public static void main(String[] args) {

       // int[] ar = {3 ,4 ,1 ,9 ,56 ,7 ,9 ,12 };
        int[] ar = {17 ,83, 59, 25, 38, 63, 25, 1 ,37 };
        // 1 17 25 25 37 38 59 63 83

        int k=9;


        /* Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int input = scan.nextInt();

            int[] ar = new int[input];
            int i = 0;
            while (input-- > 0) {
                ar[i++] = scan.nextInt();
            }

            int k = scan.nextInt();
            chocolateDis(ar,k);
        }*/

        chocolateDis(ar,k);
    }

    private static void chocolateDis(int[] ar, int k) {

        sort(ar);
        int min = 0;

        k--;
        boolean check = true;

        for (int i = 0; i < ar.length && ar.length > k; k++,i++){

            int res = ar[k] - ar[i];

            if (check){
                min = res;
                check = false;
            }

            if (res < min){
                min = res;
            }
        }

        System.out.println(min);
    }

    private static void sort(int[] ar) {

        for (int i=0; i< ar.length;  i++){
            for (int j = i+1; j < ar.length; j++){
                if (ar[i] > ar[j]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
}
