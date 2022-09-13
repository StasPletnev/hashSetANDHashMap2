import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> set = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
        return set.contains(word);
    }

    public String getText() {
        return text;
    }
}
