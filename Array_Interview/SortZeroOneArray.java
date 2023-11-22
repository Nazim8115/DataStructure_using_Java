package Array_Interview;

import java.util.Arrays;

/**
 * SortZeroOneArray
 */
public class SortZeroOneArray {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 1, 1, 0, 1, 0 }; // Example array containing only 0s and 1s

        System.out.println("Original Array: " + Arrays.toString(nums));

        // Call the sortZeroOneArray method to sort the array
        sortZeroOneArray(nums);

        System.out.println("Array sorted with 0s first and then 1s: " + Arrays.toString(nums));
    }

    public static void sortZeroOneArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

}