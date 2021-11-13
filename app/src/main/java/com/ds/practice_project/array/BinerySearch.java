package com.ds.practice_project.array;

public class BinerySearch {

    public static void main(String[] agr){

        int[] ar = {1,18,6,20,10,12,2};
      //  int[] ar = {2,4,6,10,12,18};
      // search2(ar,ar.length/2,2);
       //search2(ar,ar.length/2,3);
       // search(ar,0,ar.length-1,3);
        //search(ar,0,ar.length-1,1);
        search2(ar,0,ar.length-1,2);
        //search2(ar,0,ar.length-1,20);
    }

    private static void search(int[] ar,int a) {
        int mid = ar.length / 2;
        int i = 0;
        boolean found = false;
        while (ar.length > i) {
            if (ar[mid] == a) {
                found = true;
                System.out.println("Item found " + ar[mid]);
                return;
            } else if (a < ar[mid]) {
                mid = mid / 2;
            } else
                mid = (mid + ar.length) / 2;

            i++;
        }
        if (!found)
            System.out.println("Item not found " + a);
    }

    private static void search2(int[] ar,int l,int h,int key){

        if (l>h){
            System.out.println("Item not found " + key);
            return;
        }
        //1,18,6,20,10,12,2
        int mid = (l+h)/2;
        if (key == ar[mid]){
            System.out.println("Item found " + ar[mid]);
            return;
        }

       if (ar[l] < ar[mid]){
            if (key >= ar[l] && key <= ar[mid]){

                search2(ar,l,mid-1,key);
            }else {
                search2(ar,mid+1,h,key);
            }
        }
/*
        if (key >= ar[mid] && key <= ar[h]){
            search2(ar,mid+1,h,key);
        }else {
            search2(ar,l,mid-1,key);
        }*/
    }
}
