package com.ds.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Print number in ascending order which contains 1, 2 and 3 in their digits.
 * Difficulty Level : Medium
 * Last Updated : 08 Jan, 2019
 * Given an array of numbers, the task is to print those numbers in ascending order separated by commas which have 1, 2 and 3 in their digits. If no number containing digits 1, 2, and 3 present then print -1.
 *
 * Examples:
 *
 * Input : numbers[] = {123, 1232, 456, 234, 32145}
 * Output : 123, 1232, 32145
 *
 * Input : numbers[] = {9821, 627183, 12, 1234}
 * Output : 1234, 627183
 *
 * Input : numbers[] = {12, 232, 456, 234}
 * Output : -1*/

class PrintNoAscOrder {

    public static void main(String[] args) {
        int[] ar= {123, 1232, 456, 234, 32145};
        printNumbers(ar);
    }


    // prints all the number containing 1, 2, 3
    // in any order
    private static String printNumbers(int[] numbers)
    {

        ArrayList<Integer> array = new ArrayList<>();
        for (int number : numbers) {

            // check if the number contains 1,
            // 2 & 3 in any order
            if (findContainsOneTwoThree(number))
                array.add(number);
        }
        // sort all the numbers
        Collections.sort(array);

        StringBuffer strbuf = new StringBuffer();
        Iterator it = array.iterator();
        while (it.hasNext()) {

            int value = (int)it.next();
            if (strbuf.length() > 0)
                strbuf.append(", ");

            strbuf.append(Integer.toString(value));
        }

        return (strbuf.length() > 0) ?
                strbuf.toString() : "-1";
    }

    // convert the number to string and find
    // if it contains 1, 2 & 3.
    private static boolean findContainsOneTwoThree(
            int number)
    {

        String str = Integer.toString(number);
        return (str.contains("1") && str.contains("2") &&
                str.contains("3"));
    }
}
