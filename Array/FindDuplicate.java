import java.util.Scanner;

public class FindDuplicate {
    public static int duplicateNumber(int arr[]) {
        int i;
        int j;

        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    return arr[i];

                }
            }
        }
        return Integer.MAX_VALUE;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = duplicateNumber(arr);
        System.out.println(res);
        sc.close();

    }
}
