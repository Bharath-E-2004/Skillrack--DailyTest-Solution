import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        // Input matrix with error handling
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                try {
                    matrix[i][j] = sc.nextInt();
                } catch (Exception e) {
                    sc.next(); // Skip invalid input
                    matrix[i][j] = 0; // Default to 0
                }
            }
        }

        // Process each 3x3 subgrid
        for (int i = 0; i <= row - 3; i += 3) {
            for (int j = 0; j <= col - 3; j += 3) {
                List<Integer> present = new ArrayList<>();
                for (int k = 0; k < 9; k++) {
                    present.add(matrix[i + k / 3][j + k % 3]);
                }

                Queue<Integer> absent = new LinkedList<>();
                for (int m = 1; m <= 9; m++) {
                    if (!present.contains(m)) {
                        absent.add(m);
                    }
                }

                // Replace zeros with missing numbers
                for (int k = 0; k < 9 && !absent.isEmpty(); k++) {
                    int r = i + k / 3;
                    int c = j + k % 3;
                    if (matrix[r][c] == 0) {
                        matrix[r][c] = absent.poll();
                    }
                }
            }
        }

        // Print the final matrix
        for (int[] mat : matrix) {
            for (int val : mat) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
The program must accept a matrix of size RxC containing only digits as the input. Each 3x3 submatrix in the given matrix contains unique digits (1-9), but some digits are missing. The missing digits are denoted by hyphens. The program must find those missing digits in each 3x3 submatrix and replace the hyphens with the missing digits in sorted order. Finally, the program must print the revised matrix as the output

Note: The values of R and C are always divisible by 3.

Boundary Condition(s):

3-RC-48

Input Format:

The first line contains R and C separated by a space.

The next R lines contain the matrix.

Output Format

The first R lines contain the revised matrix.
*/
