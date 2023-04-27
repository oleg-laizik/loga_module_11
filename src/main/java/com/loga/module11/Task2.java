package com.loga.module11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> sortAndUpperCase(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Stepan", "Mark", "Marta", "Vasyl");
        List<String> sortedAndUpperCasedNames = Task2.sortAndUpperCase(names);
        System.out.println(sortedAndUpperCasedNames);
    }

}


