#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *str1 = NULL, *str2 = NULL;
    size_t size1 = 0, size2 = 0;

    // Read full lines
    getline(&str1, &size1, stdin);
    getline(&str2, &size2, stdin);

    int digit[10] = {0};
    long long sum1 = 0, sum2 = 0;

    // -------- Process A1 --------
    char *tok = strtok(str1, " ");
    int count1 = 0;
    while (tok != NULL) {
        sum1 += atoll(tok);
        for (int i = 0; tok[i]; i++) {
            digit[tok[i] - '0']++;
        }
        count1++;
        tok = strtok(NULL, " ");
    }

    // -------- Process A2 --------
    tok = strtok(str2, " ");
    int count2 = 0;
    while (tok != NULL) {
        sum2 += atoll(tok);
        for (int i = 0; tok[i]; i++) {
            digit[tok[i] - '0']--;
        }
        count2++;
        tok = strtok(NULL, " ");
    }

    // Check size match
    if (count1 != count2) {
        printf("NO");
        return 0;
    }

    // Check digit match
    for (int i = 0; i < 10; i++) {
        if (digit[i] != 0) {
            printf("NO");
            return 0;
        }
    }

    // If passed all checks
    printf("YES\n%lld %lld", sum1, sum2);
    return 0;
}

/*
The program must accept two integer arrays A1 and A2 as the input. The program must print YES if both arrays have the same size and the same digits used to form integers. Else the program must print NO as the output. Then the program must print the sum of integers in the arrays A1 and A2 as the output.

Note: The maximum size of both arrays A1 and A2 is 100.

Boundary Condition(s): 1 <= Each integer value <= 10^8

Input Format:

The first line contains integer values separated by a space representing the array A1. The second line contains integer values separated by a space representing the array A2.

Output Format:

The first line contains YES or NO.

The second line contains the sum of integers in the arrays A1 and A2 separated by a space only if YES is printed.

Example Input/Output 1:

Input:

12 801 6 8100 88 61000 1 21

Output: YES 8919 61110

Explanation:

Both arrays A1 and A2 have an equal size 4.

The same digits are used in both arrays.

So YES is printed as the output.

The sum of integers in A1 is 8919.

The sum of integers in A2 is 61110.
*/
