package kyu_6.give_me_a_diamond.java;

class Diamond {
    public static String print(int n) {
        if ((n % 2) == 0 || n <= 0) return null;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < n; i += 2) {
            result.append(" ".repeat(Math.max(0, (n - i) / 2)));
            result.append("*".repeat(Math.max(0, i)));
            result.append("\n");
        }
        for (int i = n; i > 0; i -= 2) {
            result.append(" ".repeat(Math.max(0, (n - i) / 2)));
            result.append("*".repeat(i));
            result.append("\n");
        }
        return result.toString();
    }
}