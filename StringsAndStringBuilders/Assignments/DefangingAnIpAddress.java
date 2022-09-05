package com.StringsAndStringBuilders.Assignments;

public class DefangingAnIpAddress {
    public static void main(String[] args) {
        String address = "25.48.78.988.1";
        System.out.println(defangIPaddr(address));
    }

    static String defangIPaddr(String address) {
        String ans = address.replace(".", "[.]");
        if (address.length() == 0) {
            return address;
        } else {
            return ans;
        }
    }
}
