package kyu_8.unexpected_parsing.java;

import java.util.HashMap;

public class Kata {
    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();
        status.put("status", isBusy ? "busy" : "available");
        return status;
    }
}
