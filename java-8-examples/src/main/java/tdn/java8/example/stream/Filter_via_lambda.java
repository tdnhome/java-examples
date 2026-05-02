package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Filtering: Given a list of integers, print the numbers which are multiples of 5.
 * Use: list.stream().filter(Predicate)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Filter_via_lambda {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
    }
}