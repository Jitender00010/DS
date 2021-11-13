package com.ds.practice_project.StringPracktis;

public class SpacialStringAgain {

    public static void main(String[] arg){
        String str = "aabaaa";   // asasd 7 (asa sas)   abcba  ba 10

        // aaaa aa aaa aaaa
       // spacialString2(str.toCharArray());

        System.out.println(substrCount(str.length(),str));
       // System.out.println(CountSpecialPalindrome(str));
    }

    public static int CountSpecialPalindrome(String str)
    {
        int n = str.length();

        // store count of special
        // Palindromic substring
        int result = 0;

        // it will store the count
        // of continues same char
        int[] sameChar = new int[n];
        for(int v = 0; v < n; v++)
            sameChar[v] = 0;

        int i = 0;

        // traverse string character
        // from left to right
        while (i < n)
        {

            // store same character count
            int sameCharCount = 1;

            int j = i + 1;

            // count smiler character
            while (j < n &&
                    str.charAt(i) == str.charAt(j))
            {
                sameCharCount++;
                j++;
            }

            // Case : 1
            // so total number of
            // substring that we can
            // generate are : K *( K + 1 ) / 2
            // here K is sameCharCount
            result += (sameCharCount *
                    (sameCharCount + 1) / 2);

            // store current same char
            // count in sameChar[] array
            sameChar[i] = sameCharCount;

            // increment i
            i = j;
        }

        // Case 2: Count all odd length
        //           Special Palindromic
        //           substring
        for (int j = 1; j < n; j++)
        {
            // if current character is
            // equal to previous one
            // then we assign Previous
            // same character count to
            // current one
            if (str.charAt(j) == str.charAt(j - 1))
                sameChar[j] = sameChar[j - 1];

            // case 2: odd length
            if (j > 0 && j < (n - 1) &&
                    (str.charAt(j - 1) == str.charAt(j + 1) &&
                            str.charAt(j) != str.charAt(j - 1)))
                result += Math.min(sameChar[j - 1],
                        sameChar[j + 1]);
        }

        // subtract all single
        // length substring
        return result - n;
    }

    public static long substrCount(int length, String s) {
        long counter = 0;
        for (int i = 0; i < length; i++) {
            // if the current symbol is in the middle of palindrome, e.g. aba
            //                      abcbaba  aaabaaa     3
            int offset = 1;
            while (i - offset >= 0 && i + offset < length
                    && s.charAt(i - offset) == s.charAt(i - 1)   // 0 0 2 0
                    && s.charAt(i + offset) == s.charAt(i - 1)) {// 1
                counter++;
                offset++;
            }
            // if this is repeatable characters aa
            int repeats = 0;
            while (i + 1 < length && s.charAt(i) == s.charAt(i + 1)) {
                repeats++;
                i++;
            }
           // System.out.println("repeatte "+counter);
            counter += repeats * (repeats + 1) / 2;
        }
        return counter + length;
    }

    private static void spacialString(char[] str) {

        int len = str.length;
        int count = 0;
        for (int last = 1; last < len; last++){
            boolean check = false;
            int l = last;

            for (int first = 0; first < last/2; first++){

                if (str[first] != str[l]){
                    check = false;
                    //break;
                }else if (str[first] == str[l]){
                    check = true;
                    l--;
                }else {
                    check = false;
                }
            }

            if (check)
                count++;
        }

        int c = count +len;
        System.out.println(c);
    }

    private static void spacialString2(char[] str) {

        int len = str.length;
        int count = 0;                  //abcbaba
        int r = 0;
        boolean ccc = true;
        for (int c = 1; c < len && r < len; c++) {
            r = c + 1;
            int l = c - 1;

            int checkVal = 0;
            if (l >= 0 && r < len && str[l] == str[r]) {
                while (l >= 0 && r < len && str[l] == str[r]) {
                    checkVal++;

                    if (checkVal >1){
                        int k = c-1;
                        int k1 = c+1;
                        int ll = l;
                        int rr = r;
                        while (c>k && l>0 && str[k] == str[ll] && k1 < len &&  str[k1] == str[rr] ){
                            k--;
                            ll++;
                            k1++;
                            rr--;
                            count++;
                        }
                    }

                    count++;
                    l--;
                    r++;
                }

            }
        }

        //int c = count + len;
        System.out.println(count);
    }

    private static void spacialString1(char[] str) {

        int len = str.length;
        int count = 0;
        int r = 0;
        boolean ccc = true;
        for (int c = 1; c < len && r < len; c++) {
            r = c + 1;
            int l = c - 1;
            int rr = len - 1;
            int ll = c - 1;

            if (r > len-1)
                break;
            if (str[ll] == str[rr] && ccc) {
                ccc = false;
                boolean cehck = true;
                while (ll < len / 2) {
                    if (str[ll] == str[rr]) {
                        rr--;
                        ll++;
                    } else {
                        cehck = false;
                        break;
                    }
                }

                /*if (cehck)
                    count++;*/

            }

            if (str[l] == str[c]) {
                count++;
            }
            if (str[c] == str[r])
                count++;
            if (l >= 0 && r < len && str[l] == str[r]) {
                while (l >= 0 && r < len && str[l] == str[r]) {
                    l--;
                    r++;
                    count++;
                }

            }
        }

        int c = count + len;
        System.out.println(c);
    }
}
