package SecondTask;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Задание (VI)
public class FindChar {
    public static char findFirstMostCommonChar(String inputStr) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : inputStr.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        char mostCommonChar = 0;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostCommonChar;
    }

    public static void main(String[] args) {
        String inputString = "xxxdddCCCAAA";
        char result = findFirstMostCommonChar(inputString);
        System.out.println("Первый наиболее часто повторяющийся символ: " + result);
    }
}