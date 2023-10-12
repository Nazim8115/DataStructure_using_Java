import java.util.Arrays;

public class ReplaceValue {
    public static void changeValue(String arr[], int index, String value) {
        arr[index] = value;

    }

    public static void main(String[] args) {
        String cities[] = { "Muradabad", "Agre", "Delhi" };
        String newCity = "Mumbai";
        changeValue(cities, 1, newCity);
        System.out.println(Arrays.toString(cities)); 
    }
}
