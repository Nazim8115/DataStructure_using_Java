package ArrayMulti;

public class PrintLikeaWeb {
    public static void wavePrint(int mat[][]) {
        if (mat.length > 0) {
            for (int i = 0; i < mat[0].length; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < mat.length; j++) {
                        System.out.print(mat[j][i] + " ");
                    }
                }
                if (i % 2 != 0) {
                    for (int j = mat.length - 1; j >= 0; j--) {
                        System.out.print(mat[j][i] + " ");
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        int array[][] = { { 1, 2, 4, 6 }, { 7, 8, 9, 7 }, { 10, 11, 12, 30 } };
        wavePrint(array);

    }

}
