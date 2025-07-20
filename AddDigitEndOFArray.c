#include <stdio.h>
#include <stdlib.h>

// Function to count shoe pairs
int countShoePairs(int N, int arr[]) {
    // Sort the array using bubble sort
    for (int i = 0; i < N - 1; i++) {
        for (int j = i + 1; j < N; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    int count = 0;
    for (int i = 0; i < N - 1; i++) {
        if (arr[i] == arr[i + 1]) {
            count++;
            i++; // skip next index as it's part of the pair
        }
    }

    return count;
}

int main() {
    int N;
    scanf("%d", &N);

    int arr[N];
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    printf("%d\n", countShoePairs(N, arr));
    return 0;
}
/*
  Example Input/Output 1:

Input:

5 

12344 1

Output:

12345

Explanation:

12344+1=12345. The digits are separated by a space. Hence the array returned must have the following six elements.

[1, 2, 3, 4, 5, -1]

The last -1 indicates the end of the array.

Example Input/Output 2:

Input:

3 
9 9 9 2

Output: 1001

Explanation:

The array returned must have the following five elements.

[1, 0, 0, 1, -1]

The last -1 indicates the end of the array.
*/
