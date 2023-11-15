package String;

public class RevesreWord {

    

    public static void main(String[] args) {
        String s = "i like this program very much ";
        String[] arr = s.split(" ");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i] + " ";
        }

        System.out.println(ans);
    }
}
