package neetcode;

import java.util.HashMap;
import java.util.Map;

public class Subsequence {
    public static void main(String[] args) {
        boolean result = isSubsequence("abc", "ahbgdc");
        System.out.println(result);
    }

    private static boolean isSubsequence(String s, String t) {

        // Solution 1: Two pointer approach
        // TimeComplexity: O(n), Space Complexity(1)
        // Step1: take two variable i, j both points the characters in the string s & t respectively.
        // Step2: compare first characters in both string points by i and j
        // Step3: If both are same increment i & j to point to the next characters in respective Strings.
        // Step4: If both are not same don't increment i and increment only j.
        // Step5: Finally if the count of i = length of s then true otherwise false.
        if(s.isEmpty()){
            return true;
        }
        int len1 = s.length(); //one time operation need to do outside.
        int len2 = t.length();
        int i = 0;
        int j = 0;
        while (i < len1 && j < len2){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return i == len1;
    }
}
