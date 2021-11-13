package com.ds.practice_project.array;
public class StockBuySell {

    public static void main(String[] args) {
        int[] ar = {2,7,2,5,9,89};

        //int[] ar = {23,13,25,29,33,19,34,45,65,67};

        profit(ar);
        //886 2777 6915 7793 8335 5386 492 6649 1421 2362 27 8690 59 7763 3926 540 3426 9172 5736 5211 5368 2567 6429 5782 1530 2862 5123 4067 3135 3929 9802 4022 3058 3069 8167 1393 8456 5011 8042 6229 7373 4421 4919 3784 8537 5198 4324 8315 4370 6413 3526 6091 8980 9956 1873 6862 9170 6996 7281 2305 925 7084 6327 336 6505 846 1729 1313 5857 6124 3895 9582 545 8814 3367 5434 364 4043 3750 1087 6808 7276 7178 5788

        /*Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        while (testCase-- > 0) {
            int input = scan.nextInt();

            int[] ar = new int[input];
            int i = 0;
            while (input-- > 0) {
                ar[i++] = scan.nextInt();
            }

            profit(ar);
        }*/
    }

    private static void profit(int[] ar) {
        int[] leftAr = new int[ar.length/2];
        int[] rightAr = new int[ar.length/2];

        int maxProfit = 0;
        boolean check = true;
        int j =0;
        int k=0;

        for (int i=0; i < ar.length-1; i++) {

            maxProfit = ar[i+1] - ar[i];

            if (check){
                if (maxProfit > 0){
                    leftAr[j++] = i;
                    check = false;
                }
            }else {

                if (maxProfit < 0){
                    rightAr[k++] = i;
                    check = true;
                }
            }

            if (i+1 == ar.length-1){
                if (maxProfit>0){
                    rightAr[k++] = i+1;
                }
            }
        }

        boolean result = true;

        for (int l=0,m=0; leftAr.length >l && rightAr.length >m; l++,m++ ){
            if (leftAr[l] == rightAr[m]) {
                result = false;
                return;
            }
            System.out.print("("+leftAr[l]+" "+rightAr[m]+")");
        }

        if (result)
        System.out.print("No Profit");

    }

   /* private static void profit(int[] ar) {

        int maxProfit = ar[0];
        int minProfit = ar[0];
        int maxPos = 0;
        int minPos = 0;

        for (int i=0; i < ar.length; i++) {

            if (ar[i] > maxProfit) {
                maxProfit = ar[i];
                maxPos = i;
            } else {
                if (maxPos != 0)
                    System.out.print("(" + minPos + " " + maxPos + ")");
                maxProfit = ar[i];
                minPos = i;
            }
        }

        System.out.print("("+minPos+" "+maxPos +")");
    }*/
}
