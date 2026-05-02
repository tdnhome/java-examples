package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of strings, sort them according to increasing order of their length
 * Use: list.stream().collect(Collectors.partitioningBy(Predicate)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
 public class Sorted_Comparator_comparing {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}