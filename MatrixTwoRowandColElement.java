import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        // Read matrix elements
        for (int i = 0; i < row * col; i++) {
            matrix[i / col][i % col] = sc.nextInt();
        }

        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();

        // Print submatrix between (r1, c1) and (r2, c2)
        for (int i = Math.min(r1, r2); i <= Math.max(r1, r2); i++) {
            for (int j = Math.min(c1, c2); j <= Math.max(c1, c2); j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Input:

5 6

11 12 13 14 15 16

21 22 23 24 25 26

31 32 33 34 35 36

41 42 43 44 45 46

91 92 93 94 95 96

4 1

3 6

Output

24 25

34 35

Explanation:

Here M=4, N=1, P3 and Q = 6.

The matrix engulfed inside the rows M and N and the columns P and Q is highlighted below.

11 12 13 14 15 16

21 22 23 24 25 26

31 32 33 34 35 36

41 42 43 44 45 46

91 92 93 94 95 96

Example Input/Output 2:

Input:

7 7

75 31 61 98 70 46 62

42 87 19 17 91 72 88

35 78 19 95 63 81 30

93 92 53 68 84 33 22

73 44 62 89 79 85 55

16 58 46 59 45 13 69

55 58 44 74 29 15 48

2 6

1 5

Output

78 19 95

92 53 68

44 62 89
*/
