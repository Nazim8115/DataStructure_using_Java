package String;

public class SubstringCheck {
    public static boolean isSubstring(String str, String sub) {
        return str.contains(sub);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String substring = "World";
        boolean isSub = isSubstring(input, substring);
        System.out.println("Is '" + substring + "' a substring? " + isSub);
    }
}
