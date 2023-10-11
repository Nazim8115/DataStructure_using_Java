/**
 * FindIndex
 */
public class FindIndex {
    public static int findIndex(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 30, 50, 90 };
        int res = findIndex(arr, 150);
        System.out.println(res);
    }
}