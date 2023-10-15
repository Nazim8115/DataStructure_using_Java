import java.util.Scanner;

public class FindValue {
    public static boolean isValue(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value : ");
        int value = sc.nextInt();
        System.out.println(isValue(arr, value));
        sc.close();
    }
}
