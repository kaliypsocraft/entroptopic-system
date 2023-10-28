package MathHelpers;

public class MatrixVectorMultiplication {

    public static double[] multiplyMatrixVector(double[][] matrix, double[] vector) {
        if (matrix[0].length != vector.length) {
            throw new IllegalArgumentException("Matrix columns must be equal to the vector size for multiplication.");
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        double[] result = new double[rows];

        for (int i = 0; i < rows; i++) {
            double sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j] * vector[j];
            }
            result[i] = sum;
        }

        return result;
    }
}