package my.edu.groc.book.ch4.w2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(counter(new int[]{0, 1, 2, 3, 4, 5}));
    }

    private static int counter(int[] ints) {
        if (ints.length == 0)
            return 0;
        return 1 + counter(Arrays.copyOfRange(ints, 1, ints.length));
    }
}
