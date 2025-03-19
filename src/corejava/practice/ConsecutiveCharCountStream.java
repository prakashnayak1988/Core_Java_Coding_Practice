package corejava.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsecutiveCharCountStream {
    public static String getConsecutiveCharCount(String str) {
        if (str == null || str.isEmpty()) return "";

        StringBuilder result = new StringBuilder();
        int[] count = {1};

        IntStream.range(0, str.length() - 1)
                .forEach(i -> {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        count[0]++;
                    } else {

                        if (count[0] > 1) {
                            result.append(count[0]);
                        }
                        result.append(str.charAt(i));
                        count[0] = 1; // Reset count
                    }
                });

        // Append last character

        if (count[0] > 1) {
            result.append(count[0]);
        }
        result.append(str.charAt(str.length() - 1));

        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "Football";
        String input2 = "aabbccdde";
        System.out.println(getConsecutiveCharCount(input1)); // Output: a3b2cda2
        System.out.println(getConsecutiveCharCount(input2)); // Output: a2b2c2d2e
    }
}
