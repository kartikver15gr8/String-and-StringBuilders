package com.StringsAndStringBuilders.Assignments;

public class CheckingIfTwoStringsAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a","bcd"};
        String[] word2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(word1, word2));

    }

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean ans = false;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (String str : word1) {
            s1.append(str);
        }
        for (String str : word2) {
            s2.append(str);
        }
        if (s1.toString().equals(s2.toString())) {
            ans = true;
        }
        return ans;
    }
}
