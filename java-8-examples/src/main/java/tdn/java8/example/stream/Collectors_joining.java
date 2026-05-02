package tdn.java8.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Joining: Concatenates all elements into a single string without any separators.
 * Use: list.stream().collect(Collectors.joining(Predicate)
 * <a href="https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/">Java 8 Streaming</a>
 * <a href="https://github.com/BafS/Java8-CheatSheet">Java 8 CheatSheet</a>
 */
public class Collectors_joining {

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);

        // joining(): Concatenates all elements into a single string without any separators.
        System.out.println(Stream.of("A", "B").collect(Collectors.joining())); // "AB"

        // joining(CharSequence delimiter): Separates each element with the specified delimiter.
        System.out.println(Stream.of("A", "B").collect(Collectors.joining("-"))); // "A-B"

        // joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix):
        // Adds a delimiter between elements, plus a specific prefix at the start and a suffix at the end.
        System.out.println(Stream.of("A", "B").collect(Collectors.joining(", ", "[", "]"))); // "[A, B]"
    }
}