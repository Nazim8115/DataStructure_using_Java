package Array_Interview;

import java.util.Arrays;

public class AnagramsInArray {
    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    private static void findAnagramsInArray(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (areAnagrams(arr[i], arr[j])) {
                    System.out.println("Anagrams found: " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] stringArray = { "listen", "silent", "hello", "world", "act", "cat", "arm", "mary" }; // Example array

        System.out.println("Checking for anagrams in the array:");
        findAnagramsInArray(stringArray);
    }

}
