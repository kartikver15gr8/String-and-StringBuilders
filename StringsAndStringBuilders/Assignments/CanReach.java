package com.StringsAndStringBuilders.Assignments;

public class CanReach {
    public static void main(String[] args) {
        System.out.println(canReach("011010110", 2, 3));
    }

    static boolean canReach(String s, int minJump, int maxJump) {
        int i = 0;
        while (i < s.length()-1) {
            if (i + minJump < s.length() && s.charAt(i + minJump) == '0') {
                i = i + minJump;
            } else if (i + maxJump < s.length() && s.charAt(i + maxJump) == '0') {
                i = i + maxJump;
            } else {
                return false;
            }
        }
        return true;
    }
}
