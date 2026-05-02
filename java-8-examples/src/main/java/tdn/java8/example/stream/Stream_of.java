package tdn.java8.example.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Creating a stream from an array.
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Stream_of {

    public static void main(String[] args) {
        int theNumber = 15464;
        // convert the number to string and make a list of strings of a single character
        String[] stringArray = String.valueOf(theNumber).split("");
        Integer sumOfDigits = Stream.of(stringArray).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);
    }
}