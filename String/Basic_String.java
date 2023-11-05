package String;

import java.util.Scanner;

public class Basic_String {
    public static void main(String[] args) {
        /*
         * A string is a sequence of characters. for example "hello" is a string
         * containing sequence of characters 'h','e','l','l','o' we have double quotes
         * to represent string in java...for exampls...
         */

        // String s = "java programing";
        // System.out.println(s);

        // methods of string
        // find length of the string
        // int le = s.length();
        // System.out.println(le);
        // find length witout lenth dunction

        // int l = 0;

        // for (char c : s.toCharArray()) {
        // l++;
        // }

        /* More about string input by use and other inbuilt methods */
        Scanner s = new Scanner(System.in);
        // String userinput = s.next();
        // System.out.println(userinput);
        // next() method in java used for reading the string ! next() can read the input
        // only till the space. for example my input is my name but its read only my

        /*
         * Nextline() reads input includig space between the words till end for example
         * input strean -- my name is nazim khan =>(its read till end
         * ) my name is nazim khan
         */

        // String userFullName = s.nextLine();
        // System.out.println(userFullName);
        // join java stirng
        String first = s.nextLine();
        String second = s.nextLine();
        // join with + opreator
        // String third = first + second;
        // System.out.println(third);
        // join with concat
        // String concat = first.concat(second);
        // System.out.println(concat);

        // compare two strings
        // System.err.println(first.compareTo(second)); // compare() return zero if both
        // string equal if not then if first
        // string greater positive value else negative value ...
        // qquals method ()
        System.out.println(first.equals(second)); // if strings are same then its return true else false...
        s.close();

    }
}
