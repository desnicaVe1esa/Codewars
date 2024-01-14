package kyu_6.becoming_a_real_spy;

import static java.util.stream.Collectors.joining;

public class SpyGraduation {

    public String decrypt(String encrypted) {
        return encrypted.chars().map(c -> c & 255).mapToObj(c -> (char) c + "").collect(joining());
    }
}

