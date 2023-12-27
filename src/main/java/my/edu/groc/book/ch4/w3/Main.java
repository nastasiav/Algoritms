package my.edu.groc.book.ch4.w3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxInt(new int[]{1, 5, 100, 25, 16, 1}));
    }

    private static int maxInt(int[] ints) {
        if (ints.length == 2)
            return Math.max(ints[0], ints[1]);

        return Math.max(ints[0],maxInt(Arrays.copyOfRange(ints, 1, ints.length)));
    }
}
