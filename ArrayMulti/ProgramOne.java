package ArrayMulti;

import java.util.Arrays;

public class ProgramOne {
    public static void main(String[] args) {
        // Different Ways to initialize the array ..
        int arr[][] = { { 10, 20, 30 }, { 40, 50, 60 } };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
