package com.StringsAndStringBuilders.Assignments;

public class Implement_strStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "lld";
        System.out.println(strStr(haystack, needle));
    }

    static int strStr(String haystack, String needle) {
        int ans = haystack.indexOf(needle);
        if (ans >= 0) {
            return ans;
        } else return -1;
    }
}
