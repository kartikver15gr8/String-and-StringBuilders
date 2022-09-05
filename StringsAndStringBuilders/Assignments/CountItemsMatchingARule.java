package com.StringsAndStringBuilders.Assignments;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
//        String[][] items = {
//                {"phone", "blue", "pixel"},
//                {"computer", "silver", "lenovo"},
//                {"phone", "gold", "iphone"}
//        };

        List<List<String>> items = new ArrayList<List<String>>();
        String ruleKey = "color";
        String ruleValue = "silver";
//        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    //    static int countMatches(String[][] items, String ruleKey, String ruleValue) {
//        int count = 0;
//        if (ruleKey.equals("type")) {
//            for (int i = 0; i < items.length; i++) {
//                if (items[i][0].equals(ruleValue)) {
//                    count++;
//                }
//            }
//        }else if (ruleKey.equals("color")) {
//            for (int i = 0; i < items.length; i++) {
//                if (items[i][1].equals(ruleValue)) {
//                    count++;
//                }
//            }
//        }else if (ruleKey.equals("name")) {
//            for (int i = 0; i < items.length; i++) {
//                if (items[i][2].equals(ruleValue)) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        switch (ruleKey) {
            case "type":
                for (List<String> item : items) {
                    if (item.get(0).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
            case "color":
                for (List<String> item : items) {
                    if (item.get(1).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
            case "name":
                for (List<String> item : items) {
                    if (item.get(2).equals(ruleValue)) {
                        count++;
                    }
                }
                break;
        }
        return count;
    }
}
