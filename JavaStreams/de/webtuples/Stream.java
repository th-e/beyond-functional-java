

package de.webtuples;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(final String[] args) {
        final List<String> strings = List.of("a", "b", "a", "b", "a", "c");
        System.out.println(magic(strings));
    }

    private static String magic(final List<String> strings) {
        return strings
          .stream()
          .map(String::toUpperCase)
          .distinct()
          .limit(3)
          .collect(Collectors.joining(", "));
    }
}