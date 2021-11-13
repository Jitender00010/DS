package com.ds.practice_project.algoExpert;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum2Number {

    public static void main(String[] arb){

        int[] ar ={4,6};
        System.out.println("Sum = "+sum(ar,10));
    }

    private static int[] sum(int[] array,int targetSum){
        Set<Integer> set = new HashSet<>();

        for (int num : array){

            int postmath = targetSum - num;

            if (set.contains(postmath)){
                return new int[]{postmath,num};
            }else {
                set.add(num);
            }
        }
        return new int[0];
    }


    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        //Array.sort(array);
        //Array.sort(sequence);
        int count =0;
        int j =0;
        for(int i=0; i<sequence.size(); i++){
            for(; j<array.size(); j++){

                if(sequence.get(i) == array.get(j)){
                    count++;
                    j++;
                    break;
                }
            }
        }

        if(sequence.size() == count)
            return true;


        return false;
    }

    private void tes(){

    }



    class b extends Sum2Number{
    }

}
