package kyu_6.sums_of_parts.groovy;

class SumParts {

    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int sum = 0;
        for (int i = ls.length - 1; i >= 0; i--) {
            sum += ls[i];
            result[i] = sum;
        }
        return result;
    }
}