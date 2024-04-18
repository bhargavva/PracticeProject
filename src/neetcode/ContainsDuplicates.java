package neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {
    public static void main(String[] args) {
        boolean result = hasDuplicates(new int[] {1,1,1,3,3,4,3,2,4,2});
        //boolean result = hasDuplicates(new int[] {1,2,3,4});
        System.out.println(result);
    }

    private static boolean hasDuplicates(int[] arr) {

        // Solution1: TimeComplexity: O(n), SpaceComplexity: O(n)
        // Use Hashmp and take each element in array and check if present in the Hashmap
        // If that element is not present add it
        // If that element is present already break and return true
        // If all the elements are unique return false.

//        Map<Integer, Integer> arrHashMap = new HashMap<>(); // O(n) // O(n)
//        for (int i :
//                arr) {
//            if(arrHashMap.containsKey(i)){
//                return true;
//            } else {
//                arrHashMap.put(i, 1);
//            }
//        }
//        return false;

        // Solution2: TimeComplexity: O(nlogn), SpaceComplexity: O(1)
        // Step1: Sort the array
        // Step2: Compare present element with the next element.
        // If the array size is N the loop repeates N - 1 times.
        // If the loop repeats N times we get array out of bounds exception.
        Arrays.sort(arr);
        //Solution: 2
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
