/**
 * FindMinimumAndMaximum
 */
public class FindMinimumAndMaximum {
    public static void findMaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Max:" + max + " Min:" + min);
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 50, 100, 900 };
        findMaxAndMin(arr);

    }
}