import java.util.Scanner;

public class FindUnique {

    public static int findUniquelement(int arr[]) {
        int n = arr.length;
        int i;
        int j;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    j = j + 1;
                }
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (j == n) {
                break;
            }

        }
        return arr[i];

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int res = findUniquelement(arr);
        System.out.println(res);

    }
}
