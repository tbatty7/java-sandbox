import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WordTests {

    @Test
    public void anagramCheckerTest() {
        assertTrue(AnagramChecker.isAnagram("hello", "olleh"));
        assertFalse(AnagramChecker.isAnagram("Hello", "Hellw"));
    }

    @Test
    public void isPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("abcdedcba"));
        assertFalse(PalindromeChecker.isPalindrome("asdffffff"));
    }

    @Test
    public void formattedSysoutTest() {
        System.out.printf("Hello %s--Oops!%n","World");
        System.out.printf("Hello %s!%n","World");
        System.out.printf("I'm %S   X%n","Battyman");
        System.out.printf("|%-20s| %n", "left-justified");
        System.out.printf("%10.5s%n%d%s%n", "Limiting Characters", 5000, " Another String");
        System.out.printf("%04d%n", 10);
        System.out.printf("|%-15s| %s |%n", "Items", "Amounts");
        System.out.printf("|%-15s| %04d    |%n","Item 1", 200);
        System.out.printf("|%-15s| %04d    |%n","Item 2", 48);
    }
}
