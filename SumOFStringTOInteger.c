#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <ctype.h>

int findSumDifferentBase(char str[])
{
    int total = 0;
    char *token = strtok(str, " ");

    while (token != NULL)
    {
        char c = tolower(token[0]);

        if (c == 'b')          // binary
            total += (int)strtol(token + 1, NULL, 2);
        else if (c == 'd')     // decimal
            total += (int)strtol(token + 1, NULL, 10);
        else if (c == 'o')     // octal
            total += (int)strtol(token + 1, NULL, 8);
        else if (c == 'h')     // hexadecimal
            total += (int)strtol(token + 1, NULL, 16);

        token = strtok(NULL, " ");
    }

    printf("%d\n", total);
    return total;
}
/*
The function/method findSumDifferent Base accepts an argument str. The string str contains Integers separated by a space, but the base of each integer is denoted by the preceding alphabet in that integer. The base values of the integers can be any of the following.

Borb-Binary

oro-Octal

Dord-Decimal

Horh-Hexadecimal

The function/method findSumDifferent Base must find the decimal equivalent of each integer in the given string. Then the function must return an integer representing the sum of the obtained decimal values.

Your task is to implement the function findSumDifferent Base so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

b1110 d150 023 H2AF

Output: 870

Explanation:

There are four integers in the given string.

b1110-> Binary to Decimal -> 14.

d150-> Decimal -> 150.

023-> Octal to Decimal -> 19.

H2AF-> Hexadecimal to Decimal -> 687.

14+150+19+687-870.

Example Input/Output 2:

Input:

D10 810 010 H10 HEF 067 b11 D89

Output: 422
*/
