package kyu_6.find_the_odd_int.groovy

class Kata {
    public static Integer findIt(List<Integer> list) {
        def xor = 0;
        for (def i = 0; i < list.size(); i++) {
            xor ^= list[i];
        }
        return xor;
    }
}