package tdn.java8.example.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find frequency of each character in a string.
 * <pre>
 * Implementation Steps
 * 1. string.chars(): Converts the string into an IntStream representing ASCII/Unicode values of each character.
 * 2. mapToObj(c -> (char) c): Maps the integer values back to Character objects.
 * 3. Collectors.groupingBy(): Groups the characters based on their identity.
 * 4. Collectors.counting(): Counts the occurrences within each group, returning a Map<Character, Long>.
 * </pre>
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Collectors_groupingBy {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";

        Map<Character, Long> charCountMap =
                inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
    }
}