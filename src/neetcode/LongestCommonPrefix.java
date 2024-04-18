package neetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(findCommonPrefix(new String[] {"ab", "a"}));
    }

    // Learnings from this problem implementation
    // Do the proper dry run while solving.
    // Do proper conditional analysis while solving.

    //Solution 1: Time Complexity O(n) and space complexity O(1)
    //Step:1 take the fist string in the string array
    //Step:2 take each character in first string is equal to each character in the rest of the array strings.
    //Step:3 Also check if length of the current String is greater than or equal index.
    //Step:4 If both of above two conditions are true form the prefix String otherwise return the string formed so far.
    private static String findCommonPrefix(String[] inputArr) {

//        StringBuilder resultStr = new StringBuilder();
//
//        String firstStr = inputArr[0];
//        int strlen = firstStr.length();
//        int arrLen = inputArr.length;
//
//        if(inputArr.length == 0 || firstStr.isEmpty()){
//            return "";
//        }
//        for (int i = 0; i < strlen; i++) {
//            for (int j = 1; j <= arrLen -1; j++) {
//                String currString = inputArr[j];
//                 if(!(i <= currString.length() - 1 ) || currString.charAt(i) != firstStr.charAt(i)){
//                    return resultStr.toString();
//                 }
//            }
//            resultStr.append(firstStr.charAt(i));
//        }
//        return resultStr.toString();

        // Solution:2
        // TimeComplexity: O(n), Space Complexity: O(1)
        // Step1: Consider the first string in the array as prefix
        // Step2: Create a loop to loop from the second String in the array
        // Step3: Create a inner while loop with a condition that if current String starts with prefix.
        // Step4: if current String starts with prefix is true go to next iteration
        // Step5: If current String doesn't start with prefix get into
                //while loop and update prefix by removing its last character.
        // Step6: After removing last character check if the prefix is empty return empty prefix.
        if (inputArr == null || inputArr.length == 0) {
            return "";
        }
        String prefix = inputArr[0];
        for (int i = 1; i < inputArr.length; i++) {
            while (!inputArr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
