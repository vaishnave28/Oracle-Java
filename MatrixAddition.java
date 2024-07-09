public class MatrixAddition {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2}, {5, 3}};
        int[][] mat2 = {{2, 3}, {4, 1}};
        int[][] result = {
            {mat1[0][0] + mat2[0][0], mat1[0][1] + mat2[0][1]},
            {mat1[1][0] + mat2[1][0], mat1[1][1] + mat2[1][1]}
        };

        for (int[] row : result) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
