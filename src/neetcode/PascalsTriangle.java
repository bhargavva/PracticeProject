package neetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        createPascalsArray(5);
    }

    private static void createPascalsArray(int N) {

        // Solution: 1 TimeComplexity: O(n^2) SpaceComplexity: O(n^2)
        // Step1: Create a 2D arrayList to store the pascal's triangle rows.
        // Step2: Assume an imaginary zeros on the left and right side of first element in the triangle.
        // Step3: Create a first row array with 1
        // Step4: Create a loop which iterates N number of times to fill pascal array
        // Step5: Create a temporary array by appending 0 both at beginning and at the end.
        // Step6: Loop through this temp array and create elements for each triangle rows.
        // Step7: Add this new row-array to the pascals triangle in each iteration.
        List<ArrayList<Integer>> pascalArr = new ArrayList<>(N);

        //Created first Element Array in the pascal Triangle
        ArrayList<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalArr.add(firstRow);

        // Create and add further Element Arrays to the pascal Triangle
        for (int i = 0; i < N-1; i++) {
            ArrayList<Integer> rowArray = new ArrayList<>();
            // Create the temporary array that help us to create pascal array row
            ArrayList<Integer> temp = new ArrayList<>(pascalArr.get(i));
            temp.add(0,0);
            temp.add(0);
            for (int j = 0; j < i+2; j++) {
                rowArray.add(temp.get(j) + temp.get(j+1));
            }
            pascalArr.add(rowArray);
        }
        System.out.println(pascalArr);
    }
}


























