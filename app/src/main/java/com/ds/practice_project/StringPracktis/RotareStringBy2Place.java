package com.ds.practice_project.StringPracktis;

public class RotareStringBy2Place {

    public static void main(String[] arg){
        String str = "amazon";  //qpaaaaadaaaaadprq
        String str1 = "azonam";  //qpaaaaadaaaaadprq
        //            mazona
        //            azonam
        // removeAdjacent(str.toCharArray());      amazon
        //                                        azonam

        //   geeksforgeeks
        //   geeksgeeksfor


     //   reverseStr(str1.toCharArray(),str);

        System.out.println(isRotated(str,str1));
    }

    private static void reverseStr(char[] str, String str1) {

        boolean check = false;
        for (int i=0 ; i < 2; i++){
            for (int j = str.length-1; j > 0; j--){
                char c = str[j];
                str[j] = str[j-1];
                str[j-1] = c;
            }


            if (str1.equalsIgnoreCase(getFinalStr(str))){
                //System.out.println("Match");
                check = true;
                break;
            }

           // break;
        }

        if (check){
            System.out.println("Match");
        }else {
            System.out.println("do not Match");
        }

    }

    private static String getFinalStr(char[] str){
        String res = "";
        for (char c : str){
            res +=c;
        }

        return res;
    }

    static boolean isRotated(String str1, String str2)
    {
        if (str1.length() != str2.length())  // iiiv   vii
            return false;

        String clock_rot = "";
        String anticlock_rot = "";
        int len = str2.length();

        // Initialize string as anti-clockwise rotation
        anticlock_rot = anticlock_rot +
                str2.substring(len-2, len) +
                str2.substring(0, len-2) ;

        // Initialize string as clock wise rotation
        clock_rot = clock_rot +
                str2.substring(2) +
                str2.substring(0, 2) ;

        // check if any of them is equal to string1
        return (str1.equals(clock_rot) ||
                str1.equals(anticlock_rot));
    }
}
