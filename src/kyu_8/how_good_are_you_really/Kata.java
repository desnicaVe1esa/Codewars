package kyu_8.how_good_are_you_really;

// Возвращает true, если твоя оценка лучше, false - если нет

public class Kata {

    public static void main(String[] args) {
        int[] gradesOfTheClass = {1, 4, 4, 3, 3, 2, 2, 2, 4};
        System.out.println(betterThanAverage(gradesOfTheClass, 5));
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average = 0;
        if (classPoints.length > 0) {
            int sum = 0;
            for (int i = 0; i < classPoints.length; i++) {
                sum += classPoints[i];
            }
            average = sum / classPoints.length;
        }
        if (average >= yourPoints) {
            return false;
        }
        return true;
    }
}

