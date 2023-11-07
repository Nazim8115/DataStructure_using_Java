package String;

import java.util.Scanner;

public class StringMethodsAlll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // System.out.println("Original string : " + str);
        // charAt()
        // System.out.println(str.charAt(2));

        // codePointAt() => Returns the unicode of the character at the specified index
        // String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // System.out.println(str.codePointBefore(1));
        // for (int i = 0; i < alphabets.length(); i++) {
        // System.out.println(alphabets.codePointAt(i));
        // }
        // codePointCount() => Returns the number of Unicode values found in string
        // System.out.println(str.codePointCount(0, 6));

        // Compare two strings ignoring lower case and and upper case
        String str2 = sc.nextLine();
        // System.out.println(str.compareToIgnoreCase(str2));
        // concat => appends a string to the end of another string
        // String result = str.concat(str2);
        // System.out.println(result);

        // contains => checks wheather a string contains a sequence of characters
        System.out.println(str.contains(str2));

        sc.close();

    }
}
