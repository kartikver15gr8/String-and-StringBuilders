package com.StringsAndStringBuilders;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kartikay Verma In This World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(("             Hellllll      ".strip()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.replace(" ", "_"));

    }
}
