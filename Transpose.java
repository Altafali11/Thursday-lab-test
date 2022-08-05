package assingment;

public class Transpose {

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
        int row = 2;
        int column = 3;

        display(matrix); // given matrix

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        display(transpose); // transpose matrix
    } 

    public static void display(int[][] matrix) {
        System.out.println("The matrix is");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}