package tdn.java8.example.stream;

import java.util.stream.Stream;

/**
 * Given an integer, find sum of its digits.
 * Use: list.stream().mapToInt
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Collectors_mapToInt {

    public static void main(String[] args) {
        int theNumber = 15464;
        Integer sumOfDigits = Stream.of(String.valueOf(theNumber).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sumOfDigits);
    }
}