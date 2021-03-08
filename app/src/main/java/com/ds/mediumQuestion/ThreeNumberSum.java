package com.ds.mediumQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeNumberSum {

 public static void main(String[] args) {

  int[] ar = { 12, 3, 1, 2, -6, 5, -8, 6};
  System.out.println(threeNumberSum(ar,0));
 }

 public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
  // Write your code here.
  Arrays.sort(array);
  ArrayList<Integer[]> finalList = new ArrayList<Integer[]>();

  for(int i=0; i< array.length-2; i++){
   int left = i + 1;
   int right =  array.length - 1;
   while(left < right){
    int cs = array[i] + array[left] +array[right];
    if(cs == targetSum){
     Integer[] newTri = {array[i],array[left],array[right]};
     finalList.add(newTri);
     left++;
     right--;
    }else if(cs < targetSum){
     left++;
    }else if(cs > targetSum){
     right--;
    }
   }


  }
  return finalList;
 }
}
