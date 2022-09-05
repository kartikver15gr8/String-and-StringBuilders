package com.StringsAndStringBuilders.Assignments;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int column = 701;
        System.out.println(convertToTitle(column));

    }

    static String convertToTitle(int columnNumber) {
        StringBuilder ans= new StringBuilder();
        while(columnNumber>0)
        {
            --columnNumber;
            int d = columnNumber % 26;
            columnNumber /= 26;
            ans.append((char) ('A' + d));
        }
        ans.reverse();
        return ans.toString();
    }
}
