package com.StringsAndStringBuilders.Assignments;

public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }

    static boolean judgeCircle(String moves) {
        boolean result = false;
        int positionAlongYAxix = 0;
        int positionAlongXAxix = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                positionAlongYAxix++;
            }else if (moves.charAt(i) == 'D') {
                positionAlongYAxix--;
            }else if (moves.charAt(i) == 'L') {
                positionAlongXAxix--;
            }else if (moves.charAt(i) == 'R') {
                positionAlongXAxix++;
            }
        }
        if (positionAlongXAxix == 0 && positionAlongYAxix == 0) {
            result = true;
        }
        return result;
    }
}
