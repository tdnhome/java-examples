package tdn.java8.example.stream.challenge;

import java.util.stream.Stream;

/**
 * Find first 10 Fibonacci numbers.
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Fibonacci {

    public static void main(String[] args) {

        //Stream.iterate(seed, func)
        // seed – the initial element
        // func – a function to be applied to the previous element to produce a new element

        // Steps:
        // 1. Stream.iterate: Creates an infinite stream starting with a seed value (e.g., new long[]{0, 1}).
        //    The lambda expression f -> new long[]{f[1], f[0] + f[1]} defines how the next pair is generated:
        //    the second number of the current pair becomes the first of the next, and their sum becomes the new second.
        // 2. limit(n): Truncates the infinite stream to provide only the desired number of elements.
        // 3. map(f -> f[0]): Since the stream contains arrays, this step extracts
        //    the actual Fibonacci number (the first element of each pair).
        // NOTE: BigInteger for Large Numbers: Because Fibonacci numbers grow exponentially, standard long values will
        //       overflow after 92 elements. To calculate larger sequences, use java.math.BigInteger instead.

        Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i + " "));
    }

}
