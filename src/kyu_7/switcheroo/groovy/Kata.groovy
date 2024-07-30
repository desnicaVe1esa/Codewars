package kyu_7.switcheroo.groovy;

class Kata {
    static def switcheroo(string) {
        StringBuilder result = new StringBuilder()
        for (int i = 0; i < string.length(); i++) {
            result.append(string.charAt(i) == 'a' ? "b"
                    : string.charAt(i) == 'b' ? "a"
                    : string.charAt(i))
        }
        return result.toString()
    }
}
