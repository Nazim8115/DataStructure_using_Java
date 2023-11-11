package String;

import java.util.Arrays;

/**
 * PractisePrograms
 */
public class PractisePrograms {
    // question -1 print even length words only
    public static void printEvenLengthWord(String s) {
        for (String word : s.split(" ")) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
    // question -2 insert a string into another string

    public static String insertString(String originalString, int index, String stringToBeinserted) {
        String newString = originalString.substring(0, index + 1) + stringToBeinserted + " "
                + originalString.substring(index + 1);
        return newString;
    }

    // question -3 reverse the string
    public static String reverseString(String str) {
        // char arr[] = str.toCharArray();
        String newString = "";
        // int n = arr.length - 1;
        // for (int i = 0; i < arr.length; i++) {
        // newString += arr[n - i];

        // }
        int len = str.length() - 1;
        for (int i = len; i >= 0; i--) {
            newString += str.charAt(i);
        }

        return newString;
    }

    // question no 4 check palindrome

    public static boolean checkPalindrome(String str) {
        boolean res = true;
        // String rev = reverseString(str); // reverse string with using user defined
        // function
        // if (rev.equals(str)) {
        // res = true;
        // }

        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return res;
    }

    // question 5
    // Function to check whether two strings
    // are anagram of each other
    public static boolean areAnagram(char[] str1, char[] str2) {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not
        // same, then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    // prograam 6 print new line strig in java
    // Using System.lineSeparator() method
    public static void newline(String str1, String str2) {
        String newline = System.lineSeparator();
        System.out.println(str1 + newline + str2);
        // usig \n
        // System.out.println(str1 + '\n' + str2);
    }

    // program 7 add character to a string
    public static String addNewCharacter(String str, char ch) {
        return str += ch;
    }

    public static void main(String[] args) {
        String str = "my name is khan and i am a software engineer";
        // printEvenLengthWord(str);
        // String res = insertString(str, -1, "hello");
        // System.out.println(res);

        // System.out.println(reverseString("nazim"));
        // System.out.println(checkPalindrome("abba"));
        // char str1[] = { 't', 'e', 's', 't' };
        // char str2[] = { 'e', 't', 't', 's' };
        // System.out.println(areAnagram(str1, str2));

        // newline("samiksha", "awasthi");
        // System.out.println(addNewCharacter("nazim", 'K'));

        // iterate loop over string
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

    }
}