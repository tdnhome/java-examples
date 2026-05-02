package tdn.java8.example.stream.challenge;

import java.util.Arrays;

/**
 * Word count.
 * Use: String.split("\\s+"): Splits the string by one or more whitespace characters.
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class WordCount_string {

    public static void main(String[] args) {

        // Word count
        String input = "java is great, java is simple, and java is powerful";
        long count = Arrays.stream(input.split("\\s+"))
                .count();
        System.out.println("Total words: " + count);
    }
}
