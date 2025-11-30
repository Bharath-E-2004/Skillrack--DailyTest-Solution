#include <stdio.h>

int main()
{
    long long X, Y;
    scanf("%lld %lld", &X, &Y);

    int borrows = 0;
    int carry = 0;

    while (X > 0 || Y > 0)
    {
        int x_digit = X % 10;
        int y_digit = Y % 10;

        x_digit -= carry;

        if (x_digit < y_digit)
        {
            borrows++;
            carry = 1;
        }
        else
        {
            carry = 0;
        }

        X /= 10;
        Y /= 10;
    }

    printf("%d", borrows);
    return 0;
}
/*
The program must accept two integers X and Y (where X >= Y) as the input. The program must print the number of borrows needed when subtracting Y from X as the output.

Boundary Condition(s): 1<= Y < X <= 10^8

Input Format:

The first line contains X. The second line contains Y.

Output Format:

The first line contains an integer representing the number of borrows needed when subtracting Y from X.

Example Input/Output 1:

Input: 9643 9171

Output: 1

Explanation:

Here X-9643 and Y-9171.

The unit digit 1 can subtract from the unit digit 3 and hence NO borrows. The tenth digit 7 cannot subtract from the tenth digit 4. So borrows 1 from the hundredth digit 6.

The hundredth digit 1 can subtract from the hundredth digit 5 and hence NO borrows. The thousandth digit 9 can subtract from the thousandth digit 9 and hence NO borrows. Total number of borrows is 1, which is printed as the output.

Example Input/Output 2:

Input: 4506 129

Output 2
*/
