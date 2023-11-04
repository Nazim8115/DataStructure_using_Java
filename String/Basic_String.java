package String;

public class Basic_String {
    public static void main(String[] args) {
        // A string is a sequence of characters. for example "hello" is a string
        // containing sequence of characters 'h','e','l','l','o' we have double quotes
        // to represent string in java...for exampls...
        String s = "java programing";
        System.out.println(s);

        // methods of string
        // find length of the string
        int le = s.length();
        System.out.println(le);
        // find length witout lenth dunction

        int l = 0;

        for (char c : s.toCharArray()) {
            l++;
        }

    }
}
