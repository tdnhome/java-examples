package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Find second-largest number in an integer array.
 * Use: list.stream().sort(Comparator).skip(1)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Skip {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 31, 89, 90);
        Integer secondLargestNumber = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargestNumber);
    }
}