package beginner_lost_without_a_map;

// Прибавляет к элементу массива число равное самому себе

public class Maps {
    
    public static int[] map(int[] arr) {
        if (arr == null) {
            return null;
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + arr[i] ;
            }
        }
        return arr;
    }
}
