package com.StringsAndStringBuilders.Assignments;

public class MergeStringAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    static String mergeAlternately(String word1, String word2) {
        String ans = "";
        int index = 0;
        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                char c = word1.charAt(i);
                ans += c;
                char d = word2.charAt(i);
                ans += d;
            }
        } else if (word1.length() > word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                char c = word1.charAt(i);
                ans += c;
                char d = word2.charAt(i);
                ans += d;
                index = i+1;
            }
            while (index < word1.length()) {
                char c = word1.charAt(index);
                ans += c;
                index++;
            }
        } else {
            for (int i = 0; i < word1.length(); i++) {
                char c = word1.charAt(i);
                ans += c;
                char d = word2.charAt(i);
                ans += d;
                index = i+1;
            }
            while (index < word2.length()) {
                char c = word2.charAt(index);
                ans += c;
                index++;
            }
        }
        return ans;

    }
}
