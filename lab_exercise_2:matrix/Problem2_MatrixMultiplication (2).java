public class Problem2_MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B) throws MatrixMismatchException {
        if (A[0].length != B.length) {
            throw new MatrixMismatchException("Matrix dimensions mismatch!");
        }
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            int[][] A = {{1,2,3},{4,5,6}};
            int[][] B = {{7,8},{9,1},{2,3}};
            int[][] result = multiplyMatrices(A, B);
            for (int[] row : result) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        } catch (MatrixMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}