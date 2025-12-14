import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        int top = 0, bottom = N - 1;
        int left = 0, right = N - 1;

        while (top <= bottom && left <= right) {

            // Top edge (A → right)
            int val = A;
            for (int j = left; j <= right; j++) {
                mat[top][j] = val++;
            }

            // Right edge (B → down)
            val = B;
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = val++;
            }

            // Bottom edge (C → left)
            val = C;
            for (int j = right; j >= left; j--) {
                mat[bottom][j] = val++;
            }

            // Left edge (D → up)
            val = D;
            for (int i = bottom; i >= top; i--) {
                mat[i][left] = val++;
            }

            top++;
            bottom--;
            left++;
            right--;
        }

        // Print matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
The program must accept five integers A, B, C, D and N as the input. The value of N is always

even. The program must form an integer matrix of size N°N. Then the program must fill the matrix layer by layer based on the following conditions.

- In each layer of the matrix, the program must fill the integers A, B, C and D at top-left, top-right, bottom-right and bottom-left corners respectively.

- In the top edge of each layer, the program must fill the remaining integers starting from A+1 (left to right).

- In the right edge of each layer, the program must fill the remaining integers starting from B+1 (top to bottom).

- In the bottom edge of each layer, the program must fill the remaining integers starting from C+1 (right to left).

- In the left edge of each layer, the program must fill the remaining integers starting from D+1 (bottom to top).

Finally, the program must print the N°N integer matrix as the output.

Boundary Condition(s): 1<= A, B, C, D <= 10^3

2 <= N <= 50

Input Format:

The first line contains A, B, C and D separated by a space.

The second line contains N.

Output Format:

The first N lines contain the integer matrix.

Example Input/Output 1:

Input:

10 20 40 50

6

Output:

10 11 12 13 14 20

54 10 11 12 20 21

53 52 10 20 21 22

52 51 50 40 22 23

51 50 42 41 40 24

50 44 43 42 41 40

Explanation:

Here A = 10, B = 20, C = 40, D = 50 and N = 6.

So the 6*6 integer matrix is formed and filled with the integers based on the given conditions.

10 11 12 13 14 20

54 10 11 12 20 21

53 52 10 20 21 22

52 51 50 40 22 23

51 50 42 41 40 24

50 44 43 42 41 40

Example Input/Output 2:

Input

11 51 61 31

8

Output:

11 12 13 14 15 16 17 51

37 11 12 13 14 15 51 52

36 35 11 12 13 51 52 53

35 34 33 11 51 52 53 54

34 33 32 31 61 53 54 55

33 32 31 63 62 61 55 56

32 31 65 64 63 62 61 57

31 67 66 65 64 63 62 61
*/
