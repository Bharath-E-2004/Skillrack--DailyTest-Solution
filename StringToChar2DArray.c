#include <stdio.h>
#include <stdlib.h>

// Function to convert two strings into a matrix by alternating characters
char** stringToMatrix(int N, char *str1, char *str2) {
    char **result = (char**)malloc(sizeof(char*) * N);
    int ind1 = 0, ind2 = 0;
    int toggle = 1;

    for (int i = 0; i < N; i++) {
        result[i] = (char*)malloc(sizeof(char) * (N + 1)); // +1 for null terminator if needed
        for (int j = 0; j < N; j++) {
            if (toggle && ind1<strlen(str1)) {
                result[i][j] = str1[ind1++];
                toggle = 0;
            } else if(ind2<strlen(str2)){
                result[i][j] = str2[ind2++];
                toggle = 1;
            }else{
              result[i][j]=str1[ind1++];
        }
    }

    return result;
}

int main() {
    int N;
    scanf("%d", &N);

    char str1[N * N + 1], str2[N * N + 1]; // +1 for null terminator
    scanf("%s %s", str1, str2);

    char **matrix = stringToMatrix(N, str1, str2);

    if (matrix == NULL) {
        printf("Matrix is not formed\n");
        return 1;
    }

    for (int row = 0; row < N; row++) {
        for (int col = 0; col < N; col++) {
            printf("%c", matrix[row][col]);
        }
        printf("\n");
    }

    // Free allocated memory
    for (int i = 0; i < N; i++) {
        free(matrix[i]);
    }
    free(matrix);

    return 0;
}
/*
The function/method string ToMatrix accepts three arguments N. str1 and str2. The integer N represents the size of a character matrix to be created. The sum of lengths of both string values str1 and str2 is equal to N°N.

The function/method string ToMatrix must return a double pointer representing the character matrix based on the following conditions.

-The size of the character matrix must be N*N.

- The matrix must be filled with the characters from the string values str1 and str2 alternatively (starting from the 1st row, where left to right in each row of the matrix).

Your task is to implement the function string ToMatrix so that it passes all the test cases.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

3

Skill

Rack

Output:

SRk

aic

Ikl

Explanation:

Here N-3, so the size of the character matrix is 3*3.

After filling the matrix with the characters from the string values "Skill" and "Rack"

alternatively, the matrix becomes

SRk

aic

Ikl

Example Input/Output 2:

Input

4

abcdefgh

ijklmnop

Output:

aibj

ckdl

emfn

gohp
*/
