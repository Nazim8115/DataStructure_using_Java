package String;

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
        boolean res = false;
        String rev = reverseString(str); // reverse string with using user defined function
        if (rev.equals(str)) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        // String str = "my name is khan and i am a software engineer";
        // printEvenLengthWord(str);
        // String res = insertString(str, -1, "hello");
        // System.out.println(res);

        // System.out.println(reverseString("nazim"));
        System.out.println(checkPalindrome("papa"));

    }
}