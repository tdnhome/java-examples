package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of integers, get three maximum numbers and three minimum numbers.
 * Use: list.stream().sorted().limit(3)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Limit {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        //3 minimum Numbers
        System.out.println("-----------------");
        System.out.println("Minimum 3 Numbers");
        System.out.println("-----------------");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        //3 Maximum Numbers
        System.out.println("-----------------");
        System.out.println("Maximum 3 Numbers");
        System.out.println("-----------------");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}