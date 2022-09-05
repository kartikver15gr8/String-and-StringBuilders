package com.StringsAndStringBuilders.Assignments;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abbbbbbb";
        System.out.println(validPalindrome(s));
    }

        static boolean validPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;
            while (i < j - 1) {
                if (s.charAt(i) != s.charAt(j)) {
                    if (valid(s, i, j - 1)) {
                        return true;
                    }
                    if (valid(s, i + 1, j)) {
                        return true;
                    }
                    return false;
                } else {
                    i++;
                    j--;
                }
            }
        return true;
    }
    static boolean valid(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
