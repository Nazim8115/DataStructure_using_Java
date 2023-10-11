// remove s specific value from an array

import java.util.Arrays;

public class Remove_value {
    public static void removeSpecificValue(int arr[], int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        int arr[] = { 30, 50, 60, 70, 90, 100 };
        System.out.println(Arrays.toString(arr));
        removeSpecificValue(arr, 4);
        System.out.println(Arrays.toString(arr));

    }
}
