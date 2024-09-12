package kyu_8.how_old_will_i_be_n_2099.java;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        String years = Math.abs(yearTo - birth) > 1 ? " years." : " year.";
        String yearsOld = Math.abs(yearTo - birth) > 1 ? " years old." : " year old.";
        return yearTo < birth ? "You will be born in " + Math.abs(yearTo - birth) + years
                : yearTo == birth ? "You were born this very year!"
                : "You are " + (yearTo - birth) + yearsOld;
    }
}
