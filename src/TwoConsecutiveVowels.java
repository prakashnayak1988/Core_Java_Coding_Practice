import java.util.HashSet;
import java.util.Set;

public class TwoConsecutiveVowels {
    public static void main(String[] args) {
        String[] names = {"orange", "orngea", "oraegea", "hello", "apple", "trngs", "eaoae"};

        for (String name : names) {
            if (isValidWord(name)) {
                System.out.println(name + " -> Valid word");
            } else {
                System.out.println(name + " -> INvalid word");
            }
        }
    }

    private static boolean isValidWord(String word) {
        String vowels = "aeiou";
        Set<String> seen = new HashSet<>();
        boolean foundConsecutiveVowels = false;
        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 1; i++) {
            char first = word.charAt(i);
            char second = word.charAt(i + 1);

            if (vowels.indexOf(first) >= 0 && vowels.indexOf(second) >= 0) {
                foundConsecutiveVowels = true;
                String pair = "" + first + second;
                String reversedPair = "" + second + first;

                // Check if either the pair or its reverse already exists
                if (seen.contains(pair) || seen.contains(reversedPair)) {
                    return false; // Repeated (normal or reversed) -> Invalid
                }
                seen.add(pair);
            }
        }

        // Must have at least one consecutive vowel pair to be valid
        return foundConsecutiveVowels;
    }
}
