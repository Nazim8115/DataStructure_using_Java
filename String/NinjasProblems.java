package String;

public class NinjasProblems {
    // problem -1 count words of strings
    public static int countWords(String str) {
        if (str.length() > 0) {
            int count = 1;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            return count;

        }
        return 0;

    }

    public static void printAllSubstring(String str) {
        int l = str.length();
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcde";
        str = str.trim();
        String arr[] = str.split(" ");
        System.out.println(arr.length);
        // int res = countWords(str);

        // System.out.println(res);
        printAllSubstring(str);

    }
}
