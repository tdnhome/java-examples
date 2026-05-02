package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Range {

    public static void main(String[] args) {
        // range: inclusive lower bound, exclusive upper bound
        int sum = IntStream.range(1, 10).sum();
        System.out.println(sum);

        // rangeClosed: inclusive lower bound, inclusive upper bound
        sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum);

        // Print the first 10 event numbers
        // IntStream.boxed(): to convert Instream to Stream<Integer>
        List<Integer> intList = IntStream.rangeClosed(1, 10)
                .map(i -> i * 2)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(intList);

        // Reverse an integer arr
        // rangeClosed: inclusive lower bound, inclusive upper bound
        int[] arr = new int[] {5, 1, 7, 3, 9, 6};
        int[] reversedArray = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
        System.out.println(Arrays.toString(reversedArray));
    }
}