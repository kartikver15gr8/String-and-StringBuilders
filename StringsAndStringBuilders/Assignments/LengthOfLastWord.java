package com.StringsAndStringBuilders.Assignments;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        int ans = 0;
        String lolo = s.trim();
        for (int i = lolo.length() - 1; i >= 0; i--) {
            if (lolo.charAt(i) == ' ') {
                return ans;
            } else {
                ans++;
            }
        }
        return ans;
    }
}
