package com.StringsAndStringBuilders.Assignments;

public class LongPressedName {
    public static void main(String[] args) {
        String name = "john";
        String typed = "johhhn";
        System.out.println(isLongPressedName(name, typed));
    }

    static boolean isLongPressedName(String name, String typed) {
        int difference = 0;
        for (int i = 0; i < typed.length();) {
            //letters are equal -> go next
            if (difference <= i && i - difference < name.length() && typed.charAt(i) == name.charAt(i - difference)) i++;
                // letters are not equal,  but we can link typed letter to name letter from the previous iteration
            else if (difference < i && i - difference - 1 < name.length() && typed.charAt(i) == name.charAt(i - difference - 1)) difference++;
            else return false;
        }
        // check that at the end of name there's no odd symbols
        return typed.length() - difference == name.length();
    }
}
