package com.StringsAndStringBuilders.Assignments;

import java.util.Arrays;

public class SplitTwoStringsToMakePalindrome {
    public static void main(String[] args) {
        String a = "x";
        String b = "y";
        System.out.println(checkPalindromeFormation(a, b));
    }

    static boolean checkPalindromeFormation(String a, String b) {
        return valid(a, b) || valid(b, a);
    }

    static boolean valid(String a, String b) {
        int start = 0;
        int end = a.length() - 1;
        while (start < end) {
            if (a.charAt(start) != b.charAt(end)) {
                return isPalindrome(a, start, end) || isPalindrome(b, start, end);
            }
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindrome(String a, int start, int end) {
        while (start < end) {
            if (a.charAt(start) != a.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
