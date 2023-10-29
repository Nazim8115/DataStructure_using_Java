package ArrayMulti;

public class PrintSpiral {
    public static void spiralPrint(int matrix[][]) {
        int i, k = 0, l = 0;

        if (matrix.length > 0) {
            int n = matrix[0].length;
            int m = matrix.length;

            while (k < m && l < n) {
                // Print the first row from the remaining rows
                for (i = l; i < n; ++i) {
                    System.out.print(matrix[k][i] + " ");
                }
                k++;

                // Print the last column from the remaining
                // columns
                for (i = k; i < m; ++i) {
                    System.out.print(matrix[i][n - 1] + " ");
                }
                n--;

                // Print the last row from the remaining rows */
                if (k < m) {
                    for (i = n - 1; i >= l; --i) {
                        System.out.print(matrix[m - 1][i] + " ");
                    }
                    m--;
                }

                // Print the first column from the remaining
                // columns */
                if (l < n) {
                    for (i = m - 1; i >= k; --i) {
                        System.out.print(matrix[i][l] + " ");
                    }
                    l++;
                }
            }

        }

    }

    public static void main(String[] args) {
        int array[][] = { { 1, 2, 4, 6 }, { 7, 8, 9, 7 }, { 10, 11, 12, 30 } };
        spiralPrint(array);
    }
}
