package String;

import java.util.Scanner;

public class StringMethodsAlll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
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
        // String str2 = sc.nextLine();
        // System.out.println(str.compareToIgnoreCase(str2));
        // concat => appends a string to the end of another string
        // String result = str.concat(str2);
        // System.out.println(result);

        // contains => checks wheather a string contains a sequence of characters
        // System.out.println(str.contains(str2));

        // contentEquals() => Searches a string to find out if it contains the exact
        // same sequence of characters in the specified strng or StringBuffer
        // System.out.println(str.contentEquals(str2));

        // copyValueof() => the copyValueOf() method returns a string that represents
        // the characters of char array.
        // this mehtod return a new string array and copies the character into it.

        // char[] myStr1 = { 'H', 'e', 'l', 'l', 'o' };
        // String myStr2 = "";
        // myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        // System.out.println("Returned String: " + myStr2);

        // endsWith() => Checks wheater a string ends with the specified characters
        // System.out.println(str.endsWith(str2));

        // equals () => use for compares two strings,and return true if string are equal
        // Tip: Use the compareTo() method to compare two strings lexicographically.
        // System.out.println(str.equals(str2));

        // hashcode() => return hash code of a string
        // System.out.println(str.hashCode());

        // indexOf() return position of the first specified occurance --
        // System.out.println(str.indexOf(str2));
        // isempty() check weather a string isempty or not return true
        // System.out.println(str.isEmpty());

        // replace() => replace specified value if present return new string
        // String result = str.replace("nazim", "sumit");
        // System.out.println("new string is :" + result);

        // split() => split the string into an array of substring
        // String[] arr = str.split(",");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // startswith() =>
        String s = "nazimkhan ";
        System.out.println(s.substring(0, 5));// 0 included but 5 excluded...

        String newString = "java " + "programing";
        System.out.println(newString);

        sc.close();

    }
}
