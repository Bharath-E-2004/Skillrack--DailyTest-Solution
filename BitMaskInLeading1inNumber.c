#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int getMSBBitMask(int SIZE, int arr[]) {
    // Step 1: Find the maximum value in the array
    int max = 0;
    for (int i = 0; i < SIZE; i++) {
        if (arr[i] > max)
            max = arr[i];
    }

    // Step 2: Determine the number of bits needed to represent the max value
    int len = 0;
    int temp = max;
    while (temp > 0) {
        len++;
        temp /= 2;
    }

    // Step 3: Create an array to mark the positions of MSBs
    int *arr1 = (int *)calloc(len, sizeof(int)); // Use calloc to initialize to 0

    for (int i = 0; i < SIZE; i++) {
        int val = arr[i];
        int pos = -1;
        int bitPos = 0;

        while (val > 0) {
            bitPos++;
            if (val % 2 == 1)
                pos = bitPos;
            val /= 2;
        }

        if (pos > 0)
            arr1[pos - 1] = 1; // Mark the MSB position
    }

    // Step 4: Construct the result bitmask
    int result = 0;
    for (int i = 0; i < len; i++) {
        if (arr1[i] != 0)
            result += (1 << i); // Equivalent to pow(2, i)
    }

    printf("%d ", len);
    free(arr1); // Free allocated memory
    return result;
}
/*
The function/method getMSBBitMask accepts two arguments SIZE and arr. The integer SIZE represents the size of the integer array arr.

The function/method getMSBBitMask must return an integer value X whose binary representation indicates the MSB's of the given integers. The presence of MSB's must be indicated by the set bits in the binary representation of X.

Your task is to implement the function getMSBBitMask so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

5 48 7 12 200 37

Output: 172

Explanation:

00110000-48

00000111 <-7

00001100-12

11001000 200

00100101-37

X-> 10101100 -> 172

3rd bit from LSB of 172 indicates the MSB of 7.

4th bit from LSB of 172 indicates the MSB of 12.

6th bit from LSB of 172 indicates the MSB of both 48 and 37.

8th bit from LSB of 172 indicates the MSB of 200.

Example Input/Output 2:

Input:

4 7 100 54

Output: 68
*/
