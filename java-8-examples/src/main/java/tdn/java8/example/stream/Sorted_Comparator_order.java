package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting.
 * Use: list.stream().sort(Comparator)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Sorted_Comparator_order {

    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89);

        System.out.println("Default order:");
        decimalList.stream().sorted().forEach(System.out::println);

        System.out.println("Nature order:");
        decimalList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        System.out.println("Reverse order:");
        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}