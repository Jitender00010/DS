package com.ds.practice_project.array;

public class LargestNumberFormed {
    public static void main(String[] args) {
        int[] ar = {3,30,34,5,9};

        findLargest(ar);
    }

    private static void findLargest(int[] ar) {
      //  String[] strAr = new String[ar.length];
        String[] strAr = new String[ar.length];


        int i = 0;
        for (int s : ar){
            strAr[i] = String.valueOf(s);
            i++;
        }

        char c = '9';

        int a = (int)c;

        char c1 = '4';

        int b = (int)c1;
        System.out.print(a+"  b  "+b);


        for (int k=0; k<strAr.length; k++){

            for (int l = k+1; l < strAr.length-1; l++)
            if (strAr[k].compareTo(strAr[l])>0){

                String temp = strAr[k];
                strAr[k] = strAr[l];
                strAr[l] = temp;
            }
        }

        /*Arrays.sort(strAr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });*/

        StringBuilder sb = new StringBuilder();

        for (String s : strAr){
            sb.append(s);
        }

      //  System.out.print(sb);
    }


}
