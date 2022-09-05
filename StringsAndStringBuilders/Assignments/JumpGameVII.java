package com.StringsAndStringBuilders.Assignments;

public class JumpGameVII {
    public static void main(String[] args) {
        String s = "0000000000";
        int minJump = 2;
        int maxJump = 3;
        System.out.println(canReach(s, minJump, maxJump));
    }

    // The below function is not complete
    static boolean canReach(String s, int minJump, int maxJump) {
        boolean ans = true;
        int i = 0;
        while (i < s.length()) {
            int j = i + minJump;
            int k = i + maxJump;
            if (i == s.length() - 1) {
                return ans;
            }
            if (j < s.length() || k < s.length()) {
                if (s.charAt(j) == '0' ) {
                    i = j;
                } else if (s.charAt(k) == '0') {
                    i = k;
                } else {
                    ans = false;
                    break;
                }
            }
        }
        return ans;
    }
}
