package kyu_8.counting_sheep.java;


public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean b : arrayOfSheeps) {
            if (b != null && b) {
                counter += 1;
            }
        }
        return counter;
    }
}
