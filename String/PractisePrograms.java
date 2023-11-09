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

    public static void main(String[] args) {
        String str = "my name is khan and i am a software engineer";
        // printEvenLengthWord(str);
        String res = insertString(str, -1, "hello");
        System.out.println(res);

    }
}