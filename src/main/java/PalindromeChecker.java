public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        System.out.println("Start Palindrome checking");
        for (int i = 0; i < middleOf(word); i++) {
            char startLetter = word.charAt(i);
            char endLetter = word.charAt(word.length() - (1 + i));

            System.out.println(startLetter);
            System.out.println(endLetter);

            if (startLetter != endLetter)
                return false;
        }
        return true;
    }

    private static int middleOf(String word) {
        return word.length()/2;
    }
}
