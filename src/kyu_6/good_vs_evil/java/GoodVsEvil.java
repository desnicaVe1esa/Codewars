package kyu_6.good_vs_evil.java;

import java.util.Arrays;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int goodsPower = 0;
        int evilsPower = 0;
        int[] goodsArr = Arrays.stream(goodAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] evilsArr = Arrays.stream(evilAmounts.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < goodsArr.length; i++) {
            if (i == 0) {
                goodsPower += goodsArr[i];
            } else if (i == 1) {
                goodsPower += goodsArr[i] * 2;
            } else if (i == 2) {
                goodsPower += goodsArr[i] * 3;
            } else if (i == 3) {
                goodsPower += goodsArr[i] * 3;
            } else if (i == 4) {
                goodsPower += goodsArr[i] * 4;
            } else {
                goodsPower += goodsArr[i] * 10;
            }
        }
        for (int i = 0; i < evilsArr.length; i++) {
            if (i == 0) {
                evilsPower += evilsArr[i];
            } else if (i == 1) {
                evilsPower += evilsArr[i] * 2;
            } else if (i == 2) {
                evilsPower += evilsArr[i] * 2;
            } else if (i == 3) {
                evilsPower += evilsArr[i] * 2;
            } else if (i == 4) {
                evilsPower += evilsArr[i] * 3;
            } else if (i == 5) {
                evilsPower += evilsArr[i] * 5;
            } else {
                evilsPower += evilsArr[i] * 10;
            }
        }
        if (goodsPower > evilsPower) {
            return "Battle Result: Good triumphs over Evil";
        } else if (goodsPower < evilsPower) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }
}
