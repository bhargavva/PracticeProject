package algoprep.foundation.loops;

import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printDigitsReverse(num);
    }

    public static void printDigitsReverse(int num){
        if(num < 0){
            num *= -1;
        }
        while (num > 0){
            System.out.println(num % 10);
            num = num / 10;
        }
    }
}
