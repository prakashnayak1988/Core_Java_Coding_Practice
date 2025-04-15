package data_structure.string;

public class StrStrImplemenataion {
    public static void main(String[] args) {
        String str = "Hellollkll";
        String subStr = "ll";
        int index = str.indexOf(subStr);
        System.out.println(index);
        int index1=strStr("Hello", "ll");
        System.out.println(index1);
        int index2=strStr("", "ll");
        System.out.println(index2);
        int index3=strStr("ll", "");
        System.out.println(index3);
    }

    public  static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;

    }
}
