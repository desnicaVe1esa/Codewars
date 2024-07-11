package kyu_6.pyramid_array.groovy;

class Kata {
    static Integer[][] pyramid(Integer n) {
        int[][] prepared = new int[n][];
        int size = 1;
        for (int i = 0; i < n; i++) {
            prepared[i] = new int[size];
            for (int j = 0; j < size; j++) {
                prepared[i][j] = 1;
            }
            size++;
        }
        return prepared;
    }
}