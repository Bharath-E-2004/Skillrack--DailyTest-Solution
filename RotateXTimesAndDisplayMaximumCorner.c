#include <stdio.h>
#include <stdlib.h>

int higherScore(int N) {
   int t=0;
   for(int i=0,val=N*N;i<N;i++,t+=val,val--);
  return t;
}

int main() {
    int N, X;
    scanf("%d %d", &N, &X);

    X = X % 4;

    int score = higherScore(N);

    if (X == 0)
        printf("C");
    else if (X == 1)
        printf("D");
    else if (X == 2)
        printf("A");
    else
        printf("B");

    printf("%d", score);

    return 0;
}
/*
Four players A, B, C and D are playing a matrix game. They create a matrix of size N°N and then they fill the matrix with the integers from 1 to N°N (starting from 1st to Nth row where left to right in each row). The player A is sitting on the top of the matrix. The player B is sitting on the right of the matrix. The player C is sitting on the bottom of the matrix. The player D is sitting on the left of the matrix. One of the four players rotates the matrix 90-degree for X times in clockwise direction. The player who got the maximum edge sum is the winner of the game. The values of N and X as the input. The program must print the name of the winner and the sum of integers on his side of the matrix as the output.

Boundary Condition(s): 2 <= N <=50 1<X<= 10^5

Input Format: The first line contains N and X separated by a space.

Output Format:

The first line contains the name of the winner and the sum of integers on his side of the matrix.

Example Input/Output 1:

Input: 32

Output: A 24

Explanation: Here N 2 and X = 2. The four players create a 3º3 matrix as given below. 
1 2 3

4 5 6

7 8 9

After 1st rotation(90-degree):

741

852

963

After 2nd rotation(90-degree):

987

654

321

Now the player A has the maximum edge sum 24 (9 + 8 + 7). So player A is the winner of the game.

Example Input/Output 2:

Input:

5 15

Output:

B 115
*/
