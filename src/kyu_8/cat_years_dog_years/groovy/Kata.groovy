package kyu_8.cat_years_dog_years.groovy

class Kata {
    static humanYearsCatYearsDogYears(humanYears){
        def catYear = humanYears == 2 ? 15 + 9 : humanYears == 3 ? 15 + 9 + 4 : humanYears > 3 ? 15 + 9 + (humanYears - 2) * 4 : 15
        def dogYear = humanYears == 2 ? 15 + 9 : humanYears == 3 ? 15 + 9 + 5 : humanYears > 3 ? 15 + 9 + (humanYears - 2) * 5 : 15
        return [humanYears, catYear, dogYear]
    }
}