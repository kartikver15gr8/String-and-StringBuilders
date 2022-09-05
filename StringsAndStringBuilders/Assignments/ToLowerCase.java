package com.StringsAndStringBuilders.Assignments;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "HleroewHH";
        System.out.println(toLowerCase(s));
    }

    static String toLowerCase(String s) {
        if (s.length() == 0) {
            return s;
        }
        return s.toLowerCase();
    }
}
