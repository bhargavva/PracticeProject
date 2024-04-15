package algoprep;

public class PrefixSum {
    public static void main(String[] args) {

        int[] resultArray = findPreFixSum(ArrayUtility.inputArray());
        for (int i :
                resultArray) {
            System.out.print(i + " ");
        }
    }
    // Using prefix sum we can create children times table
//    private static int[] findPreFixSum(int[] inputArray) {
//
//        // My Solution: replace the current index with the following
//        // sum = element at current index + Sum of all the elements at preceding indexes on the LHS (LeftPrefix)
//
//        // Step1: Take the LeftPrefix as sum as there are no elements before 0th index
//        // Step2: Then calculate the prefix for the current index.
//        // Step3: We store that newPrefix at the current index.
//        // Step4: Then we consider this newPrefix as LeftPrefix to calculate prefix for next element in next iteration
//
//        int length = inputArray.length;
//        int leftPrefix = 0;
//        for (int i = 0; i < length; i++) {
//            int newPrefix = leftPrefix + inputArray[i];
//            inputArray[i] = newPrefix;
//            leftPrefix = newPrefix;
//        }
//        return inputArray;
//    }

    private static int[] findPreFixSum(int[] inputArray) {

        // Solution2: replace the current index with the following
        // sum = element at current index + Sum of all the elements at preceding indexes on the LHS (LeftPrefix)

        // Step1: Create a Result Array
        // Step2: Assign the 0th index with first element from inputArray
        // Step3: Iterate from index 1 and calculate prefixSum for current index
        // Step4: currentIndexPrefixSum = previousIndexPrefixSum + elementAtCurrentIndex
        // Step5: Sore the calculated prefix in the current index
        // Step6: After all iterations return the resulted prefixSumArray.

        int length = inputArray.length;
        int[] prefixSumArr = new int[length];
        prefixSumArr[0] = inputArray[0];
        for (int i = 1; i < length; i++) {
            prefixSumArr[i] = prefixSumArr[i-1] + inputArray[i];
        }
        return prefixSumArr;
    }
}
