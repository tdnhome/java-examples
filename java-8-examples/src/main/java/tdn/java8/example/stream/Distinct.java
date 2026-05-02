package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Remove duplicate elements from a list.
 * Use: list.stream().distinct().collect(Collectors.toList())
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Distinct {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueStrings = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStrings);
    }
}