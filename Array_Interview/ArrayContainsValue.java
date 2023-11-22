package Array_Interview;

/**
 * ArrayContainsValue
 * check a value present in the array or not
 */

public class ArrayContainsValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7, 90, 70, 65 };
        int toCheckValue = 70;

        // Method -1 using for loop is element presentor not
        boolean found = false;
        for (int number : arr) {
            if (number == toCheckValue) {
                found = true;
                break;
            }
        }

        System.out.println(found);

    }

}