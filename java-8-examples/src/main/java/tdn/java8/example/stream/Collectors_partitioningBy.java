package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given a list of integers, separate odd and even numbers.
 * Use: list.stream().collect(Collectors.partitioningBy(Predicate)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Collectors_partitioningBy {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

        Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();

        for (Entry<Boolean, List<Integer>> entry : entrySet) {
            System.out.println("--------------");

            if (entry.getKey()) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list) {
                System.out.println(i);
            }
        }
    }
}
