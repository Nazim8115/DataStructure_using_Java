/*
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    First line of each test case or query contains an integer 'N' representing the size of the first array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.

    Third line contains an integer 'X'.

    Example-1 
    1
    9
    1 3 6 2 5 4 3 2 4
    7

    res -> 7

 */

import java.util.Scanner;

public class PairSum {
    public static int pairSum(int[] arr, int x) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    res++;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int result = pairSum(arr, x);
        System.out.println(result);
        sc.close();

    }

}
