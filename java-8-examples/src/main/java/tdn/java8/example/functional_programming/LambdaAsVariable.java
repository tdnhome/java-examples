package tdn.java8.example.functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * <a href="https://www.w3schools.com/java/java_lambda.asp">Lambda</a>
 */
public class LambdaAsVariable {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 9, 8, 1);

        // Using normal lambda expression
        Consumer<Integer> method = (n) -> System.out.println(n);
        numbers.forEach(method);

        // Using method reference as lambda
        Consumer<Integer> method2 = System.out::println;
        numbers.forEach(method2);
    }
}
