package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Sorting.
 * Use: list.stream().sort(lambda)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Sorted_lambda {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);
    }
}