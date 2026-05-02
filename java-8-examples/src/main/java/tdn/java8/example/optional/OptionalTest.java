package tdn.java8.example.optional;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

/**
 * <a href="https://www.baeldung.com/java-8-date-time-intro">Date Time</a>
 *
 * The java.util.Optional<T> class is a container object used to represent the presence or
 * absence of a value, helping to avoid NullPointerException.
 * - It facilitates the handling of potentially absent values in a more concise and expressive manner.
 * - It provides a container-like structure to wrap objects, indicating the possibility of a value being present or absent.
 * - Its primary purpose is to provide a safer alternative to handling null values, thereby reducing the risk of
 *   NullPointerException. By explicitly acknowledging the possibility of an absent value, Optional encourages
 *   developers to write more robust and error-resistant code.
 */
public class OptionalTest {

    public static void main(String[] args) {

        /* 1. Optional.of(T value):
              Creates an Optional object containing a non-null value.
              Throws: NullPointerException if the value provided is null.
         */
        String name = "John Doe";
        Optional<String> optionalName = Optional.of(name);
        System.out.println("Optional Name: " + optionalName);

        /* 2. Optional.ofNullable(T value):
              Creates an Optional object containing the specified value.
              The value can be null, in that case, the Optional will be empty.
         */
        String city = null;
        Optional<String> optionalCity = Optional.ofNullable(city);
        System.out.println("Optional City: " + optionalCity);

        /* 3. Optional.empty():
              Creates an empty Optional object with no value/null value.
         */
        Optional<String> optionalEmail = Optional.empty();
        System.out.println("Empty Optional Email: " + optionalEmail);

        /* 5. boolean isPresent():
              Returns true if the Optional contains a non-null value, otherwise returns false.
         */
        name = null;
        optionalName = Optional.ofNullable(name);
        if (optionalName.isPresent()) {
            System.out.println("Name: " + optionalName.get());
        } else {
            System.out.println("Name: not found");
        }

        /* 6. T get():
              Returns the value wrapped by the Optional if present.
              Throws: NoSuchElementException if the Optional is empty.
         */
        optionalName = Optional.of("John Doe");
        name = optionalName.get();
        System.out.println("Name: " + name);

        /* 7. T orElse(T defaultValue):
              Returns the value wrapped by the Optional if present.
              Returns: defaultValue if the Optional is empty.
         */
        optionalCity = Optional.empty();
        city = optionalCity.orElse("Unknown City");
        System.out.println("City: " + city);

        /* 8. T orElseGet(Supplier<? extends T> supplier):
              Returns the value wrapped by the Optional if present.
              Invokes the supplier function to provide an alternative value if the Optional is empty.
         */
        optionalEmail = Optional.empty();
        String email = optionalEmail.orElseGet(() -> "abc@def.com");
        System.out.println("Email: " + email);

        /* 9. T orElseThrow(Supplier<? extends X> exceptionSupplier):
              Returns the value wrapped by the Optional if present.
              Throws an exception produced by the exceptionSupplier if the Optional is empty.
         */
        try {
            optionalName = Optional.empty();
            name = optionalName.orElseThrow(() -> new IllegalArgumentException("Name is absent"));
            System.out.println("Name: " + name);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        /* 10. void ifPresent(Consumer<? super T> consumer):
             Executes the specified consumer function with the value wrapped by the Optional if present.
         */
        Optional<String> optionalPhone = Optional.of("(123) 456-7890");
        optionalPhone.ifPresent(phone -> System.out.println("Phone: " + phone));

        /*
           More realistic example
         */
        System.out.println("Student: " + getStudentName("Ben")); // normal case
        System.out.println("Student: " + getStudentName(null));  // null case, no NPE
    }

    /**
     * Wrap method retuning Optional
     */
    private static Optional<String> getStudentName(String s) {
        return Optional.ofNullable(fetchStudent(s));
    }

    /**
     * Original method
     */
    private static String fetchStudent(String s) {
        return s;
    }
}