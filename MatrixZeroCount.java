import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat = new int[row][col];
        int total = 0;

        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;

            // Mark column
            for (int j = 0; j < row; j++) {
                if (mat[j][c] == 0) {
                    mat[j][c] = 1;
                    total++;
                }
            }

            // Mark row
            for (int j = 0; j < col; j++) {
                if (mat[r][j] == 0) {
                    mat[r][j] = 1;
                    total++;
                }
            }

            System.out.println(total);
        }

        sc.close();
    }
}
/*
 Example Input/Output 1:

Input:

5 5

3

3 2

4 4

3 5

Output:

16

9

6

Explanation:

Here R5 and C 5. So the size of the matrix is 5*5.

00000

00000

00000

00000

00000

Each O represents an empty cell.

After the 1st query (3, 2), the number of empty cells in the matrix is 16.

01000

01000

11111

01000

01000

After the 2nd query (4, 4), the number of empty cells in the matrix is 9.

01010

01010

11111

11111

01010
*/
