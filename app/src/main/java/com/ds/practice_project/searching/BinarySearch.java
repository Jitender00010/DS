package com.ds.practice_project.searching;

import java.util.ArrayList;
import java.util.Arrays;

class BinarySearch {

    public static void main(String[] args) {
        int[] ar ={-7, -3, 1, 9, 22, 30};

        String s = "abc";
        char[] ss = s.toCharArray();
        char c = 'a';
        s += c ;

     //   System.out.println( caesarCypherEncrypto("abc",57));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        System.out.println(sortedSquaredArray1(ar));
    }

    public static String runLengthEncoding(String string) {

        int count = 1;
        String res ="";
        boolean check = true;
        for(int i = 1; i < string.length() ; i++){
            if(string.charAt(i) == string.charAt(i-1)){
                count++;
                if(count == 9){
                    check = false;
                    res = res+count + string.charAt(i-1);
                    count = 1;
                }
            }else{
                if (check)
                res = res+count + string.charAt(i-1);
                count = 1;

                check = true;
            }
        }

        res = res+count + string.charAt(string.length()-1);
        return res;
    }

    public static String caesarCypherEncrypto(String str, int key) {
        String result = "";
        char ch ;
        char dd;

        int as = 57%26;
        System.out.println(as);
        for (char c : str.toCharArray()) {
            ch = c;
            for (int i = 0; i < key; i++) {
                c++;
                if (c == 123){
                    c = ch;
                }
            }
            result +=c;
        }
        return result;
    }

    public static String caesarCypherEncryptor(String str, int key) {

       // if (key> 25)
         //   return str;
        String result = "";
        char ch ;
        char dd;
        for(int i =0; i < str.length(); i++){
            ch = str.charAt(i);
            ch += key;
            if (ch > 122){
                ch -= 122;
                dd = 96;
                 dd += ch;
                result = result + dd;
            }else {
                result = result + ch;
            }
        }
        return result;
    }

    public static int binarySearch(int[] array, int target) {
        int a = 0,first = 0 , last = array.length;
        int mid =  last/2;

        for(int i = 0; i < mid; i++){
            if(array[mid-1]  == target)
                return mid-1;
            else if(array[mid] > target){
                first = first;     // 0
                last = mid - 1;   // 4
                mid = (first + last)/2;
            }else if(array[a] < target){
                first = mid + 1;  // 3
                //	last = array.length();
                mid = ( first + last) /2;
            }
        }
        return -1;
    }

    public static  boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

        if(redShirtHeights.size() != blueShirtHeights.size() ){
            return false;
        }

        int first = 0;
        int second = 0;
        for(int a : redShirtHeights){
            first += a;
        }

        int i =0;
        for(; i < blueShirtHeights.size(); i++){
            second += blueShirtHeights.get(i);
        }

        if(first > second){
            second = second + i;
        }else{
            first = first + i;
        }




        if(first== second)
            return true;
        return false;
    }


    public static  int[] sortedSquaredArray(int[] array) {
        // Write your code here.  1 3 5 7
        int[] ar = new int[array.length];
        int smallIdx =0;
        int largeIdx = array.length-1;
        for(int i = array.length -1; i >= 0; i--){
            int small = array[smallIdx];
            int large = array[largeIdx];
            if(Math.abs(small) > Math.abs(large)){
                ar[i] = small * small;
                smallIdx++;
            }else{
                ar[i] = large * large;
                largeIdx--;
            }
        }
        return ar;
    }

    public static int[] sortedSquaredArray1(int[] array) {
        int[] ar = new int[array.length];

        for(int i=0,j =0 ; i < array.length; i++){
            int v = array[i];
            ar[i] = v * v;

        }

        Arrays.sort(ar);
        return ar;
    }

    public int getSquare(int val){
        int s = val * val;
        return s;
    }

}
