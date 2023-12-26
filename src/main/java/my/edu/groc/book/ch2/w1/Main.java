package my.edu.groc.book.ch2.w1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        System.out.println(selectionSortList(list));
    }
    private static List<Integer> selectionSortList(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>(list.size());

        int size = list.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(list);
            sortedList.add(list.get(smallest));

            list.remove(smallest);
        }

        return sortedList;
    }

    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
