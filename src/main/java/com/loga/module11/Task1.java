package com.loga.module11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static String oddIndexedNames(List<String> names) {


        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Stepan", "Mark", "Marta", "Vasyl");
        String oddIndexedNames = Task1.oddIndexedNames(names);
        System.out.println(oddIndexedNames);

    }
}
