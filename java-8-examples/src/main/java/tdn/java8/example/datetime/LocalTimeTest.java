package tdn.java8.example.datetime;

import java.time.LocalTime;

/**
 * <a href="https://www.baeldung.com/java-8-date-time-intro">Date Time Intro</a>
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html">Java docs</a>
 *
 * The Java 8 Date and Time API, primarily found in the java.time package, was introduced
 * to replace the legacy java.util.Date and java.util.Calendar classes. It provides an immutable,
 * thread-safe, and more intuitive framework for handling temporal data.
 *
 * Core Classes:
 * - LocalDate: Represents a date (year, month, day) without a time or time zone (e.g., 2024-04-29).
 * - LocalTime: Represents a time (hour, minute, second, nanoseconds) without a date or time zone.
 * - LocalDateTime: A combination of LocalDate and LocalTime representing a date-time without a time zone.
 * - ZonedDateTime: Represents a complete date-time with a time zone (e.g., 2024-04-29T10:15:30+01:00[Europe/Paris]).
 * - Instant: Represents a single point on the timeline, typically used for machine timestamps in UTC.
 *
 * Intervals and Units
 * - Period: Measures date-based amounts of time in years, months, and days.
 * - Duration: Measures time-based amounts of time in seconds and nanoseconds.
 * - ChronoUnit: An enum used to represent units of time, such as DAYS, WEEKS, or YEARS, for use in calculations.
 */
public class LocalTimeTest {

    public static void main(String[] args) {

        // The java.time.LocalTime class represents a time of day (hh:mm:ss.nnn) without a date or time zone.
        // An instance of current date can be created from the system clock:
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        // Operations
        System.out.println("10 seconds later: " + time.plusSeconds(10));
        System.out.println("10 hours later: " + time.plusHours(10));
        System.out.println("10 minutes earlier: " + time.minusMinutes(10));
        System.out.println("Current time withMinute(10): " + time.withMinute(10));
        System.out.println("Current time before 10 minutes earlier?: " + time.isBefore(time.minusMinutes(10)));
        System.out.println("Current time after 10 minutes earlier?: " + time.isAfter(time.minusMinutes(10)));

        // We can get the LocalTime representing a specific hour, minutes and second by using
        // the 'of' method or the 'parse' method.
        LocalTime ofTime = LocalTime.of(14, 30, 11); // 2:30:11 PM
        LocalTime parseTime = LocalTime.parse("06:30");// 06:30 - no second

        System.out.println("LocalTime.of: " + ofTime);
        System.out.println("LocalTime.parse: " + parseTime);
    }
}