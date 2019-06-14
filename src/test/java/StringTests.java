import java.util.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringTests {
    String wordA;
    String wordB;

    @Before
    public void setUp() {
        wordA = "hello";
        wordB = "world";
    }

    @Test
    public void capitalizeFirstLetter() {
        String[] letters = wordA.split("");
        String firstLetter = letters[0].toUpperCase();
        String newWord = wordA.concat(firstLetter);
        String newWord2 = firstLetter.concat(wordA.substring(1));
        System.out.println(newWord);
        System.out.println(newWord2);
        System.out.println();
    }

    @Test
    public void capitalizeWord() {
        System.out.println(capitalizeWord("pretty"));
    }

    @Test
    public void addLengths() {
        System.out.println(wordA.length() + wordB.length());
    }

    @Test
    public void sortWordsAlphabetically() {
        assertTrue(is_WordA_First("albatross", "zebra"));

    }

    @Test
    public void substringsAndSorting() {
        String firstAndLast = getAlphabeticallyFirstAndLastSubstrings("welcometojava", 3);
        System.out.println(firstAndLast);
    }

    private String getAlphabeticallyFirstAndLastSubstrings(String word, int length) {
        List<String> substrings = new ArrayList<>();
        int letters = word.length();
        for (int i = 0; (i + length) <= letters; i++) {
                String substring = word.substring(i, i + length);
                System.out.println(substring);
                System.out.println((i +  length) + " < " + letters);
                substrings.add(substring);
        }
        System.out.println("Got past loop");
        Collections.sort(substrings);
        String firstWord = substrings.get(0);
        String lastWord = substrings.get(substrings.size() - 1);
        return firstWord + "\n" + lastWord;
    }

    private String capitalizeWord(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    private boolean is_WordA_First(String wordA, String wordB) {
        String words[] = {wordA,wordB};
        Arrays.sort(words);
        return words[0] == wordA;
    }
}
