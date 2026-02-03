
           for (int j = 0; j < C; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt() - 1; // convert to 0-based index

        // Fold from right to left
        int right = C - 1;
        int left = N - 1;

        while (left >= 0 && right > N) {
            for (int i = 0; i < R; i++) {
                mat[i][left] += mat[i][right];
            }
            left--;
            right--;
        }

        // Print folded matrix (columns 0 to N-1)
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
An integer matrix with R rows and C columns is passed as the input. The programs must fold the matrix towards the left starting from the Nth column and merge(add the cell values) the overlapping column values. Then the program must print the resulting matrix.

Boundary Condition(s):

2 <= R C <= 50

1 <= Matrix element value <= 10^4

1 <= N <= C

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integers separated by a space.

The R+2nd line contains N.

Output Format:

The first R lines contain the folded matrix based on the given conditions.

Example Input/Output 1:

Input:

35

10 20 30 40 50

99 77 55 44 11

13569

4

Output:

10 70 70

99 88 99

1.12 11
*/
