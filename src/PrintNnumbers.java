public class PrintNnumbers {
    public static void main(String[] args) {
        printNnums(6);
    }

    private static void printNnums(int n) {
        if(n == 1){
            System.out.println(1);
            return;
        }
        printNnums(n-1);
        System.out.println(n);
    }
}
