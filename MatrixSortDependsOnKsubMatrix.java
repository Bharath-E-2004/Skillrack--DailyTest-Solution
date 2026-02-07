import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] matrix = new char[R][C];

        // Read matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        int K = sc.nextInt();

        // Process each K×K submatrix
        for (int i = 0; i < R; i += K) {
            for (int j = 0; j < C; j += K) {

                char[] temp = new char[K * K];
                int index = 0;

                // Collect characters
                for (int r = i; r < i + K; r++) {
                    for (int c = j; c < j + K; c++) {
                        temp[index++] = matrix[r][c];
                    }
                }

                // Sort characters
                Arrays.sort(temp);

                index = 0;

                // Put back sorted characters
                for (int r = i; r < i + K; r++) {
                    for (int c = j; c < j + K; c++) {
                        matrix[r][c] = temp[index++];
                    }
                }
            }
        }

        // Print result
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
The program must accept a character matrix of size R°C and an integer K as the input. The matrix contains only lower case alphabets. The values of R and C are always divisible by K. For each K*K submatrix in the given matrix, the program must sort the alphabets in the submatrix. Then the program must print the revised matrix as the output.

Boundary Condition(s): 2 <= R, C, K <= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C characters separated by a space.

The R+2nd line contains K.

Output Format:

The first R lines, each contains C characters separated by a space.

Example Input/Output 1:

Input:

defoyjrqp

ihguttonm

69 abcosllkj smmihglyj mubfedehb Iptcbawtx 3

Output:

abcjlojki defostmno ghituypqr blmabcbeh

mmpdefjit stughiwxy
*/
