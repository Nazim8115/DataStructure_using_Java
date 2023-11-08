package String;

/**
 * PractisePrograms
 */
public class PractisePrograms {
    public static void printEvenLengthWord(String s) {
        for (String word : s.split(" ")) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String str = "my name is khan and i am a software engineer";
        printEvenLengthWord(str);

    }
}