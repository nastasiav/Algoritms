package my.edu.groc.book.ch1.w1;

public class Main {
    public static void main(String[] args) {
        // Создать отсортированный массив из 10 элементов
        int[] myList = {1, 3, 5, 7, 9};
        
        // Вызвать функцию binarySearch
        System.out.println(binarySearch(myList, 7));
        System.out.println(binarySearch(myList, 3));
        System.out.println(binarySearch(myList, -1));
    }

    private static Integer binarySearch(int[] myList, int item) {
        int low = 0;
        int high = myList.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            int tryInt = myList[mid];
            if (tryInt == item) {
                return mid;
            }
            if (tryInt < item) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return null;
    }
}
