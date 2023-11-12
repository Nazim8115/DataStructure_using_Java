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

    public static void main(String[] args) {
        String str = "my name";
        str = str.trim();
        String arr[] = str.split(" ");
        System.out.println(arr.length);
        // int res = countWords(str);

        // System.out.println(res);

    }
}
