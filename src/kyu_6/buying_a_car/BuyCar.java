package kyu_6.buying_a_car;

// Расчет количества месяцев и остатка после покупки авто при условии, что ежемесячно цены уменьшаются

import java.util.Arrays;

public class BuyCar {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nbMonths(2000, 8000, 1000, 1.5)));
    }

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int monthCount = 0;
        double remains = 0;
        double startPriceOldDouble = startPriceOld;
        double startPriceNewDouble = startPriceNew;
        while (startPriceOldDouble + remains < startPriceNewDouble) {
            monthCount++;
            remains += savingperMonth;
            if (monthCount % 2 == 0) {
                percentLossByMonth += 0.5;
            }
            startPriceOldDouble *= ((100 - percentLossByMonth) / 100);
            startPriceNewDouble *= ((100 - percentLossByMonth) / 100);
        }
        return new int[]{monthCount, Math.toIntExact(Math.round(remains + startPriceOldDouble - startPriceNewDouble))};
    }
}