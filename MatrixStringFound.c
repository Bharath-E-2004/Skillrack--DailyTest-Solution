#include <stdlib.h>
#include <string.h>

int* findStartingPosition(int R, int C, char *matrix, char *str)
{
    int L = strlen(str);

    for (int col = 0; col < C; col++)
    {
        for (int row = 0; row < R; row++)
        {
            // Check forward (top to bottom)
            if (matrix[row * C + col] == str[0])
            {
                int k;
                for (k = 0; k < L; k++)
                {
                    if (row + k >= R || matrix[(row + k) * C + col] != str[k])
                        break;
                }
                if (k == L)
                {
                    int *res = (int *)malloc(2 * sizeof(int));
                    res[0] = row + 1;
                    res[1] = col + 1;
                    return res;
                }
            }

            // Check reverse (bottom to top)
            if (matrix[row * C + col] == str[0])
            {
                int k;
                for (k = 0; k < L; k++)
                {
                    if (row - k < 0 || matrix[(row - k) * C + col] != str[k])
                        break;
                }
                if (k == L)
                {
                    int *res = (int *)malloc(2 * sizeof(int));
                    res[0] = row + 1;
                    res[1] = col + 1;
                    return res;
                }
            }
        }
    }

    return NULL;
}

/*
The function/method findStarting Position accepts four arguments R, C, matrix and str. The integers R and C represent the size of the character matrix. The given matrix contains the string str in any of its columns(i.e., the string str occurs exactly in one column in forward or reverse order).

The function/method findStarting Position must return an array of size 2 representing the position of the first character of the string in the matrix.

Note: The first character and the last character of the given string are always distinct.

Your task is to implement the function findStarting Position so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

45

abcde

floic

koono

ccide

cool

Output:

13
*/
