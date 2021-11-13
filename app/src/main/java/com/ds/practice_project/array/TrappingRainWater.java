package com.ds.practice_project.array;

public class TrappingRainWater {

    public static void main(String[] args) {

        // int[] ar = {3,0,0,2,0,4};
         int[] ar = {6,9,9};
        System.out.println( trap1(ar));
    }

    public static int trap(int[] height) {
        int maxSeenSoFar = 0;//helper variable to formulate max height to the right array
        int[] maxSeenRight = new int[height.length];//array that contains max height seen to the right                                         of tower i
        int maxSeenLeft = 0;//optimized to have a variable that contains max height of a tower traversing from the left.
        int rainWater = 0;//variable to store total units of rain water.

        for (int i = height.length - 1; i >= 0; i--) {//**traversing from Right to Left
            if (height[i] > maxSeenSoFar) {//if curr height is greater than maxSeenSoFar
                maxSeenSoFar = height[i];//then update maxSeenSoFar with curr height
                maxSeenRight[i] = maxSeenSoFar;//and enter that maxSeenSoFar in maxSeenRight array
            } else {//otherwise update maxSeenSoFar into maxSeenRight                             array
                maxSeenRight[i] = maxSeenSoFar;
            }
        }



        for (int i = 0; i < height.length; i++) { //**traversing from Left to Right
            rainWater = rainWater + Integer.max((Integer.min(maxSeenLeft, maxSeenRight[i]) - height[i]), 0);//0 to take care of case where there is no taller tower to its left & right

            if (height[i] > maxSeenLeft) {//if curr height > maxSeenLeft
                maxSeenLeft = height[i];//update maxSeenLeft with curr height.
            }

        }
        return rainWater;//return total units of rain water.
        //Big O T O(n) (actually n + n but equals n) S O(n)
    }

    public static int trap1(int[] ar){
        int l = 0, r = ar.length-1;

        int leftMax = 0, rightMax = 0;
        int totalWater = 0;

        while (l < r){
            if (ar[l] < ar[r]){
                if (ar[l] >= leftMax){
                    leftMax = ar[l];
                }else {
                    totalWater = (leftMax - ar[l]) + totalWater;

                }
                l++;

            }else {
                if (ar[r] >= rightMax){
                   rightMax = ar[r];
                }else {
                  totalWater =  (rightMax-ar[r]) + totalWater;
                }
                r--;
            }
        }

        return totalWater;
    }
}
