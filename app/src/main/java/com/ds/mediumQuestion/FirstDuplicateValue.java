package com.ds.mediumQuestion;

import java.util.HashMap;
import java.util.Map;

class FirstDuplicateValue extends Print{

    public static void main(String[] args) {
        int[] ar = {6, 15, 7, 10, 11, 14, 8,2,3,10, 1, 10, 1, 2, 11, 1, 6, 8};

        System.out.println(firstDuplicateValue1(ar));
        Println(ar);
    }

    public static int firstDuplicateValue(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i < array.length; i++){
            if(map.containsKey(array[i])){
                return array[i];
            }else {
                map.put(array[i],1);
            }
        }
        return -1;
    }

    public static int firstDuplicateValue1(int[] array) {
       for (int i : array){

           int absVal = Math.abs(i);
           if (array[absVal - 1] < 0)
               return absVal;

           array[absVal -1 ] *= -1;
       }
        return -1;
    }
}
