public class ReplaceWithRightMax {
    public static void main(String[] args) {
       int[] resultArr = replaceWithRightMax(new int[] {5, 3, 6, 1, 2});
        for (int i :
                resultArr) {
            System.out.print(i + " ");
        }
    }

    private static int[] replaceWithRightMax(int[] arr) {
        int rightMax = -1;

        for (int i = arr.length-1; i >= 0; i--) {
            int newMax = Math.max(arr[i], rightMax);
            arr[i] = rightMax;
            rightMax = newMax;
        }

        return arr;
    }
}
