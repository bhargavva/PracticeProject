package algoprep;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtility.inputArray();
        System.out.println(findNonRepeatingEle(inputArray));
    }

    private static int findNonRepeatingEle(int[] inputArray) {

        // Solution: 1
        // // TimeComplexity: O(n), Space Complexity(n)
        // Step1: Loop through the array and create a frequency hashmap
        // Step2: Loop through the HashMap keyset() and then check if any key has a value 1.
        // Step3: If a key has value 1 print that value as that is the Unique or Non-repeating element in Array.
        Map<Integer, Integer> arrHashMap = new HashMap<>();
        for (int i : inputArray) {
            arrHashMap.put(i, arrHashMap.getOrDefault(i, 0)+1);
        }

        for (int i : arrHashMap.keySet()) {
            if (arrHashMap.get(i) == 1) {
                System.out.println(i);
            }
        }

//        for (int i = 0; i < inputArray.length; i++) {
//            if(arrHashMap.get(inputArray[i]) == 1){
//                return inputArray[i];
//            }
//        }

        return -1;
    }
}
