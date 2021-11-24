//Program to find the transpose of a matrix
// Author Aswin Lal 

//To get input
import java.util.Scanner;

public class transposeMatrix {
    static void print_matrix(int[][] matrix, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int m, n;
        Scanner Sr = new Scanner(System.in);

        System.out.print("Enter the size of row : ");
        m = Sr.nextInt();
        System.out.print("Enter the size of column : ");
        n = Sr.nextInt();

        // Declairing matrix
        int[][] matrix = new int[m][n];

        // Getting the matrix elements
        System.out.println("Enter the elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Sr.nextInt();
            }
        }
        // Transpose Matrix
        int[][] matrix_transpose = new int[n][m];
        // transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix_transpose[j][i] = matrix[i][j];
            }
        }

        // printing the given and transpose matrices
        System.out.println("Given Matrix");
        print_matrix(matrix, m, n);
        System.out.println("Transpose Matrix");
        print_matrix(matrix_transpose, n, m);
        Sr.close();
    }
}