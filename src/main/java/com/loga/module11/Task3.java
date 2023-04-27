package com.loga.module11;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Task3 {

        public static String sortNumbers(String[] arr) {
            return Arrays.stream(arr)
                    .flatMap(s -> Arrays.stream(s.split(",")))
                    .map(String::trim)
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(", "));
        }

    public static void main(String[] args) {

            String[] arr = {"2, 1, 0", "3, 4"};
            String sortedNumbers = Task3.sortNumbers(arr);
            System.out.println(sortedNumbers);
        }
    }


