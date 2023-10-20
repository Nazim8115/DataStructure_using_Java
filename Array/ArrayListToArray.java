import java.util.*;

public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("python");
        list.add("java");
        list.add("c");
        list.add("C#");
        list.add("Php");

        System.out.println(list.size());// size of the arraylist
        // print list using foreach
        for (String string : list) {
            System.out.println(string);
        }

        String arr[] = new String[list.size()];
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));

    }
}
