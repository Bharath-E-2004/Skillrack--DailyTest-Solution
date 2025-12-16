#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main() {
    char S[5000];
    int N;

    scanf("%s", S);
    scanf("%d", &N);

    int len = strlen(S);
    int totalCells = N * N;

    char digits[5000], alpha[5000];
    int d = 0, a = 0;

    // Separate digits and alphabets
    for (int i = 0; i < len; i++) {
        if (isdigit(S[i])) {
            digits[d++] = S[i];
        } else {
            alpha[a++] = S[i];
        }
    }

    digits[d] = '\0';
    alpha[a] = '\0';

    int digitsPerNum = d / totalCells;

    // Print Integer Matrix M1
    int idx = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            int num = 0;
            for (int k = 0; k < digitsPerNum; k++) {
                num = num * 10 + (digits[idx++] - '0');
            }
            printf("%d ", num);
        }
        printf("\n");
    }

    // Print Character Matrix M2
    idx = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%c ", alpha[idx++]);
        }
        printf("\n");
    }

    return 0;
}

/*
The program must accept a string S and an integer N as the input. The string contains N°N integers and N°N alphabets without any space. The number of digits in all N'N integers is equal. The program must form two matrices M1(integer matrix) and M2(character matrix) of equal size N'N. The matrix M1 must be formed using the integers in S and the matrix M2 must be formed using the alphabets in S. Finally, the program must print the matrices M1 and M2 as the output.

Boundary Condition(s):

8 <= Length of S <= 4000 2 <= N <=25

Input Format:

The first line contains S.

The second line contains N.

Output Format:

The first N lines, each contains N integer values separated by a space.

The next N lines, each contains N characters separated by a space.

Example Input/Output 1:

Input 1045a20s80df 2

Output:

1045 20 80 as df

Explanation:

Here N = 2, so the size of M1 and M2 is equal to 2*2. There are four 2-digit integers in the string.

10 45 20 80
*/
