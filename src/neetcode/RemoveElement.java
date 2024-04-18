package neetcode;

import algoprep.ArrayUtility;

public class RemoveElement {
    public static void main(String[] args) {
       int nonTargetValues = removeElement(new int[] {1,4,6,2,1,3,1,5,6,1,3,1,9,1,3,1,5,1}, 1);
        System.out.println(nonTargetValues);
    }
    // Here k represents the same input array where we can place the non-target elements (We can consider it as second array)

    // Solution 1: Time Complexity O(n) Space Complexity O(1)
    // We are trying to move the non-target elements to the right.
    // Whenever we find the non-target value we place right from the start of the array that is represented by K.
    // The whole logic is we are treating the same input array as second array and inserting the elements.

    // Step1: Initialize K = 0 which increments whenever there is non-target value
    // Step2: Take each element and check if it is equal to target.
    // Step3: If it is not equal to target place it in the K position in the array and then increment K.
    // Step4: Return K count.

    private static int removeElement(int[] arr, int target) {

        int length = arr.length;
        int k = 0;

        for (int i = 0; i < length; i++) {
            if(arr[i] != target){
                arr[k] = arr[i];
                k += 1;
            }
        }
        return k;
    }
}
