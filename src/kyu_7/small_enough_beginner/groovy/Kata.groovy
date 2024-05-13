package kyu_7.small_enough_beginner.groovy;

class Kata {
    static def smallEnough(arr, limit) {
        for (int j : (arr as List<Integer>)) {
            if (j > limit) {
                return false
            }
        }
        return true
    }
}