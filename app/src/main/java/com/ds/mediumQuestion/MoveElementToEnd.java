package com.ds.mediumQuestion;

import java.util.ArrayList;
import java.util.List;

class MoveElementToEnd extends Print{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);

    // 3, 1, 2, 4, 5
        int move = 2;

        PrintList(moveElementToEnd(list,move));
    }

    public static List<Integer> moveElementToEnd1(List<Integer> array, int toMove) {
        // 2, 1, 2, 2, 2, 3, 4, 2  l =0 r = 0
        // 4, 1, 3, 2, 2, 2, 2, 2
        if (!array.contains(toMove))
            return array;

        int r = 0;

        for (int i=0; i<array.size(); i++){
           if (array.get(i) != toMove){
                int temp = array.get(i);
                int seocnd = array.get(r);
                array.set(i,seocnd);
                array.set(r,temp);

                r++;
            }
        }

        return array;
    }


    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // 2, 1, 2, 2, 2, 3, 4, 2
        int l=0,r = array.size() -1;
        while(l < r){
            while(l < r && array.get(r) == toMove) r--;
            if(array.get(l) == toMove){
                int temp = array.get(r);
                array.set(r,array.get(l));
                array.set(l,temp);
            }

            l++;
        }
        return array;
    }
}
