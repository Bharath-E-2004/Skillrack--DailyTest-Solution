import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of first matrix
        System.out.print("Enter number of rows for Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int c1 = sc.nextInt();

        int[][] matrixA = new int[r1][c1];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input dimensions of second matrix
        System.out.print("Enter number of rows for Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible!");
            return;
        }

        int[][] matrixB = new int[r2][c2];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Result matrix
        int[][] result = new int[r1][c2];

        // Matrix multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Product of the matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

