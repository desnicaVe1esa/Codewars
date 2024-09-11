package kyu_8._101_dalmatians_squash_the_bugs_not_the_dogs.java;

public class ZywOo {

    public static String howManyDalmatians(int number) {

        String[] dogs = new String[]{"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};

        return number <= 10 ? dogs[0] : number <= 50 ? dogs[1] : number == 101 ? dogs[3] :dogs[2];
    }

}
