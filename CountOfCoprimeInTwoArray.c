int gcd(int a, int b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

int findCoPrimePairCount(int M, int arr1[], int N, int arr2[]) {
    int count = 0;

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            if (gcd(arr1[i], arr2[j]) == 1) {
                count++;
            }
        }
    }

    return count;
}
/*
Two integers x and y are coprime if the only positive integer that is a divisor of both of them is 1

The function/method findCoPrimePairCount accepts four arguments M, arr1, N, arr2. The integer M represents the size of the integer array arr1. The integer N represents the size of the integer array arr2.

The function/method findCoPrimePairCount must return the number of pairs (x, y) where x and y are co-prime numbers. The values x, y belong to the arrays arr1 and arr2 respectively.

Your task is to implement the function findCoPrimePairCount so that it passes all the test cases.

IMPORTANT; Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

5

12 45 7 10 20

4

15 67 34 40

Output

9
*/
