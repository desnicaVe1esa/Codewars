package kyu_6.handshake_problem.java;

public class Kata {
    public static int GetParticipants(int handshakes) {
        if (handshakes == 0) {
            return 0;
        }
        int n = 1;
        while (n * (n - 1) / 2 < handshakes) {
            n++;
        }
        return n;
    }
}
