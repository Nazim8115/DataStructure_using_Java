package Array_Interview;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8 };
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        int missing = totalSum - sum;
        System.out.println("missing Number is : " + missing);

    }
}
