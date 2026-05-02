package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Find common elements between two arrays.
 * Use: list.stream().filter(Predicate)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Filter_via_methodReference {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94);
        list1.stream().filter(list2::contains).forEach(System.out::println);
    }
}