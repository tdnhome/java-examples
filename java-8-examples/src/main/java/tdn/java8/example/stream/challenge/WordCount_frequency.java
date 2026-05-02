package tdn.java8.example.stream.challenge;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Word frequency count.
 * Use:
 *   - String.split("\\s+"): Splits the string by one or more whitespace characters.
 *   - Arrays.stream(String[]): Create a stream from a array of string
 *   -
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class WordCount_frequency {

    public static void main(String[] args) {

        // Word frequency count:
        // groupingBy(Function<? super T, ? extends K> classifier,
        //           Collector<? super T, A, D> downstream)
        // - Function.identity(): Keeps the word itself as the key.
        // - Collectors.counting(): Tallies the occurrences for each key.
        String input = "java is great, java is simple, and java is powerful";
        Map<String, Long> frequencyMap = Arrays.stream(input.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println("Frequency count: " + frequencyMap);
    }
}
