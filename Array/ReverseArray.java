import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 30, 50, 30, 23, 80, 45 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Reverse Array :");
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
