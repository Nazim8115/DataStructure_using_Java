import java.util.Arrays;

public class Sort01 {
    public static void sortZeroOne(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1) {
                if (arr[j] != 1) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j--;

            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 0, 1 };
        System.out.println(Arrays.toString(arr));
        sortZeroOne(arr);
        System.out.println(Arrays.toString(arr));

    }
}
