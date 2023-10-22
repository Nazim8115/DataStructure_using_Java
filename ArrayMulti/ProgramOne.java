package ArrayMulti;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        // Different Ways to initialize the array ..
        int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 } };
        // different ways to print 2-D arrys

        // way- 1 convert array to string and print

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(Arrays.toString(arr[i]));
        // }

        // ways -2 Using for loop
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");

        // }
        // System.out.println();
        // }

        // take input from the users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int row = sc.nextInt();
        System.out.println("Enter Column:");
        int col = sc.nextInt();
        int array[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(i + ":" + j);
                array[i][j] = sc.nextInt();
            }
        }

    }
}
