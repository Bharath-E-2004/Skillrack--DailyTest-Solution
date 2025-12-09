#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int concatBinary(int num1, int num2) {
    char bin[200];
    int i = 0;

    // Convert num1 to binary (reverse order)
    while (num1 > 0) {
        bin[i++] = (num1 % 2) ? '1' : '0';
        num1 /= 2;
    }

    // Reverse to correct order
    bin[i] = '\0';
    int s = 0, e = i - 1;
    while (s < e) {
        char tmp = bin[s];
        bin[s] = bin[e];
        bin[e] = tmp;
        s++; e--;
    }

    // Append num2 as decimal text
    char temp[50];
    sprintf(temp, "%d", num2);
    strcat(bin, temp);

    // Convert whole string to integer (base 2)
    return strtol(bin, NULL, 2);
}

int main() {
    int num1, num2;
    scanf("%d %d", &num1, &num2);

    printf("%d\n", concatBinary(num1, num2));
    return 0;
}

/*
The function/method concatiflinary accepts two arguments muw and num2 representing two integer values. The integer num2 contains only is and is denoting the binary representation of an integer X

The function/method concatilinary must concatenate the binary representation of num? and X. Then the function must retum an integer representing the decimal equivalent of the concatenated the binary representation

Your task is to implement the function concat Binary so that the program runs successfully.

IMPORIUMI: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input 5110

Output 46

Explanation:

Here mami-5 and mum2-110

The binary representation of 5 is 101.

The concatenation of 101 and 110 is 101150

The decimal equivalent of 101110 is 46

Example Input/Output 2:

Input: 425 10011

Output: 13619

Explanationc

Here num1425 and num2-10011.

The binary representation of 425 is 110101001.

The concatenation of 110101001 and 10011 is 11010100110011.

The decimal equivalent of 11010100110011 is 13619.
*/
