package moduli_number_system.groovy

public class ModSystem {
    public static String fromNb2Str(int n, int[] sys) {
        int prd = sys.inject(1, {acc, e -> acc * e});
        int lcm = sys.inject(1, {acc, e -> (acc * e).intdiv(gcd(acc, e))});
        String res = sys.inject("", {acc, e -> acc + "-${n % e}-"});
        return prd < n || lcm != prd ? "Not applicable" : res;
    }
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}

