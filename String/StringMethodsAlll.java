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

        sc.close();

    }
}
