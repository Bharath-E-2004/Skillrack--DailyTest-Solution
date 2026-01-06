#include <stdio.h>

int main() {
    int Alpha[4] = {0};   // A, B, C, D
    char str[1001];

    scanf("%s", str);

    // Count products
    for (int i = 0; str[i] != '\0'; i++) {
        Alpha[str[i] - 'A']++;
    }

    long long int answer = 0;

    // A: pack of 4 for 100, else 40 each
    answer += (Alpha[0] / 4) * 100 + (Alpha[0] % 4) * 40;

    // B: 60 each
    answer += Alpha[1] * 60;

    // C: pack of 6 for 200, else 55 each
    answer += (Alpha[2] / 6) * 200 + (Alpha[2] % 6) * 55;

    // D: 95 each
    answer += Alpha[3] * 95;

    printf("%lld", answer);

    return 0;
}
/*
There are four products A, B, C and D in a shop. The price of the four products are given below.

A-Rs.40 each or Rs.100 for a pack of 4

B-Rs.60 each

C-Rs.55 each or Rs.200 for a pack of 6

D-Rs.95 each

The program must accept a string S representing the products in a cart. The program must print the total price for the entire cart based on the given price list.

Boundary Condition(s): 1 <= Length of S <= 1000

Input Format: The first line contains S.

Output Format: The first line contains the total price for the entire cart based on the given price list.

Example Input/Output 1:

Input:

ABACDBAAA

Output: 410

Explanation:

A-quantity 5-(100+40) B-quantity 2-(60+60)

C-quantity 1-55

D-quantity 1-95

Total price-410

Example Input/Output 2:

Input:

Output: 770
*/
