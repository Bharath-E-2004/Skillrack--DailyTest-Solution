#include <stdlib.h>

long long compressBinary(int N)
{
    int binary[32];
    int len = 0;

    /* Convert N to binary (stored in reverse) */
    while (N > 0) {
        binary[len++] = N % 2;
        N /= 2;
    }

    long long result = 0;
    int count = 1;

    /* Traverse binary from MSB to LSB */
    for (int i = len - 1; i > 0; i--) {
        if (binary[i] == binary[i - 1]) {
            count++;
        } else {
            result = result * 10 + count;
            count = 1;
        }
    }

    /* Append the last count */
    result = result * 10 + count;

    return result;
}

/*
The function/method compressBinary accepts an argument N representing an integer value.

The function/method compressBinary must compress the binary representation of N by replacing the consecutive 1s and Os with their sum. Then the program must return an integer representing the result of the binary compression.

Your task is to implement the function compressBinary so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(a):

1<= N <= 10^5

Example Input/Output 1:

Input: 120

Output: 40

Explanation:

The binary representation of 120 is 1111000.

After compressing the binary representation of 120, the binary representation becomes 40.

1111000-> (1+1+1+1)(0+0+0) -> 40 Hence 40 is printed as the output.

Example Input/Output 2:

Input:

2506

Output: 10301010

Explanation:

The binary representation of 2506 is 100111001010.

After compressing the binary representation of 2506, the binary representation becomes

10301010.

100111001010-> (1)(0+0)(1+1+1)(0+0)(1)(0)(1)(0) -> 10301010 Hence 10301010 is printed as the output.
*/
