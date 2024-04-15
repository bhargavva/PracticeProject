package algoprep;

import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        System.out.println(findDistinctCount(ArrayUtility.inputArray()));
    }

    private static int findDistinctCount(int[] inputArray) {
        HashSet<Integer> distinctList = new HashSet<>();
        for (int i :
                inputArray) {
            distinctList.add(i);
        }
        return distinctList.size();
    }
}
