package my.edu.netology.lesson1.cw.w1;

import my.edu.netology.RandomArray;

public class Main {
    private static final int ARRAY_LENGTH = 10;
    private static final boolean ASC = true;
    private static final boolean DESC = false;

    public static void main(String[] args) {
        Integer[] array = new RandomArray().setRandomIntegerArray(ARRAY_LENGTH);

        myPrintArray(array);
        mySortArray(array, ASC);
        myPrintArray(array);
        mySortArray(array, DESC);
        myPrintArray(array);
    }

    public static void myPrintArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mySortArray(Integer[] array, boolean asc) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && ((array[i] < array[j] && asc) || (array[i] > array[j] && !asc))) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
