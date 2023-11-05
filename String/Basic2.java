package String;

// ref: oracle java 
public class Basic2 {
    public static void main(String[] args) {
        // create string with the help character array ....
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String hello = new String(helloArray);
        System.out.println(hello);

        // Note : string class is immutable, so that once it is created a String object
        // cannot be changed.
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        // put original string inside tha tempchar array
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }
        // reverse array of chars...
        for (int i = 0; i < len; i++) {
            charArray[i] = tempCharArray[len - 1 - i];
        }
        System.out.println(tempCharArray);
        String reversepalindrome = new String(charArray);
        System.out.println(reversepalindrome);

    }
}
