package com.ds.practice_project.array;

public class ElementLeftSmallRightGreat {

    public static void main(String[] args) {
        int[] ar = {4, 3, 2, 7, 8, 9};  // 5
       // int[] ar = {4 ,2 ,5 ,7};  // 5
        //int[] ar = {11 ,9 ,12};  // 5
       // int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        //11 9 12    -1
        //4 3 2 7 8 9     7
       // Input : arr[] = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
        //Output : 6


       // findMiddel(ar);

        System.out.println("Index of the element is " +
                findElement(ar, ar.length));

       // System.out.println(findElement(ar,ar.length));
     }

    private static void findMiddel(int[] ar) {


        int val = 0;
        for (int i=1; i< ar.length; i++){
            boolean left = true;
            boolean right = true;

            for (int l =0; i >l; l++){

                if (ar[l] > ar[i]) {
                    left = false;
                    break;
                }
            }

            for (int r = i; ar.length > r; r++){
                if (ar[i] > ar[r]){
                    right = false;
                    break;
                }
            }

            if (left && right && i != ar.length-1) {
                val = ar[i];

                break;
            }


        }

        if (val !=0 )
        System.out.println(val);
        else System.out.println("-1");
    }

    static int findElement(int[] arr, int n)
    {
        // leftMax[i] stores maximum of arr[0..i-1]
        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;

        // Fill leftMax[]1..n-1]
        for (int i = 1; i < n; i++)
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);

        // Initialize minimum from right
        int rightMin = Integer.MAX_VALUE;

        // Traverse array from right
        for (int i = n - 1; i >= 0; i--)
        {
            // Check if we found a required element
            if (leftMax[i] < arr[i] && rightMin > arr[i])
                return i;

            // Update right minimum
            rightMin = Math.min(rightMin, arr[i]);
        }

        // If there was no element matching criteria
        return -1;


    }
}
