package algoprep;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");
        int size = input.nextInt();

        // Create new Array
        int[] inputArray = new  int[size];

        //Loop and accept input from user and fill the array
        int i=0;
        while (i < size){
            System.out.print("Please enter element no " + (i + 1) + ": ");
            inputArray[i] = input.nextInt();
            i++;
        }

        return inputArray;
    }
}
