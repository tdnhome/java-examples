package tdn.java8.example.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * <a href="https://www.baeldung.com/java-8-date-time-intro">Date Time</a>
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
public class LocalDateTest {

    public static void main(String[] args) {

        // The LocalDate represents a date in ISO format (yyyy-MM-dd) without time.
        // We can use it to store dates like birthdays and paydays.
        // An instance of current date can be created from the system clock:
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate tomorrow = LocalDate.now().plusDays(1);

        // We can get the LocalDate representing a specific day, month and year by using
        // the 'of' method or the 'parse' method.
        LocalDate lastSchoolDay = LocalDate.parse("2024-06-01");
        LocalDate birthDay = LocalDate.of(1985, 1, 23);

        // Using ChronoUnit
        System.out.println("Days to birth day: " + ChronoUnit.YEARS.between(birthDay, today));
        System.out.println("Days from yesterday: " + ChronoUnit.DAYS.between(yesterday, today));
        System.out.println("Days til tomorrow: " + ChronoUnit.DAYS.between(today, tomorrow));
        System.out.println("Days from last schoolday: " + ChronoUnit.DAYS.between(lastSchoolDay, today));
    }
}