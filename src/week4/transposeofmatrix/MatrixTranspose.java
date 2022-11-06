package week4.transposeofmatrix;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author JOSEPH
 * matrix transpose
 */
public class MatrixTranspose {

    // helper function to print out matrix
    static void printMatrix(int[][] matrix) {

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, number;

        // get inputs
        System.out.println("Matrix A(m,n)");

        try {
            System.out.print("m: ");
            m = scanner.nextInt();

            System.out.print("n: ");
            n = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input Type");
            return;
        }

        // matrix
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("number: ");
                number = scanner.nextInt();

                matrix[i][j] = number;
            }
        }

        // transpose
        int[][] transpose = new int[n][m];

        // j loop outside, i loop inside, reversed
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        System.out.println();

        // print stuff

        printMatrix(matrix);

        System.out.println("\n=================\n");

        printMatrix(transpose);
    }
}