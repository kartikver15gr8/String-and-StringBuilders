package com.StringsAndStringBuilders.Assignments;

public class StringsThatAppearAsSubstring {
    public static void main(String[] args) {
        String[] pattern = {"a","b","c"};
        String word = "aaaaabbbbb";
        System.out.println(numOfStrings(pattern, word));
    }

    static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                count++;
            }
        }
        return count;
    }
}
