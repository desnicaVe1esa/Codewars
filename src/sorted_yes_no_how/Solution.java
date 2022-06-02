package sorted_yes_no_how;

// Метод, который принимает массив целых чисел и возвращает одно из следующих значений:
//
//        "да, по возрастанию" - если числа в массиве отсортированы в порядке возрастания
//        "да, по убыванию" - если числа в массиве отсортированы в порядке убывания
//        "нет" - в противном случае
//        Вы можете предположить, что массив всегда будет действительным, и всегда будет

class Solution {

    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5, 6};
        System.out.println(isSortedAndHow(arrayInt));
    }

    public static String isSortedAndHow(int[] array) {
        return isAscending(array) ? "yes, ascending": isDescending(array) ? "yes, descending": "no";
    }

    private static boolean isAscending(int[] array) {
        for(int i = 1; i < array.length; i++) {
            if(array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }


    private static boolean isDescending(int[] array) {
        for(int i = 1; i < array.length; i++) {
            if(array[i] > array[i-1]) {
                return false;
            }
        }
        return true;
    }
}
