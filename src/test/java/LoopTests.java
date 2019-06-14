import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LoopTests {
    @Test
    public void forLoopTest() {
        Map<Integer, String> myMap = new HashMap<>();
        for (int i = 0; !myMap.containsKey(i);) {
            System.out.println(i);
            System.out.println(5^i);

            int b = 5;
            double pow = Math.pow(2, 5);
            int power = 1<<3;
            System.out.println("Number is " + power);
            myMap.put(i, "Hello");
        }
    }
}
