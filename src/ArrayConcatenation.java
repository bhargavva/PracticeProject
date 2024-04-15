public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 3, 8, 9};
        int[] resultArray = getConcatenation(numbers, 3);

        for (int i :
                resultArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] getConcatenation(int[] nums, int repetition) {

        int inputArraySize = nums.length;

        int[] resultArray = new int[inputArraySize * repetition];

        // In this solution the elements are inserted at index in result array in the following fashion
        // if arraysize = 5, 0,5,10 ---> 1,6,11 ---> 2,7,12 and so on.
//        for (int i = 0; i < inputArraySize; i++) {
//            for (int j = 0; j < repetition; j++) {
//                resultArray[i + j * inputArraySize] = nums[i];
//            }
//        }

        // In the following solution the elements are inserted straight forward
        // For repetition = 3 and for inputArraySize = 5;
        // rep1 - 0,1,2,3,4
        // rep2 - 5,6,7,8,9
        // rep3 - 10,11,12,13,14
        int k = 0;
        for (int i = 1; i <= repetition; i++) {
            for (int j = 0; j < inputArraySize; j++) {
                resultArray[k] = nums[j];
                k++;
            }
        }

        return resultArray;
    }
}
