package kyu_7.growth_of_a_population;

// Расчет количества лет, за которое изменится количество населения

class Arge {

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int years = 0;
        while (p0 < p) {
            p0 = p0 + (int)(p0 * percent / 100) + aug;
            years++;
        }
        return years;
    }
}