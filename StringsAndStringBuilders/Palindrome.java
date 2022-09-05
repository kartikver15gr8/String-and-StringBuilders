package com.StringsAndStringBuilders;

public class Palindrome {
    public static void main(String[] args) {
        String str = "OYO";
        System.out.println(isPalindrome(str));
        System.out.println(palindromeCheck(str));
    }

    static boolean isPalindrome(String string) {
        string = string.toLowerCase();
        boolean ans = false;
        String newStr = "";
        for (int i = 1; i <= string.length(); i++) {
            char ch = string.charAt(string.length() - i);
            newStr += ch;
        }
        if (newStr.equals(string)) {
            ans = true;
        }
        return ans;
    }

    static boolean palindromeCheck(String string) {
        string = string.toLowerCase();
        boolean ans = true;
        int j = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(j)) {
                ans = false;
                break;
            }
            j--;
        } return ans;
    }
}
