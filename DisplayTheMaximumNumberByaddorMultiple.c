#include <stdio.h>
#include <stdlib.h>

int main() {
    int size;
    scanf("%d", &size);

    for(int i = 0; i < size; i++) {
        long int sum = 0, mul = 1, val;
        scanf("%ld", &val);

        long int temp = val;

        while(temp > 0) {
            int digit = temp % 10;
            sum += digit;
            mul *= digit;
            temp /= 10;
        }

        if(mul > sum)
            printf("%ld ", mul);
        else
            printf("%ld ", sum);
    }

    return 0;
}


/*
The program must accept N integers as the input. For each integer X among the given N integers, the program must print the maximum between the sum of digits in X and the product of digits in X

Boundary Condition(s):

1 <= N <= 1000

1<= Each integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains N integer values separated by a space.

Example Input/Output 1:

Input

5

140 34 61 10 59

Output

5127145

Explanation:

Here N = 5 and the given 5 integers are 140 34 61 10 59.

1 integer 140: (1 + 4 + 0) > (1 deg * 4 deg * 0) = 5 is the maximum.

2nd integer 34: (3 + 4) < (3 ^ 4) = 12 is the maximum.

3rd integer 61: (6 + 1) >(6^ * 1)=7 is the maximum.

4th integer 10: (1+0) > (10) = 1 is the maximum.

5th integer 59: is the maximum. (3 + 90) < (59) = 45

Example Input/Output 2:

Input:

4 99 91 90001 444

Output: 81 10 10 64
*/
