package my.edu.ya.handbook.ch3.task31;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println(counterWith(n, k));
    }

    private static int counterWith(int n, int k) {
        return fact(k + n - 1) / (fact(n - 1) * fact(k));
    }

    private static int fact(int x) {
        if (x <= 1)
            return 1;
        return x * fact(x - 1);
    }
}
