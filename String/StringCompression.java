package String;

public class StringCompression {
    public static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressedString = compressString(input);
        System.out.println("Compressed String: " + compressedString);
    }
}
