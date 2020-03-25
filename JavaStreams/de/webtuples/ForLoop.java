

package de.webtuples;
import java.util.ArrayList;
import java.util.List;

public class ForLoop {
    public static void main(final String[] args) {
        final List<String> strings = List.of("a", "b", "a", "b", "a", "c");
        System.out.println(magic(strings));
    }

    private static String magic(final List<String> strings) {
        String result = "";
        List<String> temp = new ArrayList<>();
        for (String s: strings){
            if (!temp.contains(s.toUpperCase())){
                temp.add(s.toUpperCase());
            }
        }
        String separator = ", ";
        for (int i = 0; i < 3; i++){
            if (i != 0) result += separator;
            result += temp.get(i);
        }
        return result;
    }
}