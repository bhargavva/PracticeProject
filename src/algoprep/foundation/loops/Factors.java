package algoprep.foundation.loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        findFactors(N);
    }

    private static void findFactors(int num) {
//        int i = 1;
//        while (i <= num){
//            if(num % i == 0){
//                System.out.println(i);
//            }
//            i += 1;
//        }

        for (int i = 0; i <= num; i++) {
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
