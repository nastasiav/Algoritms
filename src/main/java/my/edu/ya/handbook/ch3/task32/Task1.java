package my.edu.ya.handbook.ch3.task32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Inter> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int k = sc.nextInt();
            list.add(new Inter(l, k));
        }

        printList(list);
    }

    private static void printList(List<Inter> list) {
        for (Inter i : list) {
            System.out.println("[" + i.getL() + "," + i.getK() + "]");
        }
    }

    private static class Inter {
        private int l;
        private int k;

        public Inter(int l, int k) {
            this.l = l;
            this.k = k;
        }

        public int getL() {
            return l;
        }

        public void setL(int l) {
            this.l = l;
        }

        public int getK() {
            return k;
        }

        public void setK(int k) {
            this.k = k;
        }
    }
}
