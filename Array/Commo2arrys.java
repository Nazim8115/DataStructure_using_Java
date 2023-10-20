
// import java.util.HashSet;
import java.util.*;

public class Commo2arrys {
    public static HashSet<Integer> findcommon(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> res = new HashSet<Integer>();
        int arr1[] = { 10, 30, 60, 80, 565, 90, 80 };
        int arr2[] = { 77, 50, 737, 80, 56, 101, 80 };
        res = findcommon(arr1, arr2);
        System.out.println("common elements : " + res);

    }
}
