package sorting;

public class AnagramCheck {

    public static void main(String[] args) {

        String s = "abc";
        String t = "cba";
        System.out.println(checkAnagram(s, t));
    }
    //First Approach
    static boolean checkAnagram(String s, String t) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    //Second Approach

}
