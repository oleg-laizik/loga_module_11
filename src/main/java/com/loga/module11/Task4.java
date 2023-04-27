package com.loga.module11;
import java.util.stream.Stream;
public class Task4 {

        public static Stream<Long> randomNumbers(long a, long c, long m, long seed) {
            return Stream.iterate(seed, n -> (a * n + c) % m);
        }
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 123456789L;

        Stream<Long> randomStream = Task4.randomNumbers(a, c, m, seed);
        randomStream.limit(5).forEach(System.out::println);
    }
    }

