package my.edu.ya.handbook.ch3.task31;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(counting(n, k));
    }

    private static int counting(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static int factorial(int x) {
        if (x <= 1)
            return 1;
        return x * factorial(x - 1);
    }
}
