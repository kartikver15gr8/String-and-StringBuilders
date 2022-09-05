package com.StringsAndStringBuilders.Assignments;

import java.util.Arrays;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "Textbook";
        System.out.println(halvesAreAlike(s));
    }

    static boolean halvesAreAlike(String s) {
        boolean ans = false;
        s = s.toLowerCase();
        String[] arr = s.split("");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
                count1++;
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            if (arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
                count2++;
            }
        }
        if (count1 == count2) {
            ans = true;
        }
        return ans;
    }
}
