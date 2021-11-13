package com.ds.practice_project.StringPracktis;

public class LongestCommenPrefix {

    public static void main(String[] args) {

        String str = "odbuozifgdqiqliccbvjdvngwcgofyetdhorgyyodoztbjxfkvppqcwo";
        commonPrefix(str);


      /*  Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        System.out.println();
        // int[] ar = null;
        while (testCase-- > 0) {
            int input = scan.nextInt();
            System.out.println();

            String[] ar = new String[input];
            int i = 0;
            while (input-- > 0) {
                ar[i] = scan.next();
                System.out.print(ar[i]+" ");
                i++;
            }

            commonPrefix(ar);   1 5 3 2
                                1 2 3 4 5    1 2
        }*/
    }

    private static void commonPrefix(String ar1) {
        String[] ar = ar1.split(" ");
        if (ar.length == 1) {
            System.out.println("final  "+ar1);
            return;
        }

        String res = "-1";

        for (int i=1; i < ar.length; i++){
            if (i == 1){
                res = commonStr(ar[0],ar[1]);
            }else {
                res = commonStr(res,ar[i]);
            }
        }

        System.out.println("final  "+res);

    }


    private static String commonStr(String str, String str1){
        String res = "";

        int l=0,r=0;
        while (str.length() > l && str1.length()>r){
            if (str.charAt(l) == str1.charAt(r) ){
                res += str.charAt(l);
            }else {
                break;
            }

            l++;
            r++;
        }

        if (res.equals(""))
            return  "-1";
        return res;
    }
}
