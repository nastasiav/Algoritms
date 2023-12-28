package my.edu.groc.book.ch4.w4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(quickSort(Arrays.asList(10, 5, 2, 3))); // [2, 3, 5, 10]
    }

    private static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) return list;
        int i = list.get(0);
        List<Integer> lessList = list.stream().skip(1).filter(el -> el < i).toList();
        List<Integer> highList = list.stream().skip(1).filter(el -> el > i).toList();
        return Stream.of(quickSort(lessList).stream(), Stream.of(i), quickSort(highList).stream())
                .flatMap(Function.identity())
                .toList();
    }
}
