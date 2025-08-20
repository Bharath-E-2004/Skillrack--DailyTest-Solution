import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrix = new int[N][2];

        for (int i = 0; i < N; i++) {
            int val = sc.nextInt();
            matrix[i][0] += val;
            matrix[i][1] += val;
        }

        for (int i = 0; i < N; i++) {
            if ((matrix[i][0] == 1 && matrix[i][1] == N) || (matrix[i][0]==0 && matrix[i][0] == N - 1)) {
                System.out.println(i+1);
                System.exit(0);
            }
        }
      System.out.println(-1);
    }
}
/*
The program must accept an integer matrix of size N°N containing only Os and 1s as the input. The program must find the value of X where X represents the position of a row and column in the matrix which contain Os in the Xth row and 1s in the xth column, expect the cell (X, X). Then the program must print the value of X as the output. If there is no such row and column, then the program must print -1 as the output.

Boundary Condition(s):

2 <= N <= 50

Input Format:

The first line contains N.

The next N lines contain an integer matrix of size N*N.

Output Format:

The first line contains the value of X or the first line contains -1.
*/
