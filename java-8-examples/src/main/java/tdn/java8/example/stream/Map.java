package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream.map(): One-to-One Transformation
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Map {

    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        // Transform list of words to list of word's length.
        // stream.map(method-reference)
        List<Integer> lengthList = Arrays.stream(str.split(" "))
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Length of String: stream.map(method-reference):");
        System.out.println(lengthList );

        // Transform list of words to list of word's length.
        // stream.map(lambda)
        List<Integer> lengthList2 = Arrays.stream(str.split(" "))
                .map(word -> word.length())
                .collect(Collectors.toList());
        System.out.println("Length of String: stream.map(lambda):");
        System.out.println(lengthList2 );

        // Reverse each word of a string.
        // stream.map(lambda)
        String reversedStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        System.out.println("Reversed String: stream.map.(lambda):");
        System.out.println(reversedStr);
    }
}