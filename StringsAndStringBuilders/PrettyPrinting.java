package com.StringsAndStringBuilders;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 235.339333f;  // This is a float value
        /* Suppose if I only want to print the above float number 'a'
         till two decimal places only,
         then I can use the formatting as shown below*/
//        System.out.printf("Formatted number is %.2f", a);

        System.out.println(Math.PI); // This will print the value of Pi
        System.out.printf("Pi till three decimal places %.3f \n", Math.PI); // I added '\n' to get a new line

        System.out.printf("Hello I'm %s, And I'm %s", "Kartikey", "Awesome");

    }
}
