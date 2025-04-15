	package data_structure.string;

    import java.util.HashMap;
    import java.util.Map;

    public class Anagram {
		public static void main(String[] args) {
			System.out.println(isAnagram("abc","cab"));
            System.out.println(isAnagram2("abc").equals(isAnagram2("bac")));
		}
		public static boolean isAnagram(String s, String t) {
			if(s.length()!=t.length()) return false;
			int[] arr=new int[26];
			for(int i=0;i<s.length();i++){
				arr[s.charAt(i)-'a']++;
				arr[t.charAt(i)-'a']--;
			}
			for(int c:arr){
				if(c!=0) return false;
			}
			return true;
		}

        public static Map<Character, Integer> isAnagram2(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i=0;i<s.length();i++){
              map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            return map;


        }
	}
