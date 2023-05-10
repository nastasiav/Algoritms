package my.edu.Netology.lesson1.cw.w3;

import my.edu.Netology.RandomArray;

public class Main {
    private static final int SIZE = 15;
    public static void main(String[] args) {
        my.edu.Netology.lesson1.cw.w1.Main mainW1 = new my.edu.Netology.lesson1.cw.w1.Main();

        Integer[] randomArray = new RandomArray().setRandomIntegerArray(SIZE);
        mainW1.myPrintArray(randomArray);

        Integer maxEl = getMaxElement(randomArray);
        int maxIndex = getMaxIndex(randomArray);

        System.out.println(maxEl);
        System.out.println(maxIndex);
    }

    private static int getMaxIndex(Integer[] randomArray) {
        int maxIndex = 0;
        int max = randomArray[0];

        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                maxIndex = i;
                max = randomArray[i];
            }
        }

        return maxIndex;
    }

    private static Integer getMaxElement(Integer[] randomArray) {
        int max = randomArray[0];

        for (int i : randomArray) {
            if (max < i)
                max = i;
        }

        return max;
    }
}
