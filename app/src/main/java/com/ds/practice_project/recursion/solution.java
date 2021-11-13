package com.ds.practice_project.recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class solution 
{ 
// Function to return the required count 
static int findPermutation(String str, int k)
{ 
    boolean[] has = new boolean[26]; 
    Arrays.fill(has,false);
  
    // To store the count of distinct characters in str 
    int cnt = 0; 
  
    // Traverse str character by character 
    for (int i = 0; i < str.length(); i++) { 
  
        // If current character is appearing 
        // for the first time in str 
        if (!has[str.charAt(i) - 'a'])  
        { 
  
            // Increment the distinct character count 
            cnt++; 
  
            // Update the appearance of the current character 
            has[str.charAt(i) - 'a'] = true; 
        } 
    } 
  
    int ans = 1; 
  
    // Since P(n, r) = n! / (n - r)! 
    for (int i = 2; i <= cnt; i++) 
        ans *= i; 
  
    for (int i = cnt - k; i > 1; i--) 
        ans /= i; 
  
    // Return the answer 
    return ans; 
} 
  
// Driver code 
public static void main(String args[])
{ 
    String str = "jjeeaffww";
    int k = 4;
    System.out.println(unique(str));
    System.out.println(removoDuplecateChar(str,k));

    int c = 5040/120;
    //3628800   geeksforgeeks
}


    public static String unique(String s)
    {
        String str = new String();
        int len = s.length();

        // loop to traverse the string and
        // check for repeating chars using
        // IndexOf() method in Java
        for (int i = 0; i < len; i++)
        {
            // character at i'th index of s
            char c = s.charAt(i);

            // if c is present in str, it returns
            // the index of c, else it returns -1
            System.out.println("ind     "+str.indexOf(c));
            if (str.indexOf(c) < 0)
            {
                // adding c to str if -1 is returned
                str += c;
            }
        }

        return str;
    }

    private static int removoDuplecateChar(String str, int k){
    Map<Character, Character> map = new HashMap<>();
    String str1="";
    for (int i=0; i<str.length(); i++){

        if (!map.containsKey(str.charAt(i))){
            map.put(str.charAt(i),str.charAt(i));
        }
    }

    return fac(map.size())/fac(map.size() -k );
}


private static int fac(int no){

    if (no == 1 || no == 0)
        return 1;
    return no*fac(no -1 );
}
} 