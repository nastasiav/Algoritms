package my.edu.groc.book.ch3.w2;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int i) {
        if (i == 1) return i;
        return  i * factorial(i - 1);
    }
}
