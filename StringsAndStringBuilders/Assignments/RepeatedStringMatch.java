package com.StringsAndStringBuilders.Assignments;

public class RepeatedStringMatch {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cabcabca";
        System.out.println(repeatedStringMatch(a, b));
    }

    // The below function is not totally correct, It failed into some test cases
    static int repeatedStringMatch(String a, String b) {
        int alen = a.length();
        int blen = b.length();
        int diff = blen - alen;
        int ans = -1;
        int count = 1;
        String add = a;
        if (a.length() >= b.length() && a.contains(b)) {
            ans = count;
            return ans;
        }
        for (int i = 0; i <= diff; i++) {
            a += add;
            count++;
            if (a.contains(b)) {
                ans = count;
                return ans;
            }
        }
        return ans;
    }
}
