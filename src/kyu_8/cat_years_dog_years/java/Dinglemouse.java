package kyu_8.cat_years_dog_years.java;

public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYear = humanYears == 2 ? 15 + 9 : humanYears == 3 ? 15 + 9 + 4 : humanYears > 3 ? 15 + 9 + (humanYears - 2) * 4 : 15;
        int dogYear = humanYears == 2 ? 15 + 9 : humanYears == 3 ? 15 + 9 + 5 : humanYears > 3 ? 15 + 9 + (humanYears - 2) * 5 : 15;
        return new int[]{humanYears, catYear, dogYear};
    }

}
