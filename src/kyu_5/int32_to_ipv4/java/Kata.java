package kyu_5.int32_to_ipv4.java;

public class Kata {
    public static String longToIP(long ip) {
        String result = String.format("%d.%d.%d.%d%n", ip >>> 24, (ip >> 16) & 0xff, (ip >> 8) & 0xff, ip & 0xff);
        return result.trim();
    }
}
