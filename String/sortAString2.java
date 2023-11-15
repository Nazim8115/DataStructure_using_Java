package String;

import java.util.Arrays;

public class sortAString2 {
    public static String sortString(String inputString) {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public static void main(String[] args) {
        String inputString = "zya";
        String outputString = sortString(inputString);
        System.out.println(outputString);
    }

}
