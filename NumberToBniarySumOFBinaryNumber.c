#include <stdio.h>
#include <stdlib.h>

int getBinaryAsDecimalSum(int SIZE, int arr[])
{
    int total = 0;
    int index = 0;

    while (index < SIZE)
    {
        printf("%d ", arr[index]);

        int val = arr[index];
        char *bin = (char *)malloc(33);   // 32 bits + null terminator
        int ind = 0;

        // Convert to binary (reverse order)
        if (val == 0)
            bin[ind++] = '0';
        else
            while (val > 0)
            {
                bin[ind++] = (val % 2) ? '1' : '0';
                val /= 2;
            }

        bin[ind] = '\0';

        // Reverse the binary string
        for (int i = 0, j = ind - 1; i < j; i++, j--)
        {
            char temp = bin[i];
            bin[i] = bin[j];
            bin[j] = temp;
        }

        // Convert binary string to decimal
        total += atoi(bin);

        free(bin);
        index++;
    }

    return total;
}

/*
The function/method getBinaryAsDecimalSum accepts two arguments SIZE and arr. The integer SIZE represents the size of the integer array. The number of bits in the binary representation of each integer in the array is always less than or equal to 8.

The function/method getBinaryAsDecimalSum must find the binary representation of each integer in the given array. Then the function must return an integer representing the sum of the binary values by considering them as decimal numbers.

Your task is to implement the function getBinaryAsDecimalSum so that the program runs successfully

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

4

10578

Output: 2222

Explanations

Here N=4.

10->1010 5->101 7-111 8->1000

1010+101+111+1000-2222.

Example Input/Output 2:

Input

9 123456789

Output: 2445
*/
