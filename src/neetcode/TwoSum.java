package neetcode;

import algoprep.ArrayUtility;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] twoSumArr = findTwoSum(ArrayUtility.inputArray(), 9);

        System.out.println("array[0] :" + twoSumArr[0]);
        System.out.println("array[1] :" + twoSumArr[1]);
    }

    private static int[] findTwoSum(int[] arr, int target) {
        int[] twoSumArr = new int[2];
        Map<Integer, Integer> arrMap= new HashMap<>();

        // Solution: 1 bruteforce
        // TimeComplexity: O(n^2), SpaceComplexity: O(1)
        // Take an element at first index and sum with the rest of the array elements and compare with the target.
        // Once any sum matches with the target return those indexes otherwise return [0,0].

        // Solution : 2 usingHashMap
        // Take the first element in the array and subtract from target
        // Check if the difference amount present in Hashmap
        // If diff found in hashMap, get its index value and add it to result array along with the current index.
        // If diff not found add the current element to HasMap along with its index as value.
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            int diff = target - arr[i];
            if(arrMap.containsKey(diff)){
                twoSumArr[0] = arrMap.get(diff);
                twoSumArr[1] = i;
            } else {
                arrMap.put(arr[i], i);
            }
        }
        return twoSumArr;
    }
}
