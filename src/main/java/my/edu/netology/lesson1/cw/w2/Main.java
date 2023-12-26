package my.edu.netology.lesson1.cw.w2;

import my.edu.netology.RandomArray;

import java.util.Scanner;

public class Main {
    private static final int ARRAY_SIZE = 20;
    public static void main(String[] args) {
        Integer[] array = new RandomArray().setRandomIntegerArray(ARRAY_SIZE);
        Scanner scanner = new Scanner(System.in);

        my.edu.netology.lesson1.cw.w1.Main mainW1 = new my.edu.netology.lesson1.cw.w1.Main();
        mainW1.myPrintArray(array);
        mainW1.mySortArray(array, true);
        mainW1.myPrintArray(array);

        System.out.println("Введите число для поиска: ");
        int search = scanner.nextInt();

        int low = 0;
        int high = array.length;
        int index = -1;

        while (low < high) {
            int medium = (low + high) / 2;
            if (search == array[medium]) {
                index = medium;
                break;
            } else if (search > array[medium]) {
                low = medium + 1;
            } else {
                high = medium - 1;
            }
        }
        System.out.println("Ответ - " + (index > -1 ? index : null));
    }
}
