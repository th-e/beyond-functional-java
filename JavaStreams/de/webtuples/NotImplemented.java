

package de.webtuples;
import java.util.List;

public class NotImplemented {
    public static void main(final String[] args) {
        final List<String> strings = List.of("a", "b", "c", "a", "b", "c");
        System.out.println(magic(strings));
    }

    private static String magic(final List<String> strings) {
        throw new UnsupportedOperationException();
    }
}