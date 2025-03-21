package my.edu.ya.handbook.ch3.task31;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = changingCount(scanner.nextInt());
        System.out.println(x);
    }

    public static int changingCount(int n) {
        // P(n) = n!
        if (n == 1)
            return 1;
        return n * changingCount(n - 1);
    }
}
