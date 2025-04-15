package data_structure.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstUniqueCharacter {
    public static void main(String [] args){

       System.out.println(firstUniqChar("lleetcode"));
        System.out.println(firstUniqCharUsingMap("LLeetCode"));
        System.out.println(firstUniqCharUsingStream("LLeetCode"));
    }
   static  public int firstUniqChar(String s) {
        int[] count = new int[26]; // assuming only lowercase letters

        // Step 1: Count each character
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        // Step 2: Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    static  public int firstUniqCharUsingMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    //Using Stream API
    public static int firstUniqCharUsingStream(String s) {
        Map<Character, Long> freqMap =    s.chars()
                 .mapToObj(c->(char)c)
                         .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting()));


        return IntStream.range(0, s.length())
                .filter(i -> freqMap.get(s.charAt(i)) == 1)
                .findFirst()
                .orElse(-1);
    }

}
