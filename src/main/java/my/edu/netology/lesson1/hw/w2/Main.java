package my.edu.netology.lesson1.hw.w2;

public class Main {
    public static void main(String[] args) {
        int[] array = {14, 16, 19, 32, 32, 32, 56, 69, 72};
        System.out.println(countBiggerBooks(array, 32));
        System.out.println(countBiggerBooks(array, 60));
        System.out.println(countBiggerBooks(array, 16));
    }

    private static int countBiggerBooks(int[] array, int pages) {
        int count = 0;

        int left = 0;
        int right = array.length;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (array[middle] <= pages) {
                if (array[middle + 1] > pages) {
                    count = array.length - 1 - middle;
                    break;
                } else if (array[middle + 1] <= pages) {
                    left = middle + 1;
                }
            } else if (array[middle] > pages) {
                right = middle - 1;
            }

        }

        return count;
    }
}
