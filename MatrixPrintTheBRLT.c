#include <stdlib.h>

typedef struct {
    int* arr;
    int SIZE;
} boundedArray;

boundedArray* getMatrixEdge(int R, int C, int matrix[R][C], char E) {
    int row = 0, col = 0;
    boundedArray* result = (boundedArray*)malloc(sizeof(boundedArray));

    if (E == 'T' || E == 'B') {
        row = (E == 'T') ? 0 : R - 1;
        result->arr = (int*)malloc(sizeof(int) * C);
        for (int i = 0; i < C; i++) {
            result->arr[i] = matrix[row][i];
        }
        result->SIZE = C;
    } else if (E == 'L' || E == 'R') {
        col = (E == 'L') ? 0 : C - 1;
        result->arr = (int*)malloc(sizeof(int) * R);
        for (int i = 0; i < R; i++) {
            result->arr[i] = matrix[i][col];
        }
        result->SIZE = R;
    } else {
        // Handle invalid edge case
        result->arr = NULL;
        result->SIZE = 0;
    }

    return result;
}
/*
The function/method getMatrixEdge accepts four arguments - R, C, matrix and E. The integers R and C represent the size of the integer matrix. The character E represents one of the four edges of the matrix (T, R, B or L).

The function/method getMatrixEdge must return an array of integers containing all the integers in the given edge of the matrix based on the following conditions.

- Top Edge: The order of integers must be from left to right.

Right Edge: The order of integers must be from top to bottom.

- Bottom Edge: The order of integers must be from right to left.

- Left Edge: The order of integers must be from bottom to top.

Your task is to implement the function getMatrixEdge so that it passes all the test cases.

The following structure is used to represent the boundedArray and is already defined in the default code (Do not write this definition again in your code).

typedef struct BoundedArray

{

int SIZE;

int arr;

} boundedArray;

4

IMPORTANT: Do not write the main() function as it is already defined.
*/
