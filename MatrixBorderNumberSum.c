#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    int rows = (N + 1) / 2;
    int mat[50][50];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < N; j++) {
            scanf("%d", &mat[i][j]);
        }
    }

    int mid = N / 2;
    int sum = 0;

    for (int i = 0; i < rows; i++) {
        int left = mid - i;
        int right = mid + i;

        if (i == 0) {
            // top of triangle
            sum += mat[i][mid];
        }
        else if (i == rows - 1) {
            // base of triangle
            for (int j = left; j <= right; j++) {
                sum += mat[i][j];
            }
        }
        else {
            // middle boundary
            sum += mat[i][left];
            sum += mat[i][right];
        }
    }

    printf("%d", sum);
    return 0;
}

/*
A matrix having (N+1)/2 rows and N columns (where N is odd) is passed as the input. A triangle with non-zero values is present in the middle of the matrix. The program must print the sum of the values in the boundary of the triangle.

Boundary Condition(s):

5 <= N <= 49

Input Format:

The first line contains N.

The next (N+1)/2 lines, each contains N integer values separated by a space.

Output Format:

The first line contains the sum of integer values in the boundary of the triangle.

Example Input/Output 1:

Input

5 00100 06520 35498

Output:

38

Explanation:

The integer values along the boundary are 1, 2, 8, 9, 4, 5, 3 and 6. Their sum is 38, which is printed as the output.

Example Input/Output 2:

Input:

0003000

7 0094800

0867950

1448571

Output: 63
*/
