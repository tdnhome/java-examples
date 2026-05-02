package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of integers, find maximum and minimum of those numbers.
 * Use: list.stream().max(Comparator)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class MinMax {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(56, 15, 24, 75, 31, 99, 0);

        int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum Element : " + min);

        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum Element : " + max);
    }
}