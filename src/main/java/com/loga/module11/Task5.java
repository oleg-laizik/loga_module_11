package com.loga.module11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstArr = first.collect(Collectors.toList());
        List<T> secondArr = second.collect(Collectors.toList());
        long size =  Math.min(firstArr.size(), secondArr.size());
return Stream.concat(firstArr.parallelStream().limit(size), secondArr.parallelStream().limit(size).parallel());
    }
    public static void main(String[] args) {
        Stream<String> first = Stream.of("Ivan", "Stepan", "Andriy", "Marta");
        Stream<String> second = Stream.of("1", "2", "3");

        List<String> result = zip(first, second).collect(Collectors.toList());
        for (String s : result) {
            System.out.println(s);
        }
    }
}


