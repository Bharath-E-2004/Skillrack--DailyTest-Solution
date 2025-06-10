#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct BoundedArray {
    int SIZE;
    long long int *arr;
} BoundedArray;

BoundedArray* concatEveryTwoIntegers(int SIZE, int arr[]) {
    BoundedArray *result = (BoundedArray *)malloc(sizeof(BoundedArray));
    result->SIZE = SIZE / 2;
    result->arr = (long long int *)malloc(sizeof(long long int) * result->SIZE);

    int ind = 0;
    for (int i = 0; i < SIZE; i += 2) {
        char s1[50], s2[50];
        sprintf(s1, "%d", arr[i]);
        sprintf(s2, "%d", arr[i + 1]);
        strcat(s1, s2);
        result->arr[ind++] = atoll(s1);  // use `atoll` for long long conversion
    }

    return result;
}

int main() {
    int SIZE;
    scanf("%d", &SIZE);

    // Ensure the array has even size
    if (SIZE % 2 != 0) {
        printf("Array size must be even.\n");
        return 1;
    }

    int arr[SIZE];
    for (int i = 0; i < SIZE; i++) {
        scanf("%d", &arr[i]);
    }

    BoundedArray *bArr = concatEveryTwoIntegers(SIZE, arr);

    printf("Concatenated Array: ");
    for (int i = 0; i < bArr->SIZE; i++) {
        printf("%lld ", bArr->arr[i]);
    }
    printf("\n");

    // Free allocated memory
    free(bArr->arr);
    free(bArr);

    return 0;
}
/*
  The following structure is used to represent the boundedArray and is already defined in the default code (Do not write this definition again in your code).

typedef struct BoundedArray

{

int SIZE;

long long int *arr;

} boundedArray;

IMPORTANT: Do not write the main() function as it is already defined.

Boundary Condition(s):

2 <= SIZE <= 1000

1 <= Each integer value <= 10^6

Example Input/Output 1:

Input:

6 12 100 56 99 7 6023

Output

Array: 12100 5699 76023

Explanation:

Here the size of the array is 6 and the given 6 integers are 12, 100, 56, 99, 7 and 6023. After concatenating every two integers in the given array, the integers become 12100, 5699 and 76023.

Hence the output is Array: 12100 5699 76023

Example Input/Output 2:

Input:

4 102654 98754 15 9878

Output:

Array: 10265498754 159878
*/
