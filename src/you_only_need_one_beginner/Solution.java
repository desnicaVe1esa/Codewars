package you_only_need_one_beginner;

// Проверяет, содержит ли массив значение

public class Solution {

    public static boolean check(Object[] a, Object x) {
        if (a == null) {
            return false;
        } else {
            for (Object o : a) {
                if (o.equals(x)) {
                    return true;
                }
            }
        }
        return false;
    }
}
