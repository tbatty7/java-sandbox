import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {

    static boolean isAnagram(String a, String b) {
        String[] aList = a.toLowerCase().split("");
        String[] bList = b.toLowerCase().split("");
        HashMap<String, Integer> chartForA = new HashMap<>();
        HashMap<String, Integer> chartForB = new HashMap<>();
        boolean result = false;
        for (String letter : aList) {
            addLetter(letter, chartForA);
        }
        for (String letter : bList) {
            addLetter(letter, chartForB);
        }
        for (String letter : aList) {
            if (chartForA.get(letter) == chartForB.get(letter))
                result = true;
        }
        return result;
    }

    private static void addLetter(String letter, Map<String, Integer> chart) {
        if (null == chart.get(letter)) {
            chart.put(letter, 1);
        } else {
            chart.put(letter, chart.get(letter) + 1);
        }
    }
}
