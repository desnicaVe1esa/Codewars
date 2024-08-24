package kyu_8.if_you_cant_sleep_just_count_sheep.java;

class Kata {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }
        return result.toString();
    }
}
