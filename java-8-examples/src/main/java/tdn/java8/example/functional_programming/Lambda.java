package tdn.java8.example.functional_programming;

import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://www.w3schools.com/java/java_lambda.asp">Lambda</a>
 */
public class Lambda {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 8, 1);

        // Using a normal lambda
        numbers.forEach(n -> System.out.println(n));

        // Using method reference as lambda
        numbers.forEach(System.out::println);
    }
}
