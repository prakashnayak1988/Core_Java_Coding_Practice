package data_structure.string;

public class Palindrome {

    public static void main(String[] args) {
        isPalindrome("Prakash1232@#.,$");
        System.out.println(isPalindrome("ABCDCBA@#.,$"));
        System.out.println(isPalindrome("AABBCCDDCCBBAA@#.,$"));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.println("After removing all the non aphanumeric values  --> "+str);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) !=str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
       return true;
    }
}
