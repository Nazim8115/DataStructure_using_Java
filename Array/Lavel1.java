/* Exercise -1 
Take 10 integer inputs from the user and store them in array .Now Copy all 
Elements in another array but in reverse order .....
*/

import java.util.Arrays;
import java.util.Scanner;

public class Lavel1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array is : " + Arrays.toString(arr));
        int reverseArray[] = new int[10];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArray[j] = arr[i];
            j++;
        }
        System.out.println("reverse array is :" + Arrays.toString(reverseArray));
        sc.close();

    }
}
