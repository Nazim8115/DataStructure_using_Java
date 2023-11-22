package Array_Interview;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        // creating an array of integer
        Integer nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> numbersList = Arrays.asList(nums);
        System.out.println(numbersList);

    }
}
