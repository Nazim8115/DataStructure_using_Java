import java.util.Scanner;

public class Intersection2Arrays {
    public static void intersection(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 size and elements :");
        int n1 = sc.nextInt();
        int array1[] = new int[n1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter array 2 size and elements :");
        int n2 = sc.nextInt();
        int array2[] = new int[n2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        intersection(array1, array2);

    }
}
