package data_structure.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] example1 = {"flower", "flow", "flight"};
        String[] example2 = {"dog", "racecar", "car"};

        System.out.println("Example 1 Output: " + longestCommonPrefix(example1)); // "fl"
        System.out.println("Example 2 Output: " + longestCommonPrefix(example2)); // ""
    }
    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0)
    return "";

        // Loop through each character index of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Compare this char with the same index in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If index is out of bounds or char doesn’t match
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // All characters matched; return the whole first string
        return strs[0];
    }
}
