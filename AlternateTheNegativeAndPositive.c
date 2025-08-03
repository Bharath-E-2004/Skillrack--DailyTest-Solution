#include <stdio.h>
#include <stdlib.h>

int* alternateOddEven(int arr[], int N) {
    int* new_arr = (int*)malloc(sizeof(int) * N);
    if (new_arr == NULL) {
        return NULL; // Memory allocation failed
    }

    int odd = 0;   // Start placing odd-indexed elements at even positions
    int even = 1;  // Start placing even-indexed elements at odd positions

    for (int i = 0; i < N; i++) {
        if (arr[i] % 2 != 0) {
            if (odd < N) {
                new_arr[odd] = arr[i];
                odd += 2;
            }
        } else {
            if (even < N) {
                new_arr[even] = arr[i];
                even += 2;
            }
        }
    }

    return new_arr;
}
/*
The function/method alternateOddEven accepts two arguments arr and N. The integer N represents the size of the integer array arr.

The function/method alternateOddEven must return an array where odd and even integers are placed alternatively in the same order of their occurrence. The array contains an equal

count of odd and even integers. Note: The value of N is always even

Your task is to implement the function alternateOddEven so that the program runs successfully.

IMPORTANT: Do not implement the main() function as it is already defined.

Input Format:

The first line contains N.

The second line contains the N integer values separated by a space.

Output Format:

The N integer values with odd and even integers are placed alternatively separated by a space.

Example Input/Output 1:

Input

6

10 5 7 8 99 44

Output

5 10 7 8 99 44

Explanation

Here N-6 and the given 6 integers are 105789944

After placing the odd and even integers alternatively in the same order of their occurrence, the array becomes 5 1078 99 44.

Example Input/Output 2:

Input

4

2 3 6 4 5

Output

3 2 5 6 4
*/
