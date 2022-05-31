package build_a_pile_of_cubes;

// Рассчитывает, сколько раз нужно возвести число в куб начиная с нуля и инкрементируя счетчик на 1,
// чтобы получился указанный параметр

public class ASum {

    public static void main(String[] args) {
        System.out.println(findNb(1071225));
    }

    public static long findNb(long m) {

        long n = 0, totalVolume = 0;
        while (totalVolume < m && ++n > 0) {
            totalVolume += n * n * n;
        }
        return totalVolume == m ? n : -1;
    }
}
