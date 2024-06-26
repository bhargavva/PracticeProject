package neetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t)); // Output: true
    }

    public static boolean isAnagram(String s, String t) {
        // If the lengths of the strings are different, they can't be anagrams

        // Check if length of both string are same or not
        if (s.length() != t.length())
            return false;
        // Create two has maps and map the characters in each string into them.
        Map<Character, Integer> sHashMap = new HashMap<>();
        Map<Character, Integer> tHashMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sHashMap.put(c, sHashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            tHashMap.put(c, tHashMap.getOrDefault(c, 0) + 1);
        }

        // Checking if same characters with same quantity are there in hashmap.
        // This will check both the keys and values.
        return sHashMap.equals(tHashMap);
    }

}
