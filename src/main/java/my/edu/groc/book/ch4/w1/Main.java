package my.edu.groc.book.ch4.w1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4}));
        System.out.println(sumRec(new int[]{1, 2, 3, 4}));
    }

    private static int sumRec(int[] ints) {
        if (ints.length == 0) {
            return 0;
        }
        return ints[0] + sumRec(Arrays.copyOfRange(ints, 1, ints.length));
    }

    private static int sum(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }
}
