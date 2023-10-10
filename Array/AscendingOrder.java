public class AscendingOrder {
    public static boolean Asending(int arr[]) {
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                return flag;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 9 };
        System.out.println(Asending(arr));

    }
}
