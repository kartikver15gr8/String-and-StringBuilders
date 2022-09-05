package com.StringsAndStringBuilders.Assignments;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }

    static String interpret(String command) {
        String s1 = command.replace("()", "o");
        String ans = s1.replace("(al)", "al");
        return ans;
    }
}
