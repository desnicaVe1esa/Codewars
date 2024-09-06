package kyu_7.simple_fun_152_invite_more_women.java;

import java.util.Arrays;

public class Kata {
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).sum() > 0;
    }
}
