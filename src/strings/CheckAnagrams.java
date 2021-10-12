package strings;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static void main(String[] args) {
        System.out.println(isAnagrams("Silent", "Listen"));
        System.out.println(isAnagrams("This is a string", "Is this a string"));
        System.out.println(isAnagrams("There", "Their"));
    }

    public static boolean isAnagrams(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        Map<Character, Integer> charAppearances = new HashMap<>();

        for (int i = 0; i < length1; i++) {
            char c = s1.charAt(i);
            int numOfAppearances = charAppearances.getOrDefault(c, 0);
            charAppearances.put(c, numOfAppearances + 1);
        }

        for (int i = 0; i < length2; i++) {
            char c = s2.charAt(i);
            if (!charAppearances.containsKey(c)) {
                return false;
            }
            charAppearances.put(c, charAppearances.get(c) - 1);
        }

        for (int cnt : charAppearances.values()) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }
}