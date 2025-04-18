package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterIndex {

    public static void main(String[] args){
       String str="abcdabcz";
       System.out.println(firstUniqCharIndex(str.toCharArray()));
       System.out.println("Second Approach "+firstUniquApproach(str.toCharArray()));

    }

    static int firstUniqCharIndex(char[] arr){
      Map<Character,Integer> mapWithFrequency=new LinkedHashMap<>();
        for(char c:arr){
            mapWithFrequency.put(c, mapWithFrequency.getOrDefault(c,0)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (mapWithFrequency.get(arr[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    // Optimized Approach
    static int firstUniquApproach(char[] chars){

        int[] freq = new int[26];// ASCII range
        // First pass: count frequency
        for (char ch : chars) {
            freq[ch -'a']++;
        }
        System.out.println(Arrays.toString(freq));

        // Second pass: find first unique
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i]-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
