package algoprep.foundation.loops;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        primeOrNot(num);
    }
    // Step1: We find factors from 1 to N.
    // Step2: We then count the no of factors for N.
    // Step3: If no of factors are greater than 2 its Prime otherwise Not Prime.
    private static void primeOrNot(int num) {
        int count = 0;
        for (int i = 1; i <= num ; i++) {
            if(num % i == 0){
                count++;
                if(count > 2){
                    System.out.println(num +" Is Not Prime");
                    return;
                }
            }
        }
        System.out.println(num +" is Prime");
    }
}
