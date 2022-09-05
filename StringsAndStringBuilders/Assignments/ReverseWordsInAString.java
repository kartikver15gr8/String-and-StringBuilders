package com.StringsAndStringBuilders.Assignments;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            temp.append(arr[i]);
            temp.reverse();
            arr[i] = temp.toString();
        }
        String ans = String.join(" ", arr);
        return ans;
    }
}
