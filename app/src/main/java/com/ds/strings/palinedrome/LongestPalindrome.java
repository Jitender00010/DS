package com.ds.strings.palinedrome;
/**
 * Given a string, find the longest substring which is a palindrome.
 * For Example:
 *
 *
 * Input: Given string :"forgeeksskeegfor",
 * Output: "geeksskeeg".
 *
 * Input: Given string :"Geeks",
 * Output: "ee".*/

class LongestPalindrome {

    public static void main(String[] args) {
        String str = "aaabaaac";
        longestPalSubstr(str);
    }


    private static void check(String str) {
        int max =0;
        String s = "";
        for (int i=0; i < str.length(); i++){
            for (int j= i+1; j <= str.length(); j++){

                boolean check = isPalinedrome(str.substring(i,j));
                if (check){
                    int count = str.substring(i,j).length();

                    if (count > max){
                        max = count;
                        s = str.substring(i,j);
                    }
                }
            }
        }

        System.out.println(s);
    }

    private static boolean isPalinedrome(String str){
        int j = str.length()-1;
        for (int i=0; i < str.length() && j >= 0 ; i++,j--){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
        }

        return true;
    }


    //new approach

    private static void check2(String str){
        //aaabaaac

        int max = 0;
        String s = "";
        for (int i = 1; i < str.length()-1; i++){
            int low = i -1;
            int hi = i ;

            while (low >= 0 && hi < str.length()-1){
                if (str.charAt(low) == str.charAt(hi) || str.charAt(low) == str.charAt(hi+1)){
                    int count = hi;
                    if (count > max){
                        max = count;
                        s = str.substring(low,hi);
                    }

                }

                low--;
                hi++;
            }
        }

        System.out.println(s);
        System.out.println("Dd");

    }

    static int longestPalSubstr(String str)
    {
        // The result (length of LPS)
        int maxLength = 1;

        int start = 0;
        int len = str.length();

        int low, high;

        // One by one consider every
        // character as center
        // point of even and length
        // palindromes
        for (int i = 1; i < len; ++i) {
            // Find the longest even
            // length palindrome with
            // center points as i-1 and i.
            low = i - 1;
            high = i;
            while (low >= 0 && high < len
                    && str.charAt(low)
                    == str.charAt(high)) {
                --low;
                ++high;
            }

            // Move back to the last possible valid palindrom substring
            // as that will anyway be the longest from above loop  aaabaaac
            ++low; --high;
            if (str.charAt(low) == str.charAt(high) && high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }

            // Find the longest odd length
            // palindrome with center point as i
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
                --low;
                ++high;
            }

            // Move back to the last possible valid palindrom substring
            // as that will anyway be the longest from above loop
            ++low; --high;
            if (str.charAt(low) == str.charAt(high) && high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
        }

        System.out.print("Longest palindrome substring is: ");
        printSubStr(str, start, start + maxLength - 1);

        return maxLength;
    }

    static void printSubStr(String str,
                            int low, int high)
    {
        System.out.println(
                str.substring(
                        low, high + 1));
    }
}
