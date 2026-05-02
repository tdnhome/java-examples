package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Merge two unsorted arrays into single sorted array using Java 8 streams.
 * Use: IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray()
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Concat {

    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 1, 5};
        int[] b = new int[]{8, 3, 9, 5, 2};

        System.out.println("Sorted:");
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        System.out.println("Sorted distinct:");
        int[] d = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(d));

    }
}