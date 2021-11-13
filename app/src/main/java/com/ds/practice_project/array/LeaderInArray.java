package com.ds.practice_project.array;

import java.util.Stack;

public class LeaderInArray {

    public static void main(String[] args) {
       // int[] ar = {16,17,4,3,5,2};
        int[] ar = {7 ,4 ,5 ,7 ,3};
        // 1 2 3 4 0
        // 7 4 5 7 3
        LeaderAry(ar);

       /* Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input-- > 0){
            int val = scanner.nextInt();
            int[] ar1 = new int[val];
            int c =0;

            while (val-- >0){
                ar1[c++] = scanner.nextInt();
            }
            LeaderAry(ar1);
        }*/
    }

   /* private static void LeaderAry(int[] ar) {
        boolean check = true;
        for (int i=0 ; i < ar.length; i++){
            check = true;
            for (int j = i+1; j < ar.length; j++){
                if (ar[i] < ar[j])
                    check = false;
                break;
            }

            if (check)
            System.out.print(ar[i]+" ");
        }

        System.out.println();
    }*/

    private static void LeaderAry(int[] ar) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i= ar.length-1 ; i >= 0; i--){

            if (ar[i] >= max) {
               // System.out.print(ar[i] + " ");
                max = ar[i];
                stack.push(ar[i]);
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
