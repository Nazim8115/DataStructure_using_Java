package ArrayMulti;

public class LargestRoworColumn {
    public static void findLargest(int mat[][]) {
        // Your code goes here
        int max = Integer.MIN_VALUE;
        String s = "row";
        int index = 0;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum = sum + mat[i][j];
            }
            if (sum > max) {
                max = sum;
                s = "row";
                index = i;
            }
        }

        for (int i = 0; i < mat.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j < mat.length; j++) {
                sum = sum + mat[j][i];
            }
            if (sum > max) {
                max = sum;
                s = "column";
                index = i;
            }

        }
        System.out.println(s + " " + index + " " + max);
    }

    public static void main(String[] args) {
        int array[][] = { { 1, 2, 4, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        findLargest(array);
    }
}
