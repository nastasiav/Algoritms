package my.edu.Netology.lesson1.cw.w4;

public class Main {;
    public static void main(String[] args) {
        my.edu.Netology.lesson1.cw.w1.Main mainW1 = new my.edu.Netology.lesson1.cw.w1.Main();

        Integer[] randomArray = {10, 12, 14, 13, 11, 1, 6, 12, 5, 5};

        mainW1.myPrintArray(randomArray);

        int count = calculateNotUniqElements(randomArray);
        System.out.println("count: " + count);
    }

    private static int calculateNotUniqElements(Integer[] randomArray) {
        int count = 0;

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = i + 1; j < randomArray.length; j++) {
                if (randomArray[i] == randomArray[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
