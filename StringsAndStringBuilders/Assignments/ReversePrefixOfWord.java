package com.StringsAndStringBuilders.Assignments;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    static String reversePrefix(String word, char ch) {
        String ans = "";
        int i = word.indexOf(ch);
        if (i != -1) {
            char[] arr = word.toCharArray();
            for (int j = i; j >= 0; j--) {
                ans += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                ans += arr[j];
            }
        } else {
            ans = word;
        }
        return ans;
    }
}
