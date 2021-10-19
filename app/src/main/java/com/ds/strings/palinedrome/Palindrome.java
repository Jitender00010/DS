package com.ds.strings.palinedrome;// Java program to check if a given string
/**
 * Check if a given string is a rotation of a palindrome
 * Difficulty Level : Medium
 * Last Updated : 07 Jul, 2021
 * Given a string, check if it is a rotation of a palindrome. For example your function should return true for “aab” as it is a rotation of “aba”.
 * Examples:
 *
 * Input:  str = "aaaad"
 * Output: 1
 * // "aaaad" is a rotation of a palindrome "aadaa"
 *
 * Input:  str = "abcd"
 * Output: 0
 * // "abcd" is not a rotation of any palindrome*/

class Palindrome {
	// A utility function to check if a string str is palindrome
	static boolean isPalindrome(String str)
	{
		// Start from leftmost and rightmost corners of str
		int l = 0;
		int h = str.length() - 1;

		// Keep comparing characters while they are same
		while (h > l)
			if (str.charAt(l++) != str.charAt(h--))
				return false;

		// If we reach here, then all characters were matching
		return true;
	}

	// Function to check if a given string is a rotation of a
	// palindrome
	static boolean isRotationOfPalindrome(String str)
	{
		// If string iteself is palindrome
		if (isPalindrome(str))
			return true;

		// Now try all rotations one by one
		int n = str.length();
		for (int i = 0; i < n - 1; i++) {
			String str1 = str.substring(i + 1);
			String str2 = str.substring(0, i + 1);

			// Check if this rotation is palindrome
			if (isPalindrome(str1 + str2))
				return true;
		}
		return false;
	}

	// driver program
	public static void main(String[] args)
	{
		System.out.println((isRotationOfPalindrome("aab")) ? 1 : 0);
		System.out.println((isRotationOfPalindrome("abcde")) ? 1 : 0);
		System.out.println((isRotationOfPalindrome("aaaad")) ? 1 : 0);
	}
}

// Contributed by Pramod Kumar
