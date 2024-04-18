package algoprep.foundation.loops;

import java.util.Scanner;

public class PrintNnums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        printNnums(num);
    }

    private static void printNnums(int num) {
//        int i = 1;
//        while (i <= num){
//            System.out.print(i + " ");
//            i += 1;
//        }
//        System.out.println();
        for (int j = 1; j <= num; j++) {
            System.out.print(j + " ");
        }
    }
}
