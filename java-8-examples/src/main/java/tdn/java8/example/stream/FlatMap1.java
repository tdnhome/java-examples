package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream.flatMap(): One-to-Many + Flattening
 * flatMap() is used when each element of the initial stream can produce multiple elements
 * (like a list or another stream). It "flattens" these nested structures into a single, top-level stream.
 */
public class FlatMap1 {

    public static void main(String[] args) {
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6)
        );

        List<Integer> flattenedList = nestedNumbers.stream()
                .flatMap(List::stream) // Converts each inner list into a stream and merges them
                .collect(Collectors.toList());
        System.out.println(flattenedList);
    }
}