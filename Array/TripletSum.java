public class TripletSum {
    public static int tripletSum(int arr[], int x) {
        int c = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int j2 = j + 1; j2 < arr.length; j2++) {
                    if (arr[i] + arr[j] + arr[j2] == x) {
                        c++;
                    }
                }
            }
        }
        return c;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int x = 12;
        int res = tripletSum(arr, x);
        System.out.println(res);

    }
}
