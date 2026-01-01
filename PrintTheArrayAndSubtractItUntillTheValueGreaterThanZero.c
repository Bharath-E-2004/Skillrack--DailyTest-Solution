#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);

    int arr[100];   // max N is 100
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    while (N > 0) {
        int temp[100];
        int newSize = 0;

        // Step 1 & 2: subtract N and remove <= 0
        for (int i = 0; i < N; i++) {
            arr[i] -= N;
            if (arr[i] > 0) {
                temp[newSize++] = arr[i];
            }
        }

        // Step 3: print if size > 0
        if (newSize > 0) {
            for (int i = 0; i < newSize; i++) {
                printf("%d ", temp[i]);
            }
            printf("\n");
        }

        // Step 4: update array and size
        N = newSize;
        for (int i = 0; i < N; i++) {
            arr[i] = temp[i];
        }
    }

    return 0;
}

/*
The program must accept an array of N integers as the input. The program must print the output based on the following conditions.

- For each integer X in the array, the program must decrement the value of X by the size of the

array. -Then the program must remove Os and negative integers from the revised array.

-Then the program must print all the integers in the revised array only if the size is greater than 0.

-Then the program must repeat the above three processes till the size of the array becomes 0.

Notes There will be at least one integer greater than N in the given array.

Boundary Condition(s):

1<= N <= 100

1<= Each integer value <= 10^4

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The lines contain the integer values based on the given conditions.

Example Input/Output 1:

Input

6

24 23 14 21 20 15

Output:

18 17 8 15 149 12 11 2983 6532 21
*/
