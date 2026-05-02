package tdn.java8.example.stream;

import java.util.Arrays;

/**
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Aggregation_functions {

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5};

        double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("average = " + average);

        long count = Arrays.stream(a).count();
        System.out.println("count = " + count);

        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("min = " + min);

        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("max = " + max);

        int sum = Arrays.stream(a).sum();
        System.out.println("sum = " + sum);
    }
}