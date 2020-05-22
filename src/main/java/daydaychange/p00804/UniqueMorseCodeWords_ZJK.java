package daydaychange.p00804;

import java.util.Arrays;
import java.util.stream.Stream;

public class UniqueMorseCodeWords_ZJK {

    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".",
                "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Long s = Arrays.asList(words).parallelStream().map(word -> {
            StringBuilder sb = new StringBuilder();
            for (char c: word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            return sb.toString();
        }).distinct().count();
        return s.intValue();
    }

}
