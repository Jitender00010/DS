package com.ds.practice_project.array;

import java.util.Scanner;

public class RearragneArray {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5};


        Scanner scanner = new Scanner(System.in);
        int  input = scanner.nextInt();
        while (input-- > 0){
            int value = scanner.nextInt();
            int[] a = new int[value];
            int i = 0;

            while (value-- >0){
                a[i] = scanner.nextInt();
            }
        }


        aragneAry(ar);



        //997 12 981 23 957 28 930 43 927 44 926 59 920 60 916 68 896 70 887 85 874 88 863 92 858 124 847 125 815 136 809 168 803 171 794 173 789 179 785 199 783 212 778 230 764 277 751 282 737 306 730 314 691 316 650 325 583 328 568 336 546 337 541 363 538 365 531 368 527 369 506 371 493 374 457 387 435 394 430 414 427 422

    }

    private static void aragneAry(int[] ar) {

        int j = ar.length -1;
        int c = 0;
        for (int i =0; i < ar.length; i++ ){
            if (i % 2 == 0){
                System.out.print(ar[j]+" ");
                j--;
            }else {
                System.out.print(ar[c]+" ");
                c++;
            }
        }
    }
}
