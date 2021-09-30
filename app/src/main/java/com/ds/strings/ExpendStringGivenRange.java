package com.ds.strings;

/*Suppose we have given a string in which some ranges as specified and we have to place the numbers
which is between the given range in the specified place as provided and depicted in the illustration below as follows for a better understanding.

Illustration:

Input  : string x = "1-5, 8, 11-14, 18, 20, 26-29"
Output : string y = "1, 2, 3, 4, 5, 8, 11, 12,
                    13, 14, 18, 20, 26, 27, 28, 29"
                   */


class ExpendStringGivenRange {

    public static void main(String[] args) {
        String x = "1-5, 8, 11-14, 18, 20, 26-29";

        printGivenRange(x);
    }

    private static void printGivenRange(String x) {
        String[] ar = x.split(",");
        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0; i < ar.length; i++){
            String[] ar2 = ar[i].split("-");
            if (ar2.length == 2){
                int sec = Integer.parseInt(ar2[1].trim());
                int j = Integer.parseInt(ar2[0].trim());
               for ( ; j <= sec; j++){
                   stringBuffer.append(j+", ");
               }
            }else {
                stringBuffer.append(ar[i].trim()+", ");
            }
        }

        System.out.println(stringBuffer);
    }
}
