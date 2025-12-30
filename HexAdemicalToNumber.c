#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main()
{
    int N;
    scanf("%d", &N);

    long long total = 0;
    char hex[20];

    for (int i = 0; i < N; i++)
    {
        scanf("%s", hex);

        long long value = 0;

        for (int j = 0; hex[j] != '\0'; j++)
        {
            if (isdigit(hex[j]))
            {
                value = value * 10 + (hex[j] - '0');
            }
            else
            {
                value = value * 100 + (hex[j] - 'A' + 10);
            }
        }

        total += value;
    }

    printf("%lld", total);
    return 0;
}

/*
The program must accept N hexadecimal values as the input. For each hexadecimal value H, the program must replace each alphabet with the corresponding decimal value in H. Then the program must print the sum of the N revised values by considering them as decimal values.

Boundary Condition(s):

1<= N <= 100

1 <= Decimal equivalent of H <= 10^6

Input Format:

The first line contains N.

The second line contains N hexadecimal values separated by a space.

Output Format:

The first line contains an integer representing the sum of the N revised values based on the given conditions.

Example Input/Output 1:

Input:

4

5FA 348 C10 529

Output: 56660

Explanation:

5FA-> 51510 348-> 3411 C10-> 1210 529-529 515103411+1210+52956660.

Example Input/Output 2:

Input: 3 ABCD 1234 EF

Output: 10113862
*/
