#include <stdio.h>

void printSamePositionDigitsSum(int num1, int num2) {
    int arr[100];
    int ind = 0;

    // Process digits from right to left
    while (num1 > 0 || num2 > 0) {
        int digit1 = num1 % 10;
        int digit2 = num2 % 10;

        arr[ind++] = digit1 + digit2;

        num1 /= 10;
        num2 /= 10;
    }

    // Print the results in reverse (left to right)
    for (int i = ind - 1; i >= 0; i--) {
        printf("%d ", arr[i]);
    }

    printf("\n");
}

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    printSamePositionDigitsSum(a, b);
    return 0;
}


/*
The function/method printSamePositionDigitsSum accepts two arguments X and Y representing two integer values.

The function/method printSamePositionDigitsSum must print the sum of digits in the same positions in X and Y.

Your task is to implement the function printSamePositionDigitsSum so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

248 208

Output:

4416

Explanation:

Here X = 248 and Y = 208. Hundredth digit = (2 + 2) = 4. Tenth digit = (4+0) = 4. Unit digit (8+8) = 16.

So 4416 is printed as the output.

Example Input/Output 2:

Input:

522 81

Output: 5103
*/
