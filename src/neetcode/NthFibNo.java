package neetcode;

public class NthFibNo {

    public static void main(String[] args) {
        System.out.println(nthFibNo(3));
    }

    private static int nthFibNo(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int temp1 = nthFibNo(n-1);
        int temp2 = nthFibNo(n - 2);

        return temp1 + temp2;
    }
}
