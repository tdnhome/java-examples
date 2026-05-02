package tdn.java8.example.stream.challenge;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordCound_file {

    public static void main(String[] args) throws Exception {

        // Word count from file
        String dataFile = "/data.txt";
        URL resourceUrl = WordCound_file.class.getResource(dataFile);
        if (resourceUrl == null) {
            System.out.println(dataFile + " is not found from resource");
            return;
        }

        // Print content
        // Files.lines returns Stream<String>
        // try-with-resources ensures the stream is closed
        // Files.lines(Path.of(resourceUrl.toURI())).forEach(System.out::println);
        URL resource = WordCound_file.class.getClassLoader().getResource("example.txt");
        Path path = Paths.get(resource.toURI());

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(System.out::println);
        }

        // Word count
        // Note: a stream can only be operated once.
        // if we combined the code below on the above try, we will
        // get the exception: stream has already been operated upon or closed
        try (Stream<String> lines = Files.lines(path)) {
            long wordCount = lines.flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(word -> !word.isEmpty())
                    .count();
            System.out.println("Total words: " + wordCount);

        }
    }
}

