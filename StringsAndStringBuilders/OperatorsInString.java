package com.StringsAndStringBuilders;

import java.util.ArrayList;

public class OperatorsInString {
    public static void main(String[] args) {
        System.out.println('a' + 'b');      // This will print 195, which is the sum of the ascii values of 'a' and 'b'
        System.out.println("a" + "b");      // This will print "ab", which is the concatenated result of a+b

        System.out.println("a" + 1);
        /* This above statement will print 'a1'
           because the int value we gave above will get converted
           into the respective 'wrapper' class which is 'Integer'
           and then will call the toString() and get converted into the string
           and get concatenated with a. So internally the integer '1' is not getting
           added to 'a', actually the string value of '1' is concatenated with 'a'*/
        System.out.println("Kartikey" + new ArrayList<>()); // Will print "kartikey[]"

    }
}
