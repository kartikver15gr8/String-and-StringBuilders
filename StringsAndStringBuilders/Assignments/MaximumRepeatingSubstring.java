package com.StringsAndStringBuilders.Assignments;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        String sequence = "ababa";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }

    static int maxRepeating(String sequence, String word) {
        int count = 0;
        String w1 = word;
        while (sequence.contains(w1)) {
            count++;
            w1 += word;
        }
        return count;
    }
}
