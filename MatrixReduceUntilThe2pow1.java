import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];

        // Read matrix row by row (each row is a string of digits)
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < n; j++) {
                mat[i][j] = row.charAt(j) - '0';
            }
        }

        // Keep reducing until matrix becomes 1×1
        while (n > 1) {
            int newSize = n / 2;
            int newMat[][] = new int[newSize][newSize];

            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < n; j += 2) {
                    int sum = mat[i][j] + mat[i][j + 1]
                            + mat[i + 1][j] + mat[i + 1][j + 1];

                    newMat[i / 2][j / 2] = sum;
                    System.out.print(sum + " ");
                }
                System.out.println();
            }

            System.out.println(); // Blank line between matrices
            mat = newMat;
            n = newSize;
        }
    }
}

/*
The program must accept a matrix of size N°N containing only digits as the input. The value of N is always a power of two. The program must reduce the N'N matrix to 1*1 matrix based on the following conditions.

- The program must replace each 2º2 submatrix with the sum of the elements in the submatrix.

Then the program must print the reduced matrix.

-Then the program must repeat above the process till the size of the matrix becomes 1*1.

Boundary Condition(s):

2 <= N <= 64

Input Format:

The first line contains N.

The next N lines, each contains N digits separated by a space.

Output Format:

The lines contain the reduced matrices.

Example Input/Output 1:

Input:

8

13827137

68439800

29339071

48052961

88715632

50407311

47563646

03667730

Output:

18 17 25 10

23 11 20 15

21 12 21 7

14 23 23 13

6970

70 64

273
*/
