package algoprep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyQueries {
    public static void main(String[] args) {
        int[] inputArray = ArrayUtility.inputArray();
        int[] inquiryArray = ArrayUtility.inputArray();

        findFrequency(inputArray, inquiryArray);
    }
    public static void findFrequency(int[] inputArray, int[] inquiryArray){

        Map<Integer, Integer> arrHasMap = new HashMap<>();
        for (int i : inputArray) {
            arrHasMap.put(i, arrHasMap.getOrDefault(i, 0) + 1);
        }
        System.out.println(arrHasMap);
        // Check each element in the inquiry array if it presents in hashmap
        // If the element is present in the hashmap print the corresponding frequency
        // If the element not present print zero.
        for (int i:
             inquiryArray) {
            if(arrHasMap.containsKey(i)){
                System.out.println(arrHasMap.get(i));
            } else {
                System.out.println(0);
            }
        }
    }
}
