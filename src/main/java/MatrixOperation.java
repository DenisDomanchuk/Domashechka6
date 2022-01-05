public class MatrixOperation {
    public int[] getDiagonal(int[][] matrix) {
        int[] actualResult = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    actualResult[i] = matrix[i][j];
                }
            }
        }
        return actualResult;
    }

    public int[] getCounterDiagonal(int[][] matrix) {
        int index = matrix.length;
        int[] counterDiagonal = new int[matrix.length];
        if (index < 2) {
            return new int[]{matrix[0][matrix[0].length - 1]};
        }
        for (int i = 0, j = matrix[i].length - 1; i < matrix.length && j >= 0; i++, j--) {
            counterDiagonal[i] = matrix[i][j];
        }
        return counterDiagonal;
    }


    public int getMin(int[][] matrix) {
        int min = -5;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) min = matrix[i][j];
            }
        }
        return min;
    }


    public int getMax(int[][] matrix) {
        int max = -5;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) max = matrix[i][j];
            }
        }
        return max;
    }
}

